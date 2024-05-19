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
public class Personnel {

    int _id;
    String _name;
    String _address;
    String _telephoneNo;

    public Personnel(int id, String name, String address, String telephoneNo) {
        this._id = id;
        this._name = name;
        this._address = address;
        this._telephoneNo = telephoneNo;
    }

    //returns physician contact details
    public String getPersonnelDetails() {
        return String.format("%s, %s, %s", this._name, this._address, this._telephoneNo);
    }
}
