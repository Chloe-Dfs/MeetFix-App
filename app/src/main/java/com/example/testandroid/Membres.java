package com.example.testandroid;

import android.widget.ImageView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Membres {
    public String id;
    private String img;
    private String name;
    private String location;
    private int age;
    private ArrayList<String> passion = new ArrayList<>();

    public Membres(JSONObject objMembre) throws JSONException {
        this.id = objMembre.get("id").toString();
        this.img = objMembre.get("pic").toString();
        this.name = objMembre.get("nom").toString();
        this.location = objMembre.get("lieu").toString();
        this.age = objMembre.getInt("age");

        JSONArray mem = MainActivity.getUtilisateurs();
        for (int i = 0 ; i < mem.length(); i++) {
            this.passion.add(mem.get(i).toString());
        }
    }

    public String getId() {
        return id;
    }

    public String getImg() {return img; }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public int getAge() { return age; }

    public ArrayList<String> getPassion(){
        return passion;
    }

}
