package com.example.testandroid;

import android.view.MenuItem;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.squareup.picasso.Picasso;
import org.jetbrains.annotations.NotNull;

//classe Vue
public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new Controller(this);
        moveToFragment(new HomeFragment());
        controller.changeView();
        controller.ecouteursBtns();
        Picasso.setSingletonInstance(new Picasso.Builder(this).build());
    }

    //Méthode pour changer d'écran (de Fragment)
    public void moveToFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container_view,fragment).commit();
    }
}