package com.example.testandroid;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private ActivityAdapter adapter;
    private List<Activite> activites;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialiser RecyclerView
        recyclerView = view.findViewById(R.id.recycler_activities);


        // Initialiser Modele
        Modele modele = new Modele();

        // Obtenir Liste act du Modele
        List<Activite> activites = modele.getActivites();

        // Initialiser Adapter
        adapter = new ActivityAdapter(activites);

        // Set l'adapter
        recyclerView.setAdapter(adapter);

        // Set le layoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));


        return view;
    }
}