package com.example.rescuenet;

public class SOSRequest {
    private String latitude;
    private String longitude;
    private String message;

    public SOSRequest(String latitude, String longitude, String message) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.message = message;
    }
}
