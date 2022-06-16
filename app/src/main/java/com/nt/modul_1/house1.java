package com.nt.modul_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class house1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house1);
    }

    public void knopka3(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
