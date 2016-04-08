package com.example.android.askyourdoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nutrition extends AppCompatActivity {

    private Button c2;
    private Button c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);


        c2 = (Button) findViewById(R.id.c2);
        c2.setOnClickListener(clickButoon);

        c3 = (Button) findViewById(R.id.c3);
        c3.setOnClickListener(clickButoon1);
    }


    public View.OnClickListener clickButoon = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent injection = new Intent(Nutrition.this, Types_of_nutrients.class);
            startActivity(injection);


        }
    };

    public View.OnClickListener clickButoon1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent nutrition = new Intent(Nutrition.this, Healthy_nutrition_guidance.class);
            startActivity(nutrition);

        }
    };
}
