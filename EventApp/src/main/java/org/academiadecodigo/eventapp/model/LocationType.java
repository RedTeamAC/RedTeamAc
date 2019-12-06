package org.academiadecodigo.eventapp.model;

public enum LocationType {
    PORTO("porto"),
    FUNDAO("fundao");

    private String location;

    LocationType(String location){

        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
