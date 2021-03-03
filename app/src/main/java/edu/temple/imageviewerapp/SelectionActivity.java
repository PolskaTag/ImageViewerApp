package edu.temple.imageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectionActivity extends AppCompatActivity {

    ImageView imageView;
    Spinner spinner;
    int[] galaxyImageArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        ArrayList galaxyArray = new ArrayList<String>();
        galaxyArray.add("Andromeda");
        galaxyArray.add("Black Eye");
        galaxyArray.add("Milky Way");
        galaxyArray.add("Sombrero");
        galaxyImageArray = new int[]{R.drawable.andromeda, R.drawable.blackeye, R.drawable.milkyway, R.drawable.sombrero};

        GalaxyAdapter adapter = new GalaxyAdapter(this, galaxyArray, galaxyImageArray);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                showPicture(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(SelectionActivity.this, "Item unselected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showPicture(int position){
        imageView.setImageResource(galaxyImageArray[position]);
    }
}