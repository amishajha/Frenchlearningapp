package com.example.android.FrenchGyan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.word;

import java.util.ArrayList;

public class phrasesactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrasesactivity);
        ArrayList<word> words= new ArrayList<word>();
        words.add(new word("What is your name","Comment vousappelez-vous?"));
        words.add(new word("hello! How are you","salut comment allez-vous"));
        words.add(new word("Excuse me","Excusez-moi"));
        words.add(new word("I am sorry", "je suis désolé"));
        words.add(new word("What do you think","Qu'est-ce que tu penses"));
        words.add(new word("Thank you so much","Merci beaucoup"));
        words.add(new word("I really appreciate","J'apprécie beaucoup"));
        words.add(new word("I am learning french","J'apprends le français"));
        words.add(new word("I dont understand", "Je ne comprends pas"));
        words.add(new word("I like you", "je vous aime bien"));
        words.add(new word("where do you live","Où habitez-vous"));


        int index=0;
        while(index<words.size()){
            wordadapter Adapter = new wordadapter(this, words,R.color.category_phrases);

            ListView listView = (ListView) findViewById(R.id.list);

            assert listView != null;
            listView.setAdapter(Adapter);
            index++;
        }

    }
}