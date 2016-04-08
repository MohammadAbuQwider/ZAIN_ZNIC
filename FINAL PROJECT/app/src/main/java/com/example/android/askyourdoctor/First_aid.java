package com.example.android.askyourdoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PublicKey;

public class First_aid extends AppCompatActivity {
    private Button d2;
    private Button d3;
    private Button d4;
    private Button d5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);


        d2 = (Button) findViewById(R.id.d2);
        d2.setOnClickListener(onclick);

        d3 = (Button) findViewById(R.id.d3);
        d3.setOnClickListener(onclick1);

        d4 = (Button) findViewById(R.id.d4);
        d4.setOnClickListener(onclick2);

        d5 = (Button) findViewById(R.id.d5);
        d5.setOnClickListener(onclick3);


    }

    public View.OnClickListener onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent nutrition = new Intent(First_aid.this, General_guidance.class);
            startActivity(nutrition);


        }
    };
    public View.OnClickListener onclick1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent nutrition = new Intent(First_aid.this, Heart_and_breathing_stopped.class);
            startActivity(nutrition);


        }
    };
    public View.OnClickListener onclick2 = new View.OnClickListener() {
        public void onClick(View v) {
            Intent ccc = new Intent(First_aid.this, Ventilator.class);
            startActivity(ccc);
        }

    };

    public View.OnClickListener onclick3 = new View.OnClickListener() {


        public void onClick(View v) {

            Intent ccc = new Intent(First_aid.this, Heart_massage.class);
            startActivity(ccc);

        }
    };
}

