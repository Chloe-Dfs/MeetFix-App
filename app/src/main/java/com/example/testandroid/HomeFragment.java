package com.example.testandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.json.JSONException;

import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerViewAct;
    private RecyclerView recyclerViewMembres;
    private ActivityAdapter adapterAct;
    private MembresAdapter adapterMem;

    private ImageView imgCarte;
    private ConstraintLayout linLayListe;
    private HomeController homeController;
    private Button btnCarteListe;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //initialiser bouton Carte/liste
        btnCarteListe = view.findViewById(R.id.btnCarteListe);
        homeController = new HomeController(this);
        homeController.initBtnCarteListe(btnCarteListe);
        homeController.btnCarteListeListener();




        // Initialiser RecyclerView
        recyclerViewAct = view.findViewById(R.id.recycler_activities);
        recyclerViewMembres = view.findViewById(R.id.recycler_membres);



        // Initialiser Modele
        Modele modele = null;
        try {
            modele = new Modele();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        // Obtenir Liste des activités et membres à proximité du Modele
        List<Activite> activites = modele.getActivites();
        List<Membres> member = modele.getMembres();

        // Initialiser Adapter
        adapterAct = new ActivityAdapter(activites);
        adapterMem = new MembresAdapter(getContext(),member);

        // Set l'adapter
        recyclerViewAct.setAdapter(adapterAct);
        recyclerViewMembres.setAdapter(adapterMem);

        // Set le layoutManager
        //recyclerViewAct.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
       //recyclerViewMembres.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));



        //Initialiser changement vue
        imgCarte = view.findViewById(R.id.imgCarte);
        imgCarte.setVisibility(View.GONE);
        linLayListe = view.findViewById(R.id.layoutHomeCar);
        linLayListe.setVisibility(View.VISIBLE);



        return view;
    }

    public void showCarte() {
        linLayListe.setVisibility(View.GONE);
        imgCarte.setVisibility(View.VISIBLE);
        btnCarteListe.setText(R.string.liste_btn);
    }

    public void showListe() {
        linLayListe.setVisibility(View.VISIBLE);
        imgCarte.setVisibility(View.GONE);
        btnCarteListe.setText(R.string.carte_btn);

    }







}