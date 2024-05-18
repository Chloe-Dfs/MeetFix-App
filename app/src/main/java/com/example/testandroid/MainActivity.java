package com.example.testandroid;


import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


//classe Vue
public class MainActivity extends AppCompatActivity {
        private Controller controller;
        private Modele modele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.top_nav);
        setSupportActionBar(toolbar);
        getSupportActionBar();

        controller = new Controller(this);
        controller.openAppView();
        controller.changeViewBottomNav();



    }
    //2 Méthodes pour la gestion du ToolBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_home_menu, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu){
        menu.clear();
        int menuId = controller.getMenuIdCurrentFragment();
        getMenuInflater().inflate(menuId, menu);
        return super.onPrepareOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return controller.changeViewBtnToolbar(item) || super.onOptionsItemSelected(item);
    }

    //Méthode pour changer d'écran (de Fragment)
    public void moveToFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container_view,fragment).commit();
        supportInvalidateOptionsMenu();
    }


}