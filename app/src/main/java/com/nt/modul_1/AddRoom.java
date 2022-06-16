package com.nt.modul_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
    }

    public void knopka5(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void knopka7(View view) {
        Intent intent = new Intent(this, Kitchen.class);
        startActivity(intent);
    }
}