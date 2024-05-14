package com.example.testandroid;


import java.util.ArrayList;
import java.util.List;

//classe Modele
public class Modele {

    //mettre toutes les données et méthodes, les listes....
    private List<Activite> activites;
    private List<Membres> membres;
    public Modele(){
        activites = new ArrayList<>();
        initActivite(); //ajouter activites à la liste
        membres = new ArrayList<>();
        initMembres(); // ajouter membres à la liste
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

    private void initMembres(){
        Membres mem1 = new Membres("testimg","Chloé", "Karpa_Dor", "Vannes",24, "Musique");
        Membres mem2 = new Membres("karpatest","Fusée", "Fuze", "Crous",3, "Manger et Dormir");
        Membres mem3 = new Membres("","Théo", "LuffyVanquish", "Lorient",23, "Bosser les TP");

        membres.add(mem1);
        membres.add(mem2);
        membres.add(mem3);

    }
    public List<Membres> getMembres() {
        return membres;
    }
}
