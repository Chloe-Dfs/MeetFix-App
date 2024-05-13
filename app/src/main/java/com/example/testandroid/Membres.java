package com.example.testandroid;

public class Membres {
    private String name;
    private String location;
    private String passion;

    public Membres(String name, String  location, String passion){
        this.name = name;
        this.location = location;
        this.passion = passion;
    }

    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public String getPassion(){
        return passion;
    }

}
