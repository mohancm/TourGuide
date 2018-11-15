package com.mohancm.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceHolder> {

    private Context mContext;
    private List<Place> mPlaces;

    public PlaceAdapter(Context mContext, List<Place> mPlaces) {
        this.mContext = mContext;
        this.mPlaces = mPlaces;
    }

    @NonNull
    @Override
    public PlaceAdapter.PlaceHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mLayoutInflator = LayoutInflater.from(mContext);
        view = mLayoutInflator.inflate(R.layout.place_list_items, viewGroup, false);
        return new PlaceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapter.PlaceHolder placeHolder, int i) {
        placeHolder.place_name.setText(mPlaces.get(i).getPlaceName());
        placeHolder.place_descript.setText(mPlaces.get(i).getPlaceDesc());
        placeHolder.place_image.setImageResource(mPlaces.get(i).getPlaceImage());

    }

    @Override
    public int getItemCount() {

        return mPlaces.size();
    }

    public class PlaceHolder extends RecyclerView.ViewHolder {

        TextView place_name;
        TextView place_descript;
        ImageView place_image;
        RatingBar place_rating;

        public PlaceHolder(View itemView) {
            super(itemView);

            place_name = itemView.findViewById(R.id.placeName);
            place_descript = itemView.findViewById(R.id.placeDesc);
            place_image = itemView.findViewById(R.id.placeImage);
            place_rating = itemView.findViewById(R.id.ratingBar);
        }

    }
}
