package edu.temple.imageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    String imageName;
    int imageVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        getSupportActionBar().setTitle("DisplayActivity");

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        Intent selectIntent = getIntent();
        imageName = selectIntent.getStringExtra("imageName");
        imageVal = selectIntent.getIntExtra("imageVal", 0);

//        Log.i("result data", String.valueOf(selectIntent.getIntExtra("imageVal", 0)));
        showText(imageName);
        showPicture(imageVal);

    }

    private void showText(String text){
        textView.setText(text);
    }

    private void showPicture(int id){
        imageView.setImageResource(id);
    }

}