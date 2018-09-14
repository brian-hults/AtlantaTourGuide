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
public class ParkMuseumExhibitFragment extends Fragment {


    public ParkMuseumExhibitFragment() {
        // Empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.name_park_MLK, R.string.description_park_MLK, R.drawable.mlk, R.string.address_park_MLK));
        locations.add(new Location(R.string.name_park_Zoo, R.string.description_park_zoo, R.drawable.zooatlanta, R.string.address_park_zoo));
        locations.add(new Location(R.string.name_park_aquarium, R.string.description_park_aquarium, R.drawable.ga_aquarium, R.string.address_park_aquarium));
        locations.add(new Location(R.string.name_park_coke, R.string.description_park_coke, R.drawable.coke, R.string.address_park_coke));
        locations.add(new Location(R.string.name_park_woodruff, R.string.description_park_woodruff, R.drawable.woodruff, R.string.address_park_woodruff));
        locations.add(new Location(R.string.name_park_piedmont, R.string.description_park_piedmont, R.drawable.piedmont, R.string.address_park_piedmont));
        locations.add(new Location(R.string.name_park_beltline, R.string.description_park_beltline, R.drawable.beltline, R.string.address_park_beltline));
        locations.add(new Location(R.string.name_park_botanical, R.string.description_park_botanical, R.drawable.botanical_garden, R.string.address_park_botanical));
        locations.add(new Location(R.string.name_park_fernbank, R.string.description_park_fernbank, R.drawable.fernbank, R.string.address_park_fernbank));

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
