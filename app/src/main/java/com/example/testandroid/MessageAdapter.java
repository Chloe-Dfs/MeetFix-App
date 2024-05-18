package com.example.testandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<String> {

    public MessageAdapter(Context context, List<String> message){
        super(context,0,message);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        String message = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_message, parent, false);
        }
        TextView textViewMessage = convertView.findViewById(R.id.textViewMessage);
        textViewMessage.setText(message);
        return convertView;
    }


}
