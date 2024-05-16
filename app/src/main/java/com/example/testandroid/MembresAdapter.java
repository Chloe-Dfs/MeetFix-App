package com.example.testandroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MembresAdapter extends RecyclerView.Adapter<MembresAdapter.ViewHolder> {

    private List<Membres> membres;
    private Context context;

    public MembresAdapter(Context context, List<Membres> membres) {
        this.context = context;
        this.membres = membres;
    }


    public MembresAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_membres, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder( ViewHolder holder, int position) {
        Membres member = membres.get(position);

        holder.textViewName.setText(member.getName());
        //holder.textViewSurname.setText(member.getSurname());
        holder.textViewAge.setText(String.valueOf(member.getAge()));
        holder.textViewLocation.setText(member.getLocation());
        holder.textViewPassion.setText(member.getPassion());

        String imgPath = member.getImg();
        if (!member.getImg().isEmpty()) {
            // Obtenez l'identifiant de ressource de l'image en utilisant le nom de l'image
            int imageResource = context.getResources().getIdentifier(member.getImg(), "drawable", context.getPackageName());

            // Vérifiez si l'identifiant de ressource est valide
            if (imageResource != 0) {
                // Chargez l'image correspondante dans l'ImageView
                holder.imgView.setImageResource(imageResource);
            } else {
                // Si l'identifiant de ressource est invalide, affichez une image par défaut
                holder.imgView.setImageResource(R.drawable.imgnull);
            }
        } else {
            // Si le chemin d'accès de l'image est vide, affichez une image par défaut
            holder.imgView.setImageResource(R.drawable.imgnull);
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "élément du carousel cliqué", Toast.LENGTH_LONG).show();
            }
        });
    }


    public int getItemCount() {
        return membres.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView textViewName;
        //TextView textViewSurname;
        TextView textViewLocation;
        TextView textViewAge;
        TextView textViewPassion;

        ImageView imgView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.text_name);
            //textViewSurname = itemView.findViewById(R.id.text_surname);
            textViewLocation = itemView.findViewById(R.id.text_location);
            textViewAge = itemView.findViewById(R.id.text_age);
            textViewPassion = itemView.findViewById(R.id.text_passion);
            imgView = itemView.findViewById(R.id.idMembre);

        }
    }
}
