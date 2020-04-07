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

        String id,name,address,city,province,description,image_name,open_time;
        id = "1";
        name = "Ripley Aquarium of Canada";
        address = "288 Bremner Boulevard, Toronto, Ontario M5V 3L9 Canada";
        city = "Toronto";
        province = "Ontario";
        description = "Explore the Waters of the World at Ripley's Aquarium of Canada. Located in the heart of downtown Toronto at the base of the CN Tower, the aquarium is Toronto's must-see attraction for tourists and locals of all ages. Immerse yourself in a world of 20,000 aquatic animals and discover your own underwater adventure. The Aquarium features North America’s longest underwater viewing tunnel with more than 5.7 million litres of water and over 100 interactive opportunities. Get up close and personal with several touch exhibits featuring horseshoe crabs, sharks, scarlet cleaner shrimp, and stingrays as well as daily dive shows every 2 hours. This awe-inspiring attraction consists of nine carefully curated galleries showcasing a cross section of saltwater and freshwater environments from around the world – starting with species from Toronto’s backyard, the Great Lakes basin.";
        image_name = "ripley";
        open_time = "9:00 a.m. - 11:00 p.m.";
        canadaAttractions.add(new CanadaAttraction(id,name,address,city,province,description,image_name,open_time));


        id = "1";
        name = "CN Tower";
        address = "290 Bremner Blvd, Toronto, Ontario M5V 3L9 Canada";
        city = "Toronto";
        province = "Ontario";
        description = "At a height of 553.33 m (1,815 ft., 5 in), the CN Tower is Canada’s National Tower, an engineering Wonder, award-winning dining & entertainment destination, and Toronto’s “must-see” for over 4 decades. Rocket to the top in a thrilling 58 second ride aboard glass fronted elevators. Spectacular views overlooking up to 160km (100 miles) from 3 observation levels including, the LookOut Level with floor-to-ceiling panoramic Window Walls, the world famous Glass Floor including Outdoor SkyTerrace and SkyPod, the highest of them all. Experience the thrilling EdgeWalk, the World’s Highest Outdoor Walk on a Building. Enjoy award-winning Canadian cuisine and breathtaking revolving views at 360 Restaurant, the perfect place for entertaining or celebrating. Plus, visual displays and exhibits on the history of the CN Tower, KidZone play area and unique Canadian artisan and souvenir shopping in the Gift Shop. Don’t miss the architectural illumination of the Tower each night from dusk to dawn.";
        image_name = "cn_tower";
        open_time = "9:00 a.m. - 10:30 p.m.";
        canadaAttractions.add(new CanadaAttraction(id,name,address,city,province,description,image_name,open_time));


        id = "1";
        name = "Royal Ontario Museum";
        address = "100 Queen's Park, Toronto, Ontario M5S 2C6 Canada";
        city = "Toronto";
        province = "Ontario";
        description = "Opened in 1914, the Royal Ontario Museum (ROM) showcases art, culture, and nature from around the globe and across the ages. One of North America's most renowned cultural institutions, Canada's largest museum is home to a world-class collection of more than six million objects and specimens, featured in 40 gallery and exhibition spaces. As the country’s preeminent field research institute and an international leader in new and original findings in biodiversity, palaeontology, earth sciences, the visual arts, material culture and archaeology, the ROM plays a vital role in advancing our global understanding of the artistic, cultural and natural world.";
        image_name = "royal_ontario_museum";
        open_time = "10:00 a.m. - 5:30 p.m.";
        canadaAttractions.add(new CanadaAttraction(id,name,address,city,province,description,image_name,open_time));


        id = "1";
        name = "Old Montreal";
        address = "Montreal, Quebec H2Y 3Y8 Canada";
        city = "Montreal";
        province = "Quebec";
        description = "Stroll, bicycle or take a horse-drawn carriage through the narrow cobblestone streets of Montreal's famous Parisian-style historic district, filled with cultural landmarks, museums, boutiques, sidewalk cafes and restaurants.";
        image_name = "old_monterial";
        open_time = "10:00 a.m. - 6:00 p.m.";
        canadaAttractions.add(new CanadaAttraction(id,name,address,city,province,description,image_name,open_time));


        id = "1";
        name = "Peak Axe Throwing";
        address = "415-B Victoria Road W Alpine Village Mall, Revelstoke, British Columbia V0E 2S1 Canada";
        city = "Revelstoke";
        province = "British Columbia";
        description = "We specialize in keeping the stoke indoors, providing you and your friends an Authentically Revelstoke Experience. Located in downtown, Revelstoke, BC directly beside Lordco Auto Parts. Peak Axe Throwing is Revelstoke's only axe-throwing facility and latest must-do activity. Get your axes in here! Walk-ins, Reservations, Birthday Parties and Group Outings. No experience necessary.";
        image_name = "peak_axe";
        open_time = "5:00 p.m. - 10:00 p.m.";
        canadaAttractions.add(new CanadaAttraction(id,name,address,city,province,description,image_name,open_time));


        id = "1";
        name = "Skerwink Trail";
        address = "Port Rexton, Newfoundland and Labrador Canada";
        city = "Toronto";
        province = "Newfoundland and Labrador";
        description = "Skerwink Trail is the hiking Jewel of the region. It is internationally recognized and was ranked the top 35 trails in North America and Europe by Travel & Leisure Magazine (2003). This 5.3 km hike will provide the opportunity to view and photograph the amazing coastal scenery, sea birds, whales, eagles, sea stacks as well as icebergs (in season).";
        image_name = "skerwink_trail";
        open_time = "9:00 a.m. - 11:59 p.m.";
        canadaAttractions.add(new CanadaAttraction(id,name,address,city,province,description,image_name,open_time));


    }
}
