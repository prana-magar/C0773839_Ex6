package com.example.c0773839_ex6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c0773839_ex6.Model.CanadaAttraction;

public class AttractionDetailsActivity extends AppCompatActivity {

    ImageView attractionImage;
    TextView attractionName, attractionLocation, attractionDescription, attractionOpenTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_details);
        attractionImage = findViewById(R.id.attraction_image_detail_id);
        attractionName = findViewById(R.id.attraction_name_detail_id);
        attractionLocation = findViewById(R.id.location_detail_id);
        attractionDescription = findViewById(R.id.short_description_detail_id);
        attractionOpenTime = findViewById(R.id.open_time_detail_id);
        Intent mIntent = getIntent();
        CanadaAttraction canadaAttraction = (CanadaAttraction) mIntent.getSerializableExtra("obj");
        attractionImage.setImageResource(getResources().getIdentifier(canadaAttraction.getImage_name(),"drawable","com.example.c0773839_ex6"));
        attractionName.setText(canadaAttraction.getName());
        attractionLocation.setText(canadaAttraction.getAddress());
        attractionDescription.setText(canadaAttraction.getDescription());
        attractionOpenTime.setText(canadaAttraction.getOpenTime());

    }

}
