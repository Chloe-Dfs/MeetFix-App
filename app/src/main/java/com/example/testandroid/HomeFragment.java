package com.example.testandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerViewAct;
    private RecyclerView recyclerViewMembres;
    private ActivityAdapter adapterAct;
    private MembresAdapter adapterMem;

    private Button btnCarteListe;
    private ImageView imgCarte;
    private LinearLayout linLayListe;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        // Initialiser RecyclerView
        recyclerViewAct = view.findViewById(R.id.recycler_activities);
        recyclerViewMembres = view.findViewById(R.id.recycler_membres);



        // Initialiser Modele
        Modele modele = new Modele();

        // Obtenir Liste act du Modele
        List<Activite> activites = modele.getActivites();
        List<Membres> member = modele.getMembres();

        // Initialiser Adapter
        adapterAct = new ActivityAdapter(activites);
        adapterMem = new MembresAdapter(getContext(),member);

        // Set l'adapter
        recyclerViewAct.setAdapter(adapterAct);
        recyclerViewMembres.setAdapter(adapterMem);

        // Set le layoutManager
        recyclerViewAct.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewMembres.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        //Btns
        btnCarteListe = view.findViewById(R.id.btnCarteListe);

        //Initialiser changement vue
        imgCarte = view.findViewById(R.id.imgCarte);
        linLayListe = view.findViewById(R.id.layoutHomeCar);

        return view;
    }


    public View getBtnCarteListe() {
        return btnCarteListe;
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