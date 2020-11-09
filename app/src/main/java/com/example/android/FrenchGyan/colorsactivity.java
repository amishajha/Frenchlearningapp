package com.example.android.FrenchGyan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.word;

import java.util.ArrayList;

public class colorsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorsactivity);
        ArrayList<word>words=new ArrayList<>();
        words.add(new word("Red","Rouge",R.drawable.color_red));
        words.add(new word("brown","Marron",R.drawable.color_brown));
        words.add(new word("Yellow","Jaune",R.drawable.color_mustard_yellow));
        words.add(new word("Green","Verte",R.drawable.color_green));
        words.add(new word("white"," Blanche",R.drawable.color_white));
        words.add(new word("gray", "Grise",R.drawable.color_gray));
        words.add(new word(" Black","Noire",R.drawable.color_black));
        words.add(new word(" Dusty yellow","jaune poussiéreux",R.drawable.color_dusty_yellow));

        int index=0;
        while(index<words.size()){
            wordadapter Adapter = new wordadapter(this, words,R.color.category_colors);

            ListView listView = (ListView) findViewById(R.id.list);

            assert listView != null;
            listView.setAdapter(Adapter);
            index++;
        }
    }
}