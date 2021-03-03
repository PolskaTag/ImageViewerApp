package edu.temple.imageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        getActionBar().setTitle("DisplayActivity");

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

    }


    private void showPicture(int position){
        imageView.setImageResource(galaxyImageArray[position]);
    }

}