package com.example.android.askyourdoctor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound;

   /* @Override
    protected void onPause() {
        super.onPause();
        mySound.release();
    }*/

    private Button b1;
    private Button c1;
    private Button d1;
   // private Button web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mySound = MediaPlayer.create(this, R.raw.sleep);

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(clickButoon);

        c1 = (Button) findViewById(R.id.c1);
        c1.setOnClickListener(clickButoon1);

        d1 = (Button) findViewById(R.id.d1);
        d1.setOnClickListener(clickButoon2);

Button btn=(Button)findViewById(R.id.web);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="http://www.altibbi.com/ask-question/choose";
               Intent tt=new Intent(Intent.ACTION_VIEW);
                tt.setData(Uri.parse(url));
                startActivity(tt);
                Toast.makeText(getBaseContext(), "By Mohammed Abu Qwider", Toast.LENGTH_LONG).show();

            }
        });

    }


    public void playMusic(View v) {
        mySound.start();
        Toast.makeText(getBaseContext(), "By Mohammed Abu Qwider", Toast.LENGTH_LONG).show();
    }

    public View.OnClickListener clickButoon =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent injection = new Intent(MainActivity.this, Injection1.class);
                    startActivity(injection);
                 //   Toast.makeText(getBaseContext(), "الحقنة", Toast.LENGTH_LONG).show();


                }
            };

    public View.OnClickListener clickButoon1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent nutrition = new Intent(MainActivity.this, Nutrition.class);
            startActivity(nutrition);
            Toast.makeText(getBaseContext(), "التغذية", Toast.LENGTH_LONG).show();


        }
    };

    public View.OnClickListener clickButoon2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent nutrition = new Intent(MainActivity.this, First_aid.class);
            startActivity(nutrition);

            Toast.makeText(getBaseContext(), "اسعاف اولي", Toast.LENGTH_LONG).show();



        }
    };

}
