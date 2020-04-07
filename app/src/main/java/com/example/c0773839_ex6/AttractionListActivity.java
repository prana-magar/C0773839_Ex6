package com.example.c0773839_ex6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.c0773839_ex6.Adapter.AttractionAdapter;
import com.example.c0773839_ex6.Model.CanadaAttraction;

import java.util.ArrayList;

public class AttractionListActivity extends AppCompatActivity {

    ArrayList<CanadaAttraction> canadaAttractions;
    RecyclerView rv;
    AttractionAdapter attractionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadAttractions();
        rv = findViewById(R.id.attractionRecycleView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(layoutManager);
        attractionAdapter = new AttractionAdapter(this.canadaAttractions);
        rv.setAdapter(attractionAdapter);

    }

    void loadAttractions(){
        canadaAttractions = new ArrayList<CanadaAttraction>();

        String id,name,address,city,province,description,image_name;
        id = "1";
        name = "Ripley Aquarium of Canada";
        address = "288 Bremner Boulevard, Toronto, Ontario M5V 3L9 Canada";
        city = "Toronto";
        province = "Ontario";
        description = "Explore the Waters of the World at Ripley's Aquarium of Canada. Located in the heart of downtown Toronto at the base of the CN Tower, the aquarium is Toronto's must-see attraction for tourists and locals of all ages. Immerse yourself in a world of 20,000 aquatic animals and discover your own underwater adventure. The Aquarium features North America’s longest underwater viewing tunnel with more than 5.7 million litres of water and over 100 interactive opportunities. Get up close and personal with several touch exhibits featuring horseshoe crabs, sharks, scarlet cleaner shrimp, and stingrays as well as daily dive shows every 2 hours. This awe-inspiring attraction consists of nine carefully curated galleries showcasing a cross section of saltwater and freshwater environments from around the world – starting with species from Toronto’s backyard, the Great Lakes basin.";
        image_name = "ripley";
        canadaAttractions.add(new CanadaAttraction(id,name,address,city,province,description,image_name));


        id = "1";
        name = "Ripley Aquarium of Canada";
        address = "288 Bremner Boulevard, Toronto, Ontario M5V 3L9 Canada";
        city = "Toronto";
        province = "Ontario";
        description = "Explore the Waters of the World at Ripley's Aquarium of Canada. Located in the heart of downtown Toronto at the base of the CN Tower, the aquarium is Toronto's must-see attraction for tourists and locals of all ages. Immerse yourself in a world of 20,000 aquatic animals and discover your own underwater adventure. The Aquarium features North America’s longest underwater viewing tunnel with more than 5.7 million litres of water and over 100 interactive opportunities. Get up close and personal with several touch exhibits featuring horseshoe crabs, sharks, scarlet cleaner shrimp, and stingrays as well as daily dive shows every 2 hours. This awe-inspiring attraction consists of nine carefully curated galleries showcasing a cross section of saltwater and freshwater environments from around the world – starting with species from Toronto’s backyard, the Great Lakes basin.";
        image_name = "ripley";
        canadaAttractions.add(new CanadaAttraction(id,name,address,city,province,description,image_name));


        id = "1";
        name = "Ripley Aquarium of Canada";
        address = "288 Bremner Boulevard, Toronto, Ontario M5V 3L9 Canada";
        city = "Toronto";
        province = "Ontario";
        description = "Explore the Waters of the World at Ripley's Aquarium of Canada. Located in the heart of downtown Toronto at the base of the CN Tower, the aquarium is Toronto's must-see attraction for tourists and locals of all ages. Immerse yourself in a world of 20,000 aquatic animals and discover your own underwater adventure. The Aquarium features North America’s longest underwater viewing tunnel with more than 5.7 million litres of water and over 100 interactive opportunities. Get up close and personal with several touch exhibits featuring horseshoe crabs, sharks, scarlet cleaner shrimp, and stingrays as well as daily dive shows every 2 hours. This awe-inspiring attraction consists of nine carefully curated galleries showcasing a cross section of saltwater and freshwater environments from around the world – starting with species from Toronto’s backyard, the Great Lakes basin.";
        image_name = "ripley";
        canadaAttractions.add(new CanadaAttraction(id,name,address,city,province,description,image_name));

    }
}
