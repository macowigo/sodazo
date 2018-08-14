package com.macowigotech.tucasa.Adress;

public class Adress {
    public String countyName;
    public String regionName;
    public String districtName;
    public String wardName;

    public Adress(String countyName, String regionName, String districtName, String wardName) {
        this.countyName = countyName;
        this.regionName = regionName;
        this.districtName = districtName;
        this.wardName = wardName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
}

