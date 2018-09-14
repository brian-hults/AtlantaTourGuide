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
public class MarketRestaurantFragment extends Fragment {


    public MarketRestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.name_restaurant_ponce, R.string.description_restaurant_ponce, R.drawable.ponce_citymarket, R.string.address_restaurant_ponce));
        locations.add(new Location(R.string.name_restaurant_krog, R.string.description_restaurant_krog, R.drawable.krog_streetmarket, R.string.address_restaurant_krog));
        locations.add(new Location(R.string.name_restaurant_vortex, R.string.description_restaurant_vortex, R.drawable.vortex, R.string.address_restaurant_vortex));
        locations.add(new Location(R.string.name_restaurant_parkers, R.string.description_restaurant_parkers, R.drawable.parkers, R.string.address_restaurant_parkers));
        locations.add(new Location(R.string.name_restaurant_brick, R.string.description_restaurant_brick, R.drawable.brickstore_pub, R.string.address_restaurant_brick));
        locations.add(new Location(R.string.name_restaurant_caravaca, R.string.description_restaurant_caravaca, R.drawable.caravaca_market, R.string.address_restaurant_caravaca));
        locations.add(new Location(R.string.name_restaurant_cypress, R.string.description_restaurant_cypress, R.drawable.cypress_patio, R.string.address_restaurant_cypress));
        locations.add(new Location(R.string.name_restaurant_jct, R.string.description_restaurant_jct, R.drawable.jct_kitchen, R.string.address_restaurant_jct));
        locations.add(new Location(R.string.name_restaurant_star, R.string.description_restaurant_star, R.drawable.star_provisions, R.string.address_restaurant_star));
        locations.add(new Location(R.string.name_restaurant_hf, R.string.description_restaurant_verde, R.drawable.verde, R.string.address_restaurant_verde));
        locations.add(new Location(R.string.name_restaurant_south, R.string.description_restaurant_south, R.drawable.south_city, R.string.address_restaurant_south));
        locations.add(new Location(R.string.name_restaurant_einstein, R.string.description_restaurant_einstein, R.drawable.einsteins, R.string.address_restaurant_einstein));
        locations.add(new Location(R.string.name_restaurant_zocalo, R.string.description_restaurant_zocalo, R.drawable.zocalo, R.string.address_restaurant_zocalo));

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
