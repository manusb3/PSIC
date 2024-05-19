/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehab.Entities;

/**
 * Enumerator for the Booking operation TODO: Sort out the name disparity =>
 * Physician/Personnel
 *
 * @author Dev_Me
 */
public enum BookOperationEnum {
    ViewSpecialities("View Specialities", 1),
    ViewPhysicians("View Physicians", 2),
    ReturnToMainMenu("Return to Main menu", 0);

    private String _description;
    private int _value;

    private BookOperationEnum(String description, int value) {
        this._description = description;
        this._value = value;
    }

    public String getDescription() {
        return this._description;
    }

    public int getValue() {
        return _value;
    }

    public String getMenuDescription() {
        return String.format("%d. %s", this._value, this._description);
    }
}
