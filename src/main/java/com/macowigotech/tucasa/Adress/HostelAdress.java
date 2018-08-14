package com.macowigotech.tucasa.Adress;

public class HostelAdress extends Adress {
    private String hostelNname;
    private String blockNname;
    private String roomNumber;

    public HostelAdress(String countyName, String regionName, String districtName, String wardName,
                        String hostelNname, String blockNname, String roomNumber) {
        super(countyName, regionName, districtName, wardName);
        this.hostelNname = hostelNname;
        this.blockNname = blockNname;
        this.roomNumber = roomNumber;
    }

    public String getHostelNname() {
        return hostelNname;
    }

    public void setHostelNname(String hostelNname) {
        this.hostelNname = hostelNname;
    }

    public String getBlockNname() {
        return blockNname;
    }

    public void setBlockNname(String blockNname) {
        this.blockNname = blockNname;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
