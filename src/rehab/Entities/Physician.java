/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehab.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manusb
 */
public class Physician extends Personnel {

    double _consultationHours;
    List<PhysicianExpertiseEnum> _personnelExpertiseCollection;

    public Physician(int id, String name, String address, String telephoneNo, double consultationHours) {
        super(id, name, address, telephoneNo);
        this._consultationHours = consultationHours;
    }

    //overloading constructor for now
    public Physician(int id, String name, String address, String telephoneNo, double consultationHours, List<PhysicianExpertiseEnum> personnelExpertiseCollection) {
        super(id, name, address, telephoneNo);
        this._consultationHours = consultationHours;
        this._personnelExpertiseCollection = personnelExpertiseCollection;

    }

    public void addPersonnelExpertise(PhysicianExpertiseEnum personnelExpertise) {
        if (this._personnelExpertiseCollection == null) {
            this._personnelExpertiseCollection = new ArrayList<>();
        }
        this._personnelExpertiseCollection.add(personnelExpertise);
    }

    public List<PhysicianExpertiseEnum> getPersonnelExpertise() {
        return this._personnelExpertiseCollection;
    }

    public String getAppointments() {
        return "";
    }
}
