package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class level1_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_level_menu);
    }

    public void onClickLevelOne(View view){
        Intent intent = new Intent(this, level1_Top1.class);
        startActivity(intent);
        finish();
    }

    public void onClickLevelTwo(View view){
        Intent intent = new Intent(this, level1_Top2.class);
        startActivity(intent);
        finish();
    }

    public void onClickButtonBack(View v){
        Intent intent = new Intent(this, main_menu_levels.class);
        startActivity(intent);
        finish();
    }
}