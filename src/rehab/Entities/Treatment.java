/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehab.Entities;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * TODO: could extract the Treatment entity and potentially add another entity
 * for Schedule
 *
 * @author manusb
 */
public class Treatment {

    String _name; //The treatment name (eg: Accupuncture)
    RoomEnum _room; //The room name
    private Physician _physician; // The physician
    private PhysicianExpertiseEnum _physicianExpertise; // As the treatment would come under a certain expertise/ specialization.
    LocalDate _date; //The treatment date
    LocalTime _startTime;
    LocalTime _endTime;

    //To hydrate the treatment entity
    public Treatment(String name,
            RoomEnum room,
            Physician physician,
            PhysicianExpertiseEnum physicianExpertise,
            LocalDate date,
            LocalTime startTime,
            LocalTime endTime) {

        this._name = name;
        this._physician = physician;
        this._physicianExpertise = physicianExpertise;
        this._date = date;
        this._startTime = startTime;
        this._endTime = endTime;

    }

    public Physician getPhysician() {
        return this._physician;
    }

    public PhysicianExpertiseEnum getPhysicianExpertise() {
        return this._physicianExpertise;
    }

    public String getMenuDescription() {
        //Physician     Expertise       Treatment       Date        TimeSlot 
        return String.format("%s                %s                %s                %s                %s",
                this.getPhysician()._name,
                this.getPhysicianExpertise().toString(),
                this._name,
                this._date,
                this._startTime + " - " + this._endTime
        );
    }

}
