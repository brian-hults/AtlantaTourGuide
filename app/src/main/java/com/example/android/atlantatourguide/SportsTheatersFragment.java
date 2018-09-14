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
public class SportsTheatersFragment extends Fragment {


    public SportsTheatersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.name_theater_mercedes, R.string.description_theater_mercedes, R.drawable.mercedes_benz, R.string.address_theater_mercedes));
        locations.add(new Location(R.string.name_theater_philips, R.string.description_theater_philips, R.drawable.philips_arena, R.string.address_theater_philips));
        locations.add(new Location(R.string.name_theater_tabernacle, R.string.description_theater_tabernacle, R.drawable.tabernacle, R.string.address_theater_tabernacle));
        locations.add(new Location(R.string.name_theater_center, R.string.description_theater_center, R.drawable.center_stage, R.string.address_theater_center));
        locations.add(new Location(R.string.name_theater_fox, R.string.description_theater_fox, R.drawable.fox_theatre, R.string.address_theater_fox));
        locations.add(new Location(R.string.name_theater_variety, R.string.description_theater_variety, R.drawable.variety_playhouse, R.string.address_theater_variety));
        locations.add(new Location(R.string.name_theater_eddie, R.string.description_theater_eddie, R.drawable.eddies_attic, R.string.address_theater_eddie));

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
