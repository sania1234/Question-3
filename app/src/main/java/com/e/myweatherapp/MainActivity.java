package com.e.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    class weather extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {/;l.lo0m ju7hb gt5d
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
