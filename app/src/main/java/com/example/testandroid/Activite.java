package com.example.testandroid;

import org.json.JSONException;
import org.json.JSONObject;

public class Activite {
    private final String id;
    private final String nom;
    private final String location;


    public Activite(JSONObject objActivite) throws JSONException {
        this.id = objActivite.get("id").toString();
        this.nom = objActivite.get("nom").toString();
        this.location = objActivite.get("lieu").toString();
    }

    public Activite(String id, String name, String loc, int capac, String desc){
        this.id = id;
        this.nom = name;
        this.location = loc;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getLocation() {
        return location;
    }
}
