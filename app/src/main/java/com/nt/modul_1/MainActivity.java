package com.nt.modul_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void knopka1(View view) {
        Intent intent = new Intent(this, house1.class);
        startActivity(intent);
    }

    public void knopka3(View view) {
    }

    public void knopka2(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void knopka4(View view) {
    }
    public void knopka5(View view) {
    }
    public void knopka6(View view) {
    }
    public void knopka7(View view) {
    }
}
