package com.mohancm.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class EventsFragment extends Fragment {


    List<Events> eventList;

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_events, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.events_rv);

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        eventList = new ArrayList<Events>();
        eventList.add(new Events(getString(R.string.birthdays), R.drawable.ic_cake));
        eventList.add(new Events(getString(R.string.photography), R.drawable.ic_camera));
        eventList.add(new Events(getString(R.string.food), R.drawable.ic_cutlery));
        eventList.add(new Events(getString(R.string.concerts), R.drawable.ic_speaker));
        eventList.add(new Events(getString(R.string.workshops), R.drawable.ic_mortarboard));
        eventList.add(new Events(getString(R.string.movie), R.drawable.ic_movie_tickets));
        eventList.add(new Events(getString(R.string.games), R.drawable.ic_games));
        eventList.add(new Events(getString(R.string.meetup), R.drawable.ic_discussion));

        EventsAdapter eventsAdapter = new EventsAdapter(getActivity(), eventList);
        recyclerView.setAdapter(eventsAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;


    }
}
