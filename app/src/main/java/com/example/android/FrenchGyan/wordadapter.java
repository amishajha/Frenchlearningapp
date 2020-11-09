package com.example.android.FrenchGyan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.word;

import java.util.ArrayList;

public class wordadapter extends ArrayAdapter<word> {
    private int mcolorresourceid;


    public wordadapter(@NonNull Context context, ArrayList<word>words,int colorresourceid) {

        super(context,0,words);
        mcolorresourceid=colorresourceid;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
      word currentword = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView frenchgyan= (TextView) listItemView.findViewById(R.id.frenchgyan_Text_View);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        frenchgyan.setText(currentword.getMfrenchtranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultextview = (TextView) listItemView.findViewById(R.id.default_Text_View);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
       defaultextview.setText(currentword.getMdefaulttranslation());

        ImageView imageview=(ImageView) listItemView.findViewById(R.id.image);
        if(currentword.hasimage()){
            imageview.setImageResource(currentword.getMresourceid());
            imageview.setVisibility(View.VISIBLE);

        }
        else{
            imageview.setVisibility(View.GONE);
        }
        View textContainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mcolorresourceid);
        textContainer.setBackgroundColor(color);


        // Find the ImageView in the list_item.xml layout with the ID list_item_icon

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
