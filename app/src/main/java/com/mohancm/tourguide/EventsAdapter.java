package com.mohancm.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventHolder> {

    private Context mContext;
    private List<Events> mEvents;

    public EventsAdapter(Context mContext, List<Events> mEvents) {
        this.mContext = mContext;
        this.mEvents = mEvents;
    }

    @NonNull
    @Override
    public EventHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mLayoutInflator = LayoutInflater.from(mContext);
        view = mLayoutInflator.inflate(R.layout.events_items, viewGroup, false);
        return new EventHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventHolder placeHolder, int i) {
        placeHolder.event_name.setText(mEvents.get(i).getEventName());
        placeHolder.event_image.setImageResource(mEvents.get(i).getEventImage());

    }

    @Override
    public int getItemCount() {

        return mEvents.size();
    }

    public class EventHolder extends RecyclerView.ViewHolder {

        TextView event_name;
        ImageView event_image;

        public EventHolder(View itemView) {
            super(itemView);

            event_name = itemView.findViewById(R.id.eventName);
            event_image = itemView.findViewById(R.id.eventImage);

        }

    }
}

