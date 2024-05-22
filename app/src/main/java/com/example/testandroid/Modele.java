package com.example.testandroid;


import org.json.JSONArray;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.List;

//classe Modele
public class Modele {

    private final List<Activite> activites; //liste activités Home
    private final List<Membres> membres; //liste membres Home

    public Modele() throws JSONException {

        // Home
        activites = new ArrayList<>();
        initActivite(); //ajouter activites à la liste
        membres = new ArrayList<>();
        initMembres(); // ajouter membres à la liste
        }

    //Liste des Activités - Home
    private void initActivite() throws JSONException {
        JSONArray act = MainActivity.getEvenements();
        for (int i = 0 ; i < act.length(); i++)
            activites.add(new Activite(act.getJSONObject(i)));
    }

    private void initMembres() throws JSONException {
        JSONArray mem = MainActivity.getUtilisateurs();
        for (int i = 0 ; i < mem.length(); i++) {
            membres.add(new Membres(mem.getJSONObject(i)));
        }
    }

    public List<Activite> getActivites() {
        return activites;
    }
    public List<Membres> getMembres() {
        return membres;
    }


}
