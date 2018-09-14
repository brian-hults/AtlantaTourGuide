package com.example.android.atlantatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BreweryDistilleryFragment extends Fragment {


    public BreweryDistilleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.name_brewery_sweetwater, R.string.description_brewery_sweetwater, R.drawable.sweetwater, R.string.address_brewery_sweetwater));
        locations.add(new Location(R.string.name_brewery_monday, R.string.description_brewery_monday, R.drawable.monday_night, R.string.address_brewery_monday));
        locations.add(new Location(R.string.name_brewery_red, R.string.description_brewery_red, R.drawable.red_brick, R.string.address_brewery_red));
        locations.add(new Location(R.string.name_brewery_scofflaw, R.string.description_brewery_scofflaw, R.drawable.scofflaw, R.string.address_brewery_scofflaw));
        locations.add(new Location(R.string.name_brewery_second, R.string.description_brewery_second, R.drawable.second_self, R.string.address_brewery_second));
        locations.add(new Location(R.string.name_brewery_taverns, R.string.description_brewery_taverns, R.drawable.threetaverns, R.string.address_brewery_taverns));
        locations.add(new Location(R.string.name_brewery_wild, R.string.description_brewery_wild, R.drawable.wild_heaven, R.string.address_brewery_wild));
        locations.add(new Location(R.string.name_brewery_eventide, R.string.description_brewery_eventide, R.drawable.eventide, R.string.address_brewery_eventide));
        locations.add(new Location(R.string.name_brewery_oldfourth, R.string.description_brewery_oldfourth, R.drawable.old_fourth, R.string.address_brewery_oldfourth));
        locations.add(new Location(R.string.name_brewery_asw, R.string.description_brewery_asw, R.drawable.asw, R.string.address_brewery_asw));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.location_list);
        listView.setAdapter(adapter);


        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
