package com.example.testandroid;


import android.content.res.AssetManager;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.security.AccessController.getContext;


//classe Vue
public class MainActivity extends AppCompatActivity {
        private Controller controller;
        private Modele modele;
        private static JSONArray utilisateurs;
        private static JSONArray evenements;

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

        try {
            // get JSONObject from JSON file
            utilisateurs = new JSONArray(loadJSONFromAsset("utilisateurs.json"));
            evenements = new JSONArray(loadJSONFromAsset("evenements.json"));
        } catch(JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //2 Méthodes pour la gestion du ToolBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_home_menu, menu);
        return true;
    }

    public static JSONArray getUtilisateurs(){
        return utilisateurs;
    }

    public static JSONArray getEvenements(){
        return evenements;
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

    public String loadJSONFromAsset(String fileName) throws IOException {
        String json = null;
        try {
            InputStream is = getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}