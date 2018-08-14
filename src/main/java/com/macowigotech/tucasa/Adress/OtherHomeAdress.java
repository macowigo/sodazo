package com.macowigotech.tucasa.Adress;

public class OtherHomeAdress extends Adress {
    private String streetName;
    private int houseNunmer;

    public OtherHomeAdress(String countyName, String regionName,
                           String districtName, String wardName, String streetName, int houseNunmer) {
        super(countyName, regionName, districtName, wardName);
        this.streetName = streetName;
        this.houseNunmer = houseNunmer;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNunmer() {
        return houseNunmer;
    }

    public void setHouseNunmer(int houseNunmer) {
        this.houseNunmer = houseNunmer;
    }
}
