package com.example.testandroid;

import android.view.View;
import android.widget.Button;


public class HomeController {

    private HomeFragment homefragment;
    private Boolean isListDisplayed;
    private Button btnCartel;


    public HomeController(HomeFragment homefragment) {
        this.homefragment = homefragment;

    }

    public void initBtnCarteListe(Button btnCarteListe) {

        this.btnCartel = btnCarteListe;
        isListDisplayed = true;
    }


    public void btnCarteListeListener() {
        if (btnCartel != null){
            btnCartel.setOnClickListener(view -> {
                if (isListDisplayed){
                    homefragment.showCarte();
                } else {
                    homefragment.showListe();
                }
                isListDisplayed = !isListDisplayed;
            }) ;
        }



    }
}
