package com.example.testandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MessagerieFragment extends Fragment {

    private ListView listViewMsg;
    private EditText editTextMsg;
    private Button buttonEnvoyer;
    private ArrayList<String> messages;
    private MessageAdapter adapter;




    public MessagerieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_messagerie, container, false);

        listViewMsg = view.findViewById(R.id.list_msg);
        editTextMsg = view.findViewById(R.id.txt_msg);
        buttonEnvoyer = view.findViewById(R.id.btn_envoyer);

        messages = new ArrayList<>();
        adapter = new MessageAdapter(getContext(), messages);
        listViewMsg.setAdapter(adapter);

        buttonEnvoyer.setOnClickListener(v -> {
            String message = editTextMsg.getText().toString().trim();
            if (!message.isEmpty()) {
                messages.add(message);
                adapter.notifyDataSetChanged();
                editTextMsg.setText("");
                listViewMsg.smoothScrollToPosition(messages.size() - 1); // Scroll dernier message
            }
        });

        return view;
    }
}