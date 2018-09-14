package com.example.android.atlantatourguide;

public class Location {
    private int nameID;
    private int descriptionID;
    private int imgResID;
    private int addressID;

    public Location(int locationNameID, int locationDescriptionID, int locationImgID, int locationAddressID) {
        nameID = locationNameID;
        descriptionID = locationDescriptionID;
        imgResID = locationImgID;
        addressID = locationAddressID;
    }

    public int getName() {return nameID;}
    public int getDescription() {return descriptionID;}
    public int getImgResID() {return imgResID;}
    public int getAddress() {return addressID;}
}
