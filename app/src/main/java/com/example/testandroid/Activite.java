package com.example.testandroid;

import org.json.JSONException;
import org.json.JSONObject;

public class Activite {
    private final String id;
    private final String nom;
    private final String location;
    private final String jour;
    private final String heure;
    private final String duree;
    private final String idOrganisateur;
    private final int maxPersonnes;
    private final String description;
    private final String exigences;
    private final String aApporter;


    public Activite(JSONObject objActivite) throws JSONException {
        this.id = objActivite.get("id").toString();
        this.nom = objActivite.get("nom").toString();
        this.location = objActivite.get("lieu").toString();
        this.jour = objActivite.get("jour").toString();
        this.heure = objActivite.get("heure").toString();
        this.duree = objActivite.get("duree").toString();
        this.idOrganisateur = objActivite.get("id_organisateur").toString();
        this.maxPersonnes = objActivite.getInt("max_personnes");
        this.description = objActivite.get("description").toString();
        this.exigences = objActivite.get("exigences").toString();
        this.aApporter = objActivite.get("aApporter").toString();
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

    public String getJour() {
        return jour;
    }

    public String getHeure() {
        return heure;
    }

    public String getDuree() {
        return duree;
    }

    public String getIdOrganisateur() {
        return idOrganisateur;
    }

    public int getMaxPersonnes() {
        return maxPersonnes;
    }

    public String getDescription() {
        return description;
    }

    public String getExigences() {
        return exigences;
    }

    public String getaApporter() {
        return aApporter;
    }
}
