package com.example.testandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class FavorisFragment extends Fragment {
/*
    private AjouterController ajouterController;
    private static JSONArray mesActivites;

    private ArrayList<String> listActivite;
    private ArrayAdapter<String> adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_favoris, container, false);

        ajouterController = new AjouterController(getContext());
        ListView liste = view.findViewById(R.id.listeAct);
        listActivite = new ArrayList<>();

        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, listActivite);
        liste.setAdapter(adapter);

        chargerActivites();

        return view;
    }

    private void chargerActivites() {
        List<ModeleAjouter> activites = ajouterController.getMesActivites();
        for (ModeleAjouter activite : activites) {
            listActivite.add(activite.getNom() + " - " + activite.getDate());
        }
        adapter.notifyDataSetChanged();
    }
/*
    //Ajouter activites au json
    public void ajouterNewAct(String nom, String date, int capaciteMax, String description) {
        JSONObject newEvent = new JSONObject();
        try {
            newEvent.put("créateur", nom);
            newEvent.put("date", date);
            newEvent.put("capaciteMax", capaciteMax);
            newEvent.put("description", description);
            mesActivites.put(newEvent);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
*/
}