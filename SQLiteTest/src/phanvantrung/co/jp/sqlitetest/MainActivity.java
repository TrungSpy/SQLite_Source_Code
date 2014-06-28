package phanvantrung.co.jp.sqlitetest;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

/**
 * @version 1.0 
 * @author PhanVanTrung
 *
 */
public class MainActivity extends Activity {

	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	         
	        DatabaseHandler db = new DatabaseHandler(this);
	       
	        // Inserting Contacts
	        Log.d("Insert: ", "Inserting .."); 
	        db.addContact(new Contact("Phan", "9100000000"));        
	        db.addContact(new Contact("Yokota", "9199999999"));
	        db.addContact(new Contact("John", "9522222222"));
	        db.addContact(new Contact("Mark", "9533333333"));
	         
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
