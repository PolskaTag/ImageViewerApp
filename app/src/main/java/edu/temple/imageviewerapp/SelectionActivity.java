package edu.temple.imageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectionActivity extends AppCompatActivity {

    ImageView imageView;
    GridView gridView;
    int[] galaxyImageArray;
    private final int REQUEST_MAIN_CODE = 1;
    boolean firstTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("SelectionActivity");

        gridView = findViewById(R.id.gridView);
        firstTime = true;

        ArrayList galaxyArray = new ArrayList<String>();
        galaxyArray.add("Andromeda");
        galaxyArray.add("Black Eye");
        galaxyArray.add("Milky Way");
        galaxyArray.add("Sombrero");
        galaxyArray.add("NGC 1365");
        galaxyArray.add("NGC 1792");
        galaxyArray.add("NGC 2336");
        galaxyArray.add("NGC 5585");
        galaxyArray.add("Unknown");
//        galaxyArray.add("Select a Galaxy!");
        galaxyImageArray = new int[]{
                R.drawable.andromeda, R.drawable.blackeye, R.drawable.milkyway,
                R.drawable.sombrero, R.drawable.ngc1365, R.drawable.ngc1792,
                R.drawable.ngc2336, R.drawable.ngc5585, R.drawable.unknown};

        GalaxyAdapter adapter = new GalaxyAdapter(this, galaxyArray, galaxyImageArray);
        gridView.setAdapter(adapter);
//        spinner.setSelection(adapter.getCount());

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent launchIntent = new Intent(SelectionActivity.this, DisplayActivity.class);
                launchIntent.putExtra("imageName", galaxyArray.get(position).toString());
                launchIntent.putExtra("imageVal", galaxyImageArray[position]);
                startActivity(launchIntent);
            }
        });

    /*
        gridView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if(firstTime){
//                    firstTime = false;
//                    return;
//                }
//                String name = galaxyArray.get(position).toString();
                Intent launchIntent = new Intent(SelectionActivity.this, DisplayActivity.class);
                launchIntent.putExtra("imageName", galaxyArray.get(position).toString());
                launchIntent.putExtra("imageVal", galaxyImageArray[position]);
//                launchIntent.putExtra("imageVal", 45);
                startActivity(launchIntent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(SelectionActivity.this, "Item unselected", Toast.LENGTH_SHORT).show();
            }
        });
        */
    }

}