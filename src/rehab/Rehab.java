/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehab;

import java.util.List;
import rehab.Entities.Personnel;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import rehab.Entities.BookOperationEnum;
import rehab.Entities.MainOperationEnum;
import rehab.Entities.PhysicianExpertiseEnum;
import java.util.stream.Collectors;
import rehab.Entities.Physician;
import rehab.Entities.Treatment;
import rehab.Helpers.ConsoleHelper;

/**
 *
 * @author manusb
 */
public class Rehab {

    private static Scanner _scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Seeding initial data
        Seeder.Initialize();

        int input = RenderMainMenu();

        if (input == MainOperationEnum.BookAppointment.getValue()) {
            
            //View Book Apointment Menu
            input = RenderBookAppointment();

            //View By Expertise
            if (input == BookOperationEnum.ViewSpecialities.getValue()) {

                input = RenderAllExpertiseMenu();

                //Retrieve Treatments By Expertise
                RenderTreatmentMenuByExpertise(input);

            } else if (input == BookOperationEnum.ViewPhysicians.getValue()) {

                //Viewing Physician Details
                for (Personnel physician : Seeder.Physicians) {
                    System.out.println(physician.getPersonnelDetails());
                }
            }

        } //View all appointments
        else if (input == MainOperationEnum.ViewAppointments.getValue()) {
        }

    }

    /**
     * Printing out the Main Menu
     *
     * @return
     */
    private static int RenderMainMenu() {
        try {
            String mainMenuContent = String.format("Menu\n%s\n%s\nSelect your option",
                    MainOperationEnum.BookAppointment.getMenuDescription(),
                    MainOperationEnum.ViewAppointments.getMenuDescription());
            System.out.println(ConsoleHelper.AddBorder(mainMenuContent));
            return _scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    /**
     * Printing out the Booking Menu
     *
     * @return
     */
    private static int RenderBookAppointment() {
        try {
            String bookMenuContent = String.format("\nBook an appointment\nConsult your doctor at the hospital\n%s\n%s\n%s",
                    BookOperationEnum.ViewSpecialities.getMenuDescription(),
                    BookOperationEnum.ViewPhysicians.getMenuDescription(),
                    BookOperationEnum.ReturnToMainMenu.getMenuDescription());

            System.out.println(bookMenuContent);
            return _scanner.nextInt();

        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    /**
     * Prints out Expertise
     *
     * @return
     */
    private static int RenderAllExpertiseMenu() {
        try {
            System.out.println(ConsoleHelper.AddBorder("Choose a speciality"));
            for (PhysicianExpertiseEnum speciality : PhysicianExpertiseEnum.values()) {
                System.out.println(speciality.getMenuDescription());
            }
            ConsoleHelper.AddTopBorder();
            return _scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    /**
     * @return
     */
    private static int RenderTreatmentMenuByExpertise(int expertise) {
        try {
            //Display physicians based on the user input
            List<Treatment> filteredTreatments;
            filteredTreatments = Seeder.Treatments.stream().filter(treatment
                    -> treatment.getPhysicianExpertise().getValue() == expertise
            ).collect(Collectors.toList());

            ConsoleHelper.AddTopBorder();
            for (Treatment filteredTreatment : filteredTreatments) {

                //Viewing details
                //***********************************************
                //Physician     Expertise       Treatment       Date        TimeSlot
                //***********************************************
                System.out.println(filteredTreatment.getMenuDescription());
            }
            ConsoleHelper.AddTopBorder();
            return _scanner.nextInt();

        } catch (Exception e) {
            return -1;
        }

    }

}
