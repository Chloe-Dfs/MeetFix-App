package com.example.testandroid;


import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomnavigation.BottomNavigationView;

//classe controleur
public class Controller {

    private MainActivity activity;




    public Controller(MainActivity activity){
        this.activity = activity;
    }

    //Méthode pour changer le fragment en fonction du bouton choisi sur la barre de navigation en bas
    public void changeView(){
        BottomNavigationView bottomNavigationView = activity.findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener( item -> {
            switch (item.getItemId()) {
                case R.id.nav_rechercher:
                    activity.moveToFragment(new RechercherFragment());
                    break;
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
                case R.id.nav_notification:
                    activity.moveToFragment(new NotificationsFragment());
                    break;
                case R.id.nav_parametres:
                    activity.moveToFragment(new ParametresFragment());
            }
            return false;
        });
    }

    public void ecouteursBtns() {
        Button findBtn = activity.findViewById(R.id.nav_rechercher);
        Button notifBtn = activity.findViewById(R.id.nav_notification);
        Button parametresBtn = activity.findViewById(R.id.nav_parametres);

        findBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.moveToFragment(new RechercherFragment());
            }
        });

        notifBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.moveToFragment(new NotificationsFragment());
            }
        });

        parametresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.moveToFragment(new ParametresFragment());
            }
        });
    }
}
