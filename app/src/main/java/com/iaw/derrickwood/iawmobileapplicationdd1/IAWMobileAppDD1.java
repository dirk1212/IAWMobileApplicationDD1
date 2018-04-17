package com.iaw.derrickwood.iawmobileapplicationdd1;

import java.util.Set;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class IAWMobileAppDD1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iawmobile_app_dd1);

        Toast.makeText(this, "Loading application",
                Toast.LENGTH_SHORT).show();
        Log.i("info", "Done loading the app");
    }

    public void wordInput (View v) {
        Toast.makeText(this, "User Input", Toast.LENGTH_SHORT) .show();
        Log.i("info", "The user clicked the top button");

        // Declare and initialize a new Intent object called collectionIntent
        Intent collectionIntent = new Intent(this,wordCollection.class);
        // Switch to the Word Collection Activity
        startActivity(collectionIntent);
    }

    public void wallSync(View v){
        Toast.makeText(this, "Wall Sync", Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the bottom button");

        // Declare and initialize a new Intent object called syncIntent
        Intent syncIntent = new Intent(this,deviceList.class);
        // Switch to the Word Collection Activity
        startActivity(syncIntent);
    }
    
}
