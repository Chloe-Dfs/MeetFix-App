package com.example.testandroid;


import android.annotation.SuppressLint;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

//classe controleur
public class Controller {

    private final MainActivity activity;
    public Controller(MainActivity activity){

        this.activity = activity;
    }

    //Ecran Home à l'ouverture de l'app
    public void openAppView() {
        activity.moveToFragment(new HomeFragment());
    }

    //Méthode pour changer le fragment en fonction du bouton choisi sur la barre de navigation en bas
    @SuppressLint("NonConstantResourceId")
    public void changeViewBottomNav(){
        BottomNavigationView bottomNavigationView = activity.findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener( item -> {
            switch (item.getItemId()) {

                case R.id.nav_favoris:
                    activity.moveToFragment(new FavorisFragment());
                    break;
                case R.id.nav_ajouter:
                    activity.moveToFragment(new AjouterFragment());
                    break;
                case R.id.nav_messagerie:
                    activity.moveToFragment(new MessagerieFragment());
                    break;

                case R.id.nav_profil:
                    activity.moveToFragment(new ProfilFragment());
                    break;
                case R.id.nav_home:
                    activity.moveToFragment(new HomeFragment());
                    break;
            }
            return false;
        });
    }

    @SuppressLint("NonConstantResourceId")
    public boolean changeViewBtnToolbar(MenuItem item){
       switch (item.getItemId()){
           case R.id.nav_rechercher:
               activity.moveToFragment(new RechercherFragment());
               return true;
           case R.id.nav_favoris:
               activity.moveToFragment(new FavorisFragment());
               return true;
           case R.id.nav_retour:
               activity.moveToFragment(new HomeFragment());
               return true;
           case R.id.nav_notification:
               activity.moveToFragment(new DetailsActiviteFragment());
               return true;

       } return false;

    }

    public int getMenuIdCurrentFragment() {
        Fragment currentFrag = activity.getSupportFragmentManager().findFragmentById(R.id.container_view);
        if (currentFrag instanceof HomeFragment){
            return R.menu.top_home_menu;
        } else if (currentFrag instanceof MessagerieFragment){
            return R.menu.top_messagerie_menu;
        } return R.menu.top_home_menu;
    }



}