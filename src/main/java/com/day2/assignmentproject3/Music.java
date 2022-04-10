package com.day2.assignmentproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Music extends AppCompatActivity {
    ToggleButton t1,t2,t3;

    MediaPlayer mp1,mp2,mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        t1=findViewById(R.id.A1);
        t2=findViewById(R.id.A2);
        t3=findViewById(R.id.A3);
        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b  ){

                mp1=new MediaPlayer().create(Music.this,R.raw.om);
                mp1.start();
                }else{
                 mp1.stop();
                }
            }
        });
        t2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b  ){

                    mp2=new MediaPlayer().create(Music.this,R.raw.s);
                    mp2.start();
                }else{


                        mp2.stop();

                }
            }
        });

    t3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(b){
                mp3=new MediaPlayer().create(Music.this,R.raw.ze);
            mp3.start();
            }else{
                mp3.stop();
            }
        }
    });

    }
}