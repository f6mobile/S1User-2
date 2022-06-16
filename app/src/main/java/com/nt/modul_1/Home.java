package com.nt.modul_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void knopka4(View view) {
        Intent intent = new Intent(this, AddRoom.class);
        startActivity(intent);
    }
    public void knopka6(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}