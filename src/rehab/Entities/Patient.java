/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehab.Entities;

/**
 * The entity for Patient.
 *
 * @author manusb
 */
public class Patient extends Personnel {

    public Patient(int id, String name, String address, String telephoneNo) {
        super(id, name, address, telephoneNo);
    }

}
