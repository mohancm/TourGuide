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

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder> {

    private Context mContext;
    private List<Restaurant> mRestaurants;

    public RestaurantAdapter(Context mContext, List<Restaurant> mRestaurants) {
        this.mContext = mContext;
        this.mRestaurants = mRestaurants;
    }

    @NonNull
    @Override
    public RestaurantAdapter.RestaurantHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mLayoutInflator = LayoutInflater.from(mContext);
        view = mLayoutInflator.inflate(R.layout.restuarant_items, viewGroup, false);
        return new RestaurantAdapter.RestaurantHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.RestaurantHolder RestaurantHolder, int i) {
        RestaurantHolder.restaurant_name.setText(mRestaurants.get(i).getRestaurantName());
        RestaurantHolder.restaurant_descript.setText(mRestaurants.get(i).getRestaurantDesc());
        RestaurantHolder.restaurant_image.setImageResource(mRestaurants.get(i).getRestaurantPlace());
        RestaurantHolder.restaurant_rating.setRating(mRestaurants.get(i).getRestaurantRating());
    }

    @Override
    public int getItemCount() {

        return mRestaurants.size();
    }

    public class RestaurantHolder extends RecyclerView.ViewHolder {

        TextView restaurant_name;
        TextView restaurant_descript;
        ImageView restaurant_image;
        RatingBar restaurant_rating;

        public RestaurantHolder(View itemView) {
            super(itemView);

            restaurant_name = itemView.findViewById(R.id.restaurantName);
            restaurant_descript = itemView.findViewById(R.id.restaurantDesc);
            restaurant_image = itemView.findViewById(R.id.restaurantImage);
            restaurant_rating = itemView.findViewById(R.id.ratingBar);
        }

    }
}
