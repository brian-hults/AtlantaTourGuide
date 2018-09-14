package com.example.android.atlantatourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    // Custom constructor for a custom Location adapter class
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Gets the index position of the current location
        Location currentLocation = getItem(position);

        // Finds the current views that need to be changed for each list item
        // Finds the name text view and sets its value
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentLocation.getName());

        // Finds the address text view and sets its value
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentLocation.getAddress());

        // Finds the description text view and sets its value
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentLocation.getDescription());

        // Finds the list item image view and sets the corresponding image resource
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_img);
        iconView.setImageResource(currentLocation.getImgResID());

        return listItemView;
    }
}
