
package com.example.android.FrenchGyan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, numbersactivity.class);
                startActivity(numbersIntent);
            }

        });

        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, familyactivity.class);
                startActivity(numbersIntent);
            }

        });
        TextView colors = (TextView) findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, colorsactivity.class);
                startActivity(numbersIntent);
            }

        });


        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, phrasesactivity.class);
                startActivity(numbersIntent);
            }

        });

    }

}
