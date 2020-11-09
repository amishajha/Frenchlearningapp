package com.example.android.FrenchGyan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.word;

import java.util.ArrayList;

public class familyactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familyactivity);
        ArrayList<word> words= new ArrayList<word>();
        words.add(new word("mom","maman",R.drawable.family_mother));
        words.add(new word("dad","papa",R.drawable.family_father));
        words.add(new word("brother","frère",R.drawable.family_son));
        words.add(new word("Sister","sœur",R.drawable.family_daughter));
        words.add(new word("oldersister", "sœur aînée",R.drawable.family_older_sister));
        words.add(new word("olderbrother", "tante",R.drawable.family_older_brother));
        words.add(new word("grandfather", "grand-père",R.drawable.family_grandfather));
        words.add(new word("grandmother","grand-mère",R.drawable.family_grandmother));

        int index=0;
        while(index<words.size()){
            wordadapter Adapter = new wordadapter(this, words,R.color.category_family);

            ListView listView = (ListView) findViewById(R.id.list);

            assert listView != null;
            listView.setAdapter(Adapter);
            index++;
        }

    }
}