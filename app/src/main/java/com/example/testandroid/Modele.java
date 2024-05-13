package com.example.testandroid;


import java.util.ArrayList;
import java.util.List;

//classe Modele
public class Modele {

    //mettre toutes les données et méthodes, les listes....
    private List<Activite> activites;
    public Modele(){
        activites = new ArrayList<>();
        initActivite(); //ajouter activites à la liste
    }

    private void initActivite(){
        Activite act1 = new Activite("Réparer Ordinateur", "Vannes" );
        Activite act2 = new Activite("Upcycling vêtement", "Auray");

        activites.add(act1);
        activites.add(act2);
    }

    public List<Activite> getActivites() {
        return activites;
    }
}
