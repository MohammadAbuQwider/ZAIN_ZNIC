package com.example.android.askyourdoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Injection1 extends AppCompatActivity {

    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injection1);

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(clickButton);
    }

    public View.OnClickListener clickButton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent injType = new Intent(Injection1.this, Types_of_injections.class);
            startActivity(injType);

        }
    };
}
