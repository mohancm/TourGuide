package com.mohancm.tourguide;

public class Place {

    private String placeName;
    private String placeDesc;
    private int placeImage;

    public Place(String placeName, String placeDesc, int placeImage) {
        this.placeDesc = placeDesc;
        this.placeImage = placeImage;
        this.placeName = placeName;
    }

    public String getPlaceName() {

        return placeName;
    }

    public int getPlaceImage() {

        return placeImage;
    }

    public String getPlaceDesc() {

        return placeDesc;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setPlaceDesc(String placeDesc) {
        this.placeDesc = placeDesc;
    }

    public void setPlaceImage(int placeImage) {
        this.placeImage = placeImage;
    }
}
