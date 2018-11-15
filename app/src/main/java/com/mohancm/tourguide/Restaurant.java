package com.mohancm.tourguide;

public class Restaurant {

    private String restaurantName;
    private String restaurantDesc;
    private float restaurantRating;
    private int restaurantPlace;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantDesc() {
        return restaurantDesc;
    }

    public void setRestaurantDesc(String restaurantDesc) {
        this.restaurantDesc = restaurantDesc;
    }

    public float getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(float restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public int getRestaurantPlace() {
        return restaurantPlace;
    }

    public void setRestaurantPlace(int restaurantPlace) {
        this.restaurantPlace = restaurantPlace;
    }

    public Restaurant(String restaurantName, String restaurantDesc, float restaurantRating, int restaurantPlace) {

        this.restaurantName = restaurantName;
        this.restaurantDesc = restaurantDesc;
        this.restaurantRating = restaurantRating;
        this.restaurantPlace = restaurantPlace;
    }
}
