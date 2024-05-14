package com.example.testandroid;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


//classe Vue
public class MainActivity extends AppCompatActivity {
        private Controller controller;
        private Modele modele;
        private HomeController homeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new Controller(this);

        moveToFragment(new HomeFragment());
        controller.changeView();
        controller.ecouteursBtns();


    }

    //Méthode pour changer d'écran (de Fragment)
    public void moveToFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container_view,fragment).commit();
    }
}