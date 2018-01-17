package com.example.abhim.volley;

import android.content.Context;

/**
 * Created by abhim on 1/17/2018.
 */

public class Contact {

    int _id;
    String _name;
    String _country;

    public Contact(){

    }

    public Contact(int id, String name, String _country){
        this._id = id;
        this._name = name;
        this._country = _country;
    }

    public Contact(String name, String _country){
        this._name = name;
        this._country = _country;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_country() {
        return _country;
    }

    public void set_country(String _country) {
        this._country = _country;
    }
}
