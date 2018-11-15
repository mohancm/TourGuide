package com.mohancm.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    List<Restaurant> restaurantList;


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.restaurants_rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        restaurantList = new ArrayList<Restaurant>();
        restaurantList.add(new Restaurant(getString(R.string.hotel_1), getString(R.string.hotel_1_place), 3, R.drawable.jaipur_ad));
        restaurantList.add(new Restaurant(getString(R.string.hotel_2), getString(R.string.hotel_2_place), 3, R.drawable.udaipur_ad));
        restaurantList.add(new Restaurant(getString(R.string.hotel_3), getString(R.string.hotel_3_place), 3, R.drawable.aish_hyderbad));
        restaurantList.add(new Restaurant(getString(R.string.hotel_4), getString(R.string.hotel_4_place), 3, R.drawable.hotel_of_mg));
        restaurantList.add(new Restaurant(getString(R.string.hotel_5), getString(R.string.hotel_5_place), 3, R.drawable.amet_haveli));
        restaurantList.add(new Restaurant(getString(R.string.hotel_6), getString(R.string.hotel_6_place), 3, R.drawable.amethyst));
        restaurantList.add(new Restaurant(getString(R.string.hotel_7), getString(R.string.hotel_7_place), 3, R.drawable.bawarchi));

        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getContext(), restaurantList);
        recyclerView.setAdapter(restaurantAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;

    }

}
