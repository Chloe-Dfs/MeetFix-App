package com.example.testandroid;

import android.content.Context;
import android.widget.Button;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AjouterController {
/*
       private static final String FILE_NAME = "mesActivites.json";
       private List<ModeleAjouter> mesActivites;


    public AjouterController(Context context){
        this.context = context;
        this.mesActivites = chargerActivités();
    }


    private List<ModeleAjouter> chargerActivités(){
        try {
            File file = new File(context.getFilesDir(), FILE_NAME);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            FileReader reader = new FileReader(file);
            Type listeType = new TypeToken<List<ModeleAjouter>>() {}.getType();
            return new Gson().fromJson(reader, listeType);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void saveMesActivites(){
        try {
            File file = new File(context.getFilesDir(), FILE_NAME);
            FileWriter writer = new FileWriter(file);
            new Gson().toJson(mesActivites, writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ajouterMesActivites(ModeleAjouter mesAct){
        mesActivites.add(mesAct);
        saveMesActivites();

    }

    public List<ModeleAjouter> getMesActivites(){
        return mesActivites;
    }
*/

}
