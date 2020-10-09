package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main_menu_levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_levels);
    }

    public void onClickLevelOneToLevel (View v) {
        Intent intent = new Intent(this, level1_menu.class);
        startActivity(intent);
        finish();
    }

    public void onClickLevelFifeToLevel (View v) {
        Intent intent = new Intent(this, level5_menu.class);
        startActivity(intent);
        finish();
    }
}