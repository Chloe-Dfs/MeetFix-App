package com.example.testandroid;

import android.widget.ImageView;

public class Membres {
    private String img;
    private String name;
    private String surname;
    private String location;
    private Integer age;
    private String passion;

    public Membres(String img, String name, String  location,Integer age, String passion){
        this.img = img;
        this.name = name;
        //this.surname = surname;
        this.location = location;
        this.age = age;
        this.passion = passion;
    }

    public String getImg() {return img; }

    public String getName(){
        return name;
    }
    //public String getSurname() { return surname; }
    public String getLocation(){
        return location;
    }

    public Integer getAge() { return age; }

    public String getPassion(){
        return passion;
    }

}
