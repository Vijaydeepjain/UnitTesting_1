package com.example.unittesting_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView preferred_language;
        Button english;
        Button german;
        Button French;
        Button hindi;
        Button urdu;
        Button secondpage;
        preferred_language=findViewById(R.id.preferred_language);
        english=findViewById(R.id.english);
        german=findViewById(R.id.german);
        French=findViewById(R.id.french);
        hindi=findViewById(R.id.hindi);
        urdu=findViewById(R.id.urdu);
        secondpage=findViewById(R.id.buttonfrommaintosec);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preferred_language.setText("english");
            }
        });
        german.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preferred_language.setText("german");
            }
        });
        secondpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });



    }
}