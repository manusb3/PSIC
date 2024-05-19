/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehab.Entities;

/**
 *
 * @author Dev_Me
 */
public enum MainOperationEnum {
    BookAppointment("Book your appointment", 1),
    ViewAppointments("View Appointments", 2);

    private String _description;
    private int _value;

    private MainOperationEnum(String description, int value) {
        this._description = description;
        this._value = value;
    }

    public String getDescription() {
        return _description;
    }
    
    public int getValue() {
        return _value;
    }
    
     public String getMenuDescription() {
        return String.format("%d. %s", this._value, this._description);
    }
}
