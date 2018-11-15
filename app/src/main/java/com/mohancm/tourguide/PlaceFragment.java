package com.mohancm.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceFragment extends Fragment {

    List<Place> placeList;


    public PlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_place, container, false);

        RelativeLayout relativeLayout = (RelativeLayout) rootView.findViewById(R.id.agra_image);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.places_rv);

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        placeList = new ArrayList<Place>();
        placeList.add(new Place(getString(R.string.place_1), getString(R.string.place_1_desc), R.drawable.akshardham));
        placeList.add(new Place(getString(R.string.place_2), getString(R.string.place_2_desc), R.drawable.jaipur));
        placeList.add(new Place(getString(R.string.place_3), getString(R.string.place_3_desc), R.drawable.agrafort));
        placeList.add(new Place(getString(R.string.place_4), getString(R.string.place_4_desc), R.drawable.bengaluru));
        placeList.add(new Place(getString(R.string.place_5), getString(R.string.place_5_desc), R.drawable.kolkata));
        placeList.add(new Place(getString(R.string.place_6), getString(R.string.place_6_desc), R.drawable.mysore));
        placeList.add(new Place(getString(R.string.place_7), getString(R.string.place_7_desc), R.drawable.tamil_nadu));
        placeList.add(new Place(getString(R.string.place_8), getString(R.string.place_8_desc), R.drawable.golden_triangle));
        placeList.add(new Place(getString(R.string.place_9), getString(R.string.place_9_desc), R.drawable.golden_temple));

        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), placeList);
        recyclerView.setAdapter(placeAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;


    }

}
