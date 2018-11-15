package com.mohancm.tourguide;

public class Events {

    private String eventName;
    private int eventImage;

    public Events(String eventName, int eventImage) {
        this.eventName = eventName;
        this.eventImage = eventImage;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    public int getEventImage() {
        return eventImage;
    }

    public void setEventImage(int eventImage) {
        this.eventImage = eventImage;
    }
}
