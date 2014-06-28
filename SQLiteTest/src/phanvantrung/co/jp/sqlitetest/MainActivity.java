package phanvantrung.co.jp.sqlitetest;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	         
	        DatabaseHandler db = new DatabaseHandler(this);
	         
	        /**
	         * CRUD Operations
	         * */
	        // Inserting Contacts
	        Log.d("Insert: ", "Inserting .."); 
	        db.addContact(new Contact("Ravi", "9100000000"));        
	        db.addContact(new Contact("Srinivas", "9199999999"));
	        db.addContact(new Contact("Tommy", "9522222222"));
	        db.addContact(new Contact("Karthik", "9533333333"));
	         
	        // Reading all contacts
	        Log.d("Reading: ", "Reading all contacts.."); 
	        List<Contact> contacts = db.getAllContacts();       
	         
	        for (Contact cn : contacts) {
	            String log = "Id: "+cn.get_id()+" ,Name: " + cn.get_name() + " ,Phone: " + cn.get_phone_number();
	                // Writing Contacts to log
	        Log.d("Name: ", log);
	    }
	    }

}
