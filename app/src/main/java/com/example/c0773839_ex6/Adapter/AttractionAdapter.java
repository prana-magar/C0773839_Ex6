package com.example.c0773839_ex6.Adapter;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c0773839_ex6.AttractionDetailsActivity;
import com.example.c0773839_ex6.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.c0773839_ex6.Model.CanadaAttraction;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder>{

    private ArrayList<CanadaAttraction> attractions;

    public AttractionAdapter(ArrayList<CanadaAttraction> attractions){
        this.attractions = attractions;
    }
    @NonNull
    @Override
    public AttractionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.attraction_item,parent,false);
        AttractionViewHolder attractionViewHolder = new AttractionViewHolder(view);
        return attractionViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AttractionViewHolder holder, int position) {
        final CanadaAttraction canadaAttraction = this.attractions.get(position);
//        holder.attractionName.setText(canadaAttraction.getName());
        holder.attractionImage.setImageResource(R.drawable.ripley);
        holder.attractionName.setText(canadaAttraction.getName());
        holder.attractionLocation.setText(canadaAttraction.getAddress());
//        holder.attractionDescription.setText(canadaAttraction.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mInent = new Intent(v.getContext(), AttractionDetailsActivity.class);
                mInent.putExtra("obj",canadaAttraction);
                v.getContext().startActivity(mInent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return this.attractions.size();
    }

    public class AttractionViewHolder extends RecyclerView.ViewHolder {

          ImageView attractionImage;
          TextView attractionName, attractionLocation, attractionDescription;
//        TextView attractionName;
        public AttractionViewHolder(@NonNull View itemView) {
            super(itemView);
//            attractionName = itemView.findViewById(R.id.attractionName);
            attractionImage = itemView.findViewById(R.id.attraction_image_id);
            attractionName = itemView.findViewById(R.id.attraction_name_id);
            attractionLocation = itemView.findViewById(R.id.location_id);
//            attractionDescription = itemView.findViewById(R.id.short_description_id);
        }
    }
}
