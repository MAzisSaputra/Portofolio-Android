package com.bwastudio.bwapertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // function notifikasi
        Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }
}
