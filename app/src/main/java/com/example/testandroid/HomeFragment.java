package com.example.testandroid;

import android.os.Bundle;
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


        return view;
    }
}