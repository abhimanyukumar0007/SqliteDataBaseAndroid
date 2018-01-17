package com.example.abhim.volley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataBaseHandler dataBaseHandler = new DataBaseHandler(this);
        Log.d("Insert: ", "Inserting ..");
        dataBaseHandler.addContact(new Contact("Ravi", "India"));
        dataBaseHandler.addContact(new Contact("Srinivas", "Japan"));
        dataBaseHandler.addContact(new Contact("Tommy", "Korea"));
        dataBaseHandler.addContact(new Contact("Karthik", "India"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = dataBaseHandler.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: "+cn.get_id()+" ,Name: " + cn.get_name() + " ,Country: " + cn.get_country();
            // Writing Contacts to log
            Log.d("Name: ", log);
    }
        Toast.makeText(this,"Sqlite table created",Toast.LENGTH_LONG).show();
    }
}
