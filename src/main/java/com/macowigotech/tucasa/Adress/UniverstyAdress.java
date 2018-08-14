package com.macowigotech.tucasa.Adress;

public class UniverstyAdress extends Adress {
    private String streetName;
    private int plotNumber;
    private String discriptions;
    private String picture;

    public UniverstyAdress(String countyName, String regionName, String districtName, String wardName,
                           String streetName, int plotNumber, String discriptions, String picture) {
        super(countyName, regionName, districtName, wardName);
        this.streetName = streetName;
        this.plotNumber = plotNumber;
        this.discriptions = discriptions;
        this.picture = picture;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(int plotNumber) {
        this.plotNumber = plotNumber;
    }

    public String getDiscriptions() {
        return discriptions;
    }

    public void setDiscriptions(String discriptions) {
        this.discriptions = discriptions;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
