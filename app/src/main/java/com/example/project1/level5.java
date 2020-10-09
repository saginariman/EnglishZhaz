package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class level5 extends AppCompatActivity {

    VideoView videoPlayer;
    MediaController mediaController;
    int[] secondsOfSubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level5_interface);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        secondsOfSubs = new int[]{1,3,5,6,8,11,14,15,18,20,22,23,25,26,28,30,31};
        long Time = System.currentTimeMillis();
        videoPlayer =  (VideoView)findViewById(R.id.videoPlayer);
        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.gu);
        videoPlayer.setVideoURI(myVideoUri);
        try {
            mediaController = new MediaController(this);
            videoPlayer.setMediaController(mediaController);
            mediaController.setAnchorView(videoPlayer);
        }catch (Exception e){

        }

        videoPlayer.start();

        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(new MyAdapter(getSupportFragmentManager()));
    }

    public void onClickButtonBack (View v) {
        Intent intent = new Intent(this, level5_menu.class);
        startActivity(intent);
        finish();
        /*Button  btnBack = (Button)findViewById(R.id.button2);
        btnBack.setText(String.valueOf(videoPlayer.getCurrentPosition()));*/
    }
}