package com.example.testandroid;


import android.util.JsonReader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

//classe Modele
public class Modele {

    //mettre toutes les données, les listes....
    private List<Activite> activites; //liste activités Home
    private List<Membres> membres; //liste membres Home

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
        for (int i = 0 ; i < act.length(); i++) {
            activites.add(new Activite(act.getJSONObject(i)));
        }

        /*
        Activite act1 = new Activite("Réparer Ordinateur", "Vannes" );
        Activite act2 = new Activite("Upcycling vêtement", "Auray");
        Activite act3 = new Activite("Recyclage cigarette", "Auray");
        Activite act4 = new Activite("Mécanique", "Vannes");

        activites.add(act1);
        activites.add(act2);
        activites.add(act3);
        activites.add(act4);*/
    }

    public List<Activite> getActivites() {
        return activites;
    }

    //Liste des Membres - Home
    private void initMembres() throws JSONException {
        JSONArray mem = MainActivity.getUtilisateurs();
        for (int i = 0 ; i < mem.length(); i++) {
            membres.add(new Membres(mem.getJSONObject(i)));
        }

        /*
        Membres mem1 = new Membres("testimg","Chloé",  "Vannes",24, "Bombarde, Musique, Manger");
        Membres mem2 = new Membres("ewen_img","Ewen",  "Centrale Paris",46, "Informatique, 3d");
        Membres mem3 = new Membres("","Jean",  "Concarneau",21, "Alchimie, Psychologie, Débat");
        Membres mem4 = new Membres("","Marius",  "Lanester",20, "Feur, Langues");
        Membres mem5 = new Membres("david","David",  "Baden",46, "Pêche, Musée, Jardinage");
        Membres mem6 = new Membres("pierre","Pierre",  "Lorient",38, "Bricolage, Sport, Cuisine");
        Membres mem7 = new Membres("anna","Anna",  "Vannes",22, "Mode, Lire, Loisir créatif");
        Membres mem8 = new Membres("magalie","Magalie",  "Vannes",45, "Tricoter, Jardiner, Théâtre");
        Membres mem9 = new Membres("andre","André",  "Vannes",62, "Informatique, Bricoler, Mécanique");
        Membres mem10 = new Membres("lea","Léa",  "32",19, "L'écologie, L'entraide, Peindre");

        Membres mem12 = new Membres("py","Paul-Yves",  "Pontivy",21, "Informatique, Réparation, Fête");
        Membres mem13 = new Membres("steph","Stéphanie",  "Sarzeau",40, "Upcycling, Les amis, Couture");
        Membres mem14 = new Membres("camille","Camille",  "Arradon",23, "Lire, Shopping, Musique");
        Membres mem15 = new Membres("fred","Fred",  "Crac'h",57, "Jeux de société, Les vieilles voitures, L'Histoire");
        Membres mem16 = new Membres("christophe","Christophe",  "Lanester",59, "Voyager, Bateau, Lire mon journal dans ma veranda");
        Membres mem17 = new Membres("marin","Marin",  "Vannes",30, "Naviguer, Surf, Randonner");

        membres.add(mem1);
        membres.add(mem2);
        membres.add(mem3);
        membres.add(mem4);
        membres.add(mem5);
        membres.add(mem6);
        membres.add(mem7);
        membres.add(mem8);
        membres.add(mem9);
        membres.add(mem10);

        membres.add(mem12);
        membres.add(mem13);
        membres.add(mem14);
        membres.add(mem15);
        membres.add(mem16);
        membres.add(mem17);*/

    }

    public List<Membres> getMembres() {
        return membres;
    }
}
