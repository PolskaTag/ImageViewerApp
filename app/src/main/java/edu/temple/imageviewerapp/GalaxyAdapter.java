package edu.temple.imageviewerapp;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GalaxyAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> items;
    int[] imageRes;

    public GalaxyAdapter(Context context, ArrayList items, int[] imageRes){
        this.context = context;
        this.items = items;
        this.imageRes = imageRes;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    // Ignore this for now.
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(context);
        textView.setText(items.get(position));

        textView.setPadding(10,10,10,10);
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        ImageView imageView;

        LinearLayout linearLayout;

        // Recycler pattern
        if(convertView == null){
            linearLayout = new LinearLayout(context);
            textView = new TextView(context);
            imageView = new ImageView(context);
            textView.setTextSize(20);
            textView.setPadding(10,10,10,10);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            imageView.getLayoutParams().height = 150;
            imageView.getLayoutParams().width = 150;
        } else {
            linearLayout = (LinearLayout) convertView;
            imageView = (ImageView) linearLayout.getChildAt(0);
            textView = (TextView) linearLayout.getChildAt(1);
        }

        imageView.setImageResource(imageRes[position]);
        textView.setText(items.get(position));

        return linearLayout;
    }
}