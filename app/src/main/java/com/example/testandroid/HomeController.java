package com.example.testandroid;

import android.view.View;


public class HomeController {

    private HomeFragment view;
    private boolean isListDisplayed = true;

    public HomeController(HomeFragment view) {
        this.view = view;
        initListeners();
    }

    private void initListeners() {
        // Ajoutez ici les écouteurs d'événements, comme le clic sur le bouton
        view.getBtnCarteListe().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeTxtBtn(); // Appel à une méthode pour basculer entre la liste et la carte
            }
        });
    }

    // changer txt et utilité btn carte/liste
    public void changeTxtBtn() {

        if (isListDisplayed) {
            view.showCarte(); // Méthode dans HomeFragment pour afficher la carte
            isListDisplayed = false;
        } else {
            view.showListe(); // Méthode dans HomeFragment pour afficher la liste
            isListDisplayed = true;
        }



    }
}
