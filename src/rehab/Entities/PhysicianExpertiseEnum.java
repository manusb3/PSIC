/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehab.Entities;

/**
 * Enumerator entity for Expertise
 *
 * @author manusb
 */
public enum PhysicianExpertiseEnum {
    //Acupuncture("Acupuncture Therapy", 1),
    //MassageTherapy("Massage and Soft Tissue Therapy", 2),
    //Mobilisation(3),
    //InversionTherapy("Inversion Therapy", 5),
    
    Physiotherapy(1),
    Osteopathy(2),
    Rehabilitation(3),
    ReturnToBookingMenu("Return to Booking menu", 0);

    private String _description;
    private int _value;

    private PhysicianExpertiseEnum(int value) {
        this._value = value;
    }

    private PhysicianExpertiseEnum(String description, int value) {
        this._value = value;
        this._description = description;
    }

    public int getValue() {
        return _value;
    }

    public String getMenuDescription() {
        if (this._description == null) {
            //if we haven't explicitly assigned the 'Description' property, 
            // just get the enum member name
            this._description = this.toString();
        }
        return String.format("%d. %s", this.getValue(), this._description);
    }

}
