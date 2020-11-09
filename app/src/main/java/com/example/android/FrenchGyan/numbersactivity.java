package com.example.android.FrenchGyan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.word;

import java.util.ArrayList;

public class numbersactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_item);
      ArrayList<word> words= new ArrayList<word>();
      //  words.add(new word("one","un"));
        //words.add(new word("two","deux"));
        //words.add(new word("three","trois"));
        //words.add(new word("four","quatre"));
       // words.add(new word("five","cinq"));
        //words.add(new word("six","six"));
        //words.add(new word("seven","sept"));
        //words.add(new word("eight","huit"));
        //words.add(new word("nine","nuef"));
        //words.add(new word("ten","dix"));

        words.add(new word("one","un",R.drawable.number_one));
    words.add(new word("two","deux",R.drawable.number_two));
    words.add(new word("three","trois",R.drawable.number_three));
    words.add(new word("four","quatre",R.drawable.number_four));
    words.add(new word("five","cinq",R.drawable.number_five));
    words.add(new word("six","six",R.drawable.number_six));
    words.add(new word("seven","sept",R.drawable.number_seven));
    words.add(new word("eight","huit",R.drawable.number_eight));
    words.add(new word("nine","nuef",R.drawable.number_nine));
    words.add(new word("ten","dix",R.drawable.number_ten));


        int index=0;
        while(index<words.size()){
        wordadapter Adapter = new wordadapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

            assert listView != null;
            listView.setAdapter(Adapter);
        index++;
    }
    }
}