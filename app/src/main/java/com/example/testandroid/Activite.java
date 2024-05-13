package com.example.testandroid;

public class Activite {

    private String name;
    private String location;


    public Activite(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }
}
