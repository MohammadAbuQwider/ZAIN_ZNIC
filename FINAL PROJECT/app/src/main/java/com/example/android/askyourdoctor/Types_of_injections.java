package com.example.android.askyourdoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Types_of_injections extends AppCompatActivity {

    private Button b3;
    private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_injections);

        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(clickButton);


        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(clickButton1);
    }

    public View.OnClickListener clickButton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intravenous = new Intent(Types_of_injections.this, Intravenous.class);
            startActivity(intravenous);

        }
    };

    public View.OnClickListener clickButton1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent injShoulder = new Intent(Types_of_injections.this, Injection_in_the_shoulder.class);
            startActivity(injShoulder);


        }
    };
}
