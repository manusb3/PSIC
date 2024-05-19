/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehab;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rehab.Entities.Personnel;
import rehab.Entities.Physician;
import rehab.Entities.PhysicianExpertiseEnum;
import rehab.Entities.RoomEnum;
import rehab.Entities.Treatment;

/**
 *
 * @author manusb
 */
public class Seeder {

    public static List<Physician> Physicians = new ArrayList<>();
    public static List<Treatment> Treatments = new ArrayList<>();

    public static void Initialize() {
        //Creating combinations of expertise
        //As some physicians could have expertise in more than one area.
        List<PhysicianExpertiseEnum> typeOneExpertise = Arrays.asList(PhysicianExpertiseEnum.Osteopathy, PhysicianExpertiseEnum.Physiotherapy);
        List<PhysicianExpertiseEnum> typeTwoExpertise = Arrays.asList(PhysicianExpertiseEnum.Rehabilitation);
        List<PhysicianExpertiseEnum> typeThreeExpertise = Arrays.asList(PhysicianExpertiseEnum.Osteopathy);
        List<PhysicianExpertiseEnum> typeFourExpertise = Arrays.asList(PhysicianExpertiseEnum.Physiotherapy);

        //Adding physicianOne
        Physician physicianOne = new Physician(1, "Samuel J. Jackson", "Harlem", "012-220304032", 5, typeOneExpertise);
        Physicians.add(physicianOne);

        //Adding treatments provided by PhysicianOne 
        Treatments.add(new Treatment("Inversion Therapy", RoomEnum.SuiteB, physicianOne, PhysicianExpertiseEnum.Osteopathy, LocalDate.of(2021, 3, 20), LocalTime.of(15, 0), LocalTime.of(15, 30)));
        Treatments.add(new Treatment("Accupuncture", RoomEnum.SuiteA, physicianOne, PhysicianExpertiseEnum.Physiotherapy, LocalDate.of(2021, 3, 20), LocalTime.of(15, 0), LocalTime.of(15, 30)));

        //Addig PhysicianTwo
        Physicians.add(new Physician(2, "Bill Cosby", "Missisippi", "012-555-5553232", 10, typeTwoExpertise));

        //Addig PhysicianThree
        Physicians.add(new Physician(3, "Goenka Gatsby", "New Orleans", "012-555-5553233", 11, typeThreeExpertise));

        //Addig PhysicianFour
        Physicians.add(new Physician(4, "Chuck Norris", "Denver", "012-555-555000", 11, typeThreeExpertise));

        //Addig PhysicianFive
        Physician physicianFive = new Physician(5, "Jean Claude Van Damme", "Montana", "012-555-555002", 5, typeFourExpertise);
        Physicians.add(physicianFive);
        //Adding treatments provided by PhysicianFive
        Treatments.add(new Treatment("Accupuncture", RoomEnum.SuiteA, physicianFive, PhysicianExpertiseEnum.Physiotherapy, LocalDate.of(2021, 3, 20), LocalTime.of(16, 0), LocalTime.of(16, 30)));

    }

}
