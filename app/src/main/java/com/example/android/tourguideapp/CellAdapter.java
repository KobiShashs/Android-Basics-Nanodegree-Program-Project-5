package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 7/20/2016.
 */
public class CellAdapter extends ArrayAdapter<CellItem> {

    private int mColorResourceId;

    public CellAdapter(Context context, ArrayList<CellItem> items, int colorResources) {
        super(context, 0, items);
        mColorResourceId = colorResources;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        CellItem currentCell = getItem(position);

        TextView textViewFirst = (TextView) listItemView.findViewById(R.id.default_text_view);
        textViewFirst.setText(currentCell.getmName());

        TextView textViewSecond = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        textViewSecond.setText(currentCell.getmAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentCell.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentCell.getmResources());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;

    }
}
