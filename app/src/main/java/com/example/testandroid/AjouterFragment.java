package com.example.testandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.json.JSONArray;

public class AjouterFragment extends Fragment {

    private AjouterController ajouterController;
    private EditText NameText, DateText, CapacityLabel, DescText;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ajouter, container, false);

        NameText = view.findViewById(R.id.NameText);
        DateText = view.findViewById(R.id.DateText);
        CapacityLabel = view.findViewById(R.id.CapacityText);
        DescText = view.findViewById(R.id.DescText);
        ajouterController = new AjouterController();
        Button okBtn = view.findViewById(R.id.OkBtn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creerActivite();
                Toast.makeText(getContext(), "Une activité a été crée !", Toast.LENGTH_SHORT).show();
            }

        });

        return view;
    }
/*
    private void creerActivite(){
        String nom = NameText.getText().toString();
        String date = DateText.getText().toString();
        int capaciteMax = Integer.parseInt(CapacityLabel.getText().toString());
        String description = DescText.getText().toString();

        ModeleAjouter modAjou = new ModeleAjouter(nom, date, capaciteMax, description);
        ajouterController.ajouterMesActivites(modAjou);
    }

 */
}