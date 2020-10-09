package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class level1_Top2 extends AppCompatActivity {
    public String RightResponse="";
    public int[] Stock = new int[]{20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20};
    private int i = 0;
    Dialog words_panel;
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total_level_interface);



        ShowQustion();
        words_panel = new Dialog(this);
        words_panel.requestWindowFeature(Window.FEATURE_NO_TITLE);
        words_panel.setContentView(R.layout.words_panel);
        words_panel.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //words_panel.setCancelable(false);

        int[] words_panel_txvs = new int[]{R.id.textView91, R.id.textView10,
                R.id.textView11, R.id.textView12,
                R.id.textView13, R.id.textView14,
                R.id.textView15, R.id.textView16,
                R.id.textView17, R.id.textView18,
                R.id.textView19, R.id.textView20,
                R.id.textView21, R.id.textView22,
                R.id.textView23, R.id.textView24,
                R.id.textView25, R.id.textView26,
                R.id.textView27, R.id.textView28,
                R.id.textView29, R.id.textView30,
                R.id.textView31, R.id.textView32,
                R.id.textView33, R.id.textView34,
                R.id.textView35, R.id.textView36,
                R.id.textView37, R.id.textView38,
                R.id.textView39, R.id.textView40,
                R.id.textView41, R.id.textView42,
                R.id.textView43, R.id.textView44,
                R.id.textView45, R.id.textView46,
                R.id.textView47, R.id.textView48};
        int word = 0;
        int transfer = 0;
        for(int r=0;r<40; r++){
            TextView txvWordPanel =(TextView)words_panel.findViewById(words_panel_txvs[r]);
            if(r%2==0){
                int textnumber = word+1;
                txvWordPanel.setText(String.valueOf(textnumber + " "+ WordsArrays.level1_top2_words[word]) );
                word+=1;
            }else{
                txvWordPanel.setText(WordsArrays.level1_top2_transfers[transfer]);
                transfer+=1;
            }
        }
        Button btn_word_panel = (Button)findViewById(R.id.button4);
        btn_word_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                words_panel.show();

            }
        });

        Button btn_word_panel_close = (Button)words_panel.findViewById(R.id.btn_word_panel_close);
        btn_word_panel_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                words_panel.dismiss();
            }
        });
    }

    public void ShowQustion(){
        if(!RightResponse.equals("") && i!=20){
            try {
                Thread.sleep(1200);
            }catch (Exception e){};

        }
        try{
            if(i!=20){
                Button button2 = findViewById(R.id.button3);
                button2.setText(String.valueOf(i));
                int numRight = (int)(Math.random()*20);

            /*for(int j=0;j<Stock.length;j++){
                if(Stock[j]==numRight) {
                    numRight = (int) (Math.random() * 20);
                    j=0;
                }
            }*/
                int j=0;
                do{
                    if(Stock[j]==numRight) {
                        numRight = (int) (Math.random() * 20);
                        j=0;
                    }else{
                        j++;
                    }
                }while (j<Stock.length);



                RightResponse = WordsArrays.level1_top2_transfers[numRight];

                Stock[i] = numRight;

                mPlayer = MediaPlayer.create(this, WordsArrays.level1_top2_volums[numRight]);
                mPlayer.start();
                mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mPlayer.stop();
                    }
                });

                int num2 = (int)(Math.random()*20);
                while(num2 == numRight){
                    num2 = (int)(Math.random()*20);
                }

                int num3 = (int)(Math.random()*20);
                while(num3 == numRight || num3 ==num2 ){
                    num3 = (int)(Math.random()*20);
                }

                int num4 = (int)(Math.random()*20);
                while(num4 == numRight || num4 ==num2 || num4 == num3 ){
                    num4 = (int)(Math.random()*20);
                }

                int num5 = (int)(Math.random()*20);
                while(num5 == numRight || num5 ==num2 || num5 == num3 || num5 == num4){
                    num5 = (int)(Math.random()*20);
                }

                int[] TxvArray = new int[] {R.id.textView5, R.id.textView6, R.id.textView7, R.id.textView8, R.id.textView9};

                TextView LevelTextView = (TextView)findViewById(R.id.level1textview);
                LevelTextView.setText(WordsArrays.level1_top2_words[numRight]);

                int numTxv1 = (int)(Math.random()*5);
                int numTxv2 = (int)(Math.random()*5);
                while(numTxv2 == numTxv1){
                    numTxv2 = (int)(Math.random()*5);
                }
                int numTxv3 = (int)(Math.random()*5);
                while(numTxv3 == numTxv1 || numTxv3 == numTxv2){
                    numTxv3 = (int)(Math.random()*5);
                }

                int numTxv4 = (int)(Math.random()*5);
                while(numTxv4 == numTxv1 || numTxv4 == numTxv2 || numTxv4 == numTxv3){
                    numTxv4 = (int)(Math.random()*5);
                }

                int numTxv5 = (int)(Math.random()*5);
                while(numTxv5 == numTxv1 || numTxv5 == numTxv2 || numTxv5 == numTxv3 || numTxv5 == numTxv4){
                    numTxv5 = (int)(Math.random()*5);
                }

                TextView ResTvx1 = findViewById(TxvArray[numTxv1]);
                ResTvx1.setBackground(getResources().getDrawable(R.drawable.style_right_response));
                ResTvx1.setText(WordsArrays.level1_top2_transfers[numRight]);

                TextView ResTvx2 = findViewById(TxvArray[numTxv2]);
                ResTvx2.setBackground(getResources().getDrawable(R.drawable.style_wrong_response));
                ResTvx2.setText(WordsArrays.level1_top2_transfers[num2]);

                TextView ResTvx3 = findViewById(TxvArray[numTxv3]);
                ResTvx3.setBackground(getResources().getDrawable(R.drawable.style_wrong_response));
                ResTvx3.setText(WordsArrays.level1_top2_transfers[num3]);

                TextView ResTvx4 = findViewById(TxvArray[numTxv4]);
                ResTvx4.setBackground(getResources().getDrawable(R.drawable.style_wrong_response));
                ResTvx4.setText(WordsArrays.level1_top2_transfers[num4]);

                TextView ResTvx5 = findViewById(TxvArray[numTxv5]);
                ResTvx5.setBackground(getResources().getDrawable(R.drawable.style_wrong_response));
                ResTvx5.setText(WordsArrays.level1_top2_transfers[num5]);
            }
            else{
                TextView LevelTextView = (TextView)findViewById(R.id.level1textview);
                LevelTextView.setText("ВЫ победили!!!");
                Button button2 = findViewById(R.id.button3);
                button2.setText(String.valueOf(i));
                TextView ResTvx1 = findViewById(R.id.textView5);
                ResTvx1.setEnabled(false);
                TextView ResTvx2 = findViewById(R.id.textView6);
                ResTvx2.setEnabled(false);
                TextView ResTvx3 = findViewById(R.id.textView7);
                ResTvx3.setEnabled(false);
                TextView ResTvx4 = findViewById(R.id.textView8);
                ResTvx4.setEnabled(false);
                TextView ResTvx5 = findViewById(R.id.textView9);
                ResTvx5.setEnabled(false);
            }
        }catch (Exception e){

        }



    }

    public void onClickRespons(View view)  {
        TextView btn = (TextView)view;
        if(btn.getText().toString().equals(RightResponse)){
            i += 1;
        }
        ShowQustion();


    }

    public  void OnClickVolumButton(View view){
        mPlayer = MediaPlayer.create(this, WordsArrays.level1_top2_volums[Stock[i]]);
        if(mPlayer.isPlaying()){
            mPlayer.stop();
        }
        mPlayer.start();
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mPlayer.stop();
            }
        });
    }

    public void onClickButtonBack(View v){
        Intent intent = new Intent(this, level1_menu.class);
        startActivity(intent);
        finish();
    }
}