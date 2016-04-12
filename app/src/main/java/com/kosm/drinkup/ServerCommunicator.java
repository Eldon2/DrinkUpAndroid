package com.kosm.drinkup;

import android.location.Location;
import android.os.AsyncTask;
import android.widget.Toast;

import java.net.URL;

/**
 * Created by kosm on 4/12/16.
 */
public class ServerCommunicator extends AsyncTask<URL, Void, Void> {
    @Override
    protected Void doInBackground(URL... params) {
        return null;
    }

    public void getData(){

    }
    public void postLocation(Location myLocation){
    }
}
