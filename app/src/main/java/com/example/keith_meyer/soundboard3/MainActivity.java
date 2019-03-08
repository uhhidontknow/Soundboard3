package com.example.keith_meyer.soundboard3;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private View bg;
    private Button n1, n2, n3, n4, n5, n6, n7, n8, n9;

    private EditText inText;
    private TextView outText;
    private MediaPlayer mp;
    private Button s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg = findViewById(R.id.theBG);
        n1 = findViewById(R.id.noise1);
        n2 = findViewById(R.id.noise2);
        s = findViewById(R.id.stopButton);
        n3 = findViewById(R.id.noise3);
        n4 = findViewById(R.id.noise4);
        n5 = findViewById(R.id.noise5);
        n6 = findViewById(R.id.noise6);



        s.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                makeItStop();
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                bear();
            }
        } );

        n2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                siren();
            }
        });
        n3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ree();
            }
        });
        n4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                r2d2();
            }
        });
        n5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                hyenaCackle();
            }
        });
        n6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sub();
            }
        });




    }
    public void bear() {
        mp = MediaPlayer.create(this, R.raw.bear);
        mp.start();
    }
    public void siren() {
        mp = MediaPlayer.create(this, R.raw.siren);
        mp.start();
    }
    public void ree(){
        mp = MediaPlayer.create(this, R.raw.ree);
        mp.start();
    }
    public void r2d2(){
        mp = MediaPlayer.create(this, R.raw.r2d2);
        mp.start();
    }
    public void hyenaCackle(){
        mp = MediaPlayer.create(this, R.raw.hyena);
        mp.start();
    }
    public void sub(){
        mp = MediaPlayer.create(this, R.raw.submarine);
        mp.start();
    }
    public void makeItStop(){
        mp.pause();
    }

    
}
