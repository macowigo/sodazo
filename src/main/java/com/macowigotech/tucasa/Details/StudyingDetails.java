package com.macowigotech.tucasa.Details;

public class StudyingDetails {
    private String startYear;
    private String endYear;
    private String programmeStudying;
    private String universtyOrCollegeName;

    public StudyingDetails(String startYear, String endYear, String programmeStudying,
                           String universtyOrCollegeName) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.programmeStudying = programmeStudying;
        this.universtyOrCollegeName = universtyOrCollegeName;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getProgrammeStudying() {
        return programmeStudying;
    }

    public void setProgrammeStudying(String programmeStudying) {
        this.programmeStudying = programmeStudying;
    }

    public String getUniverstyOrCollegeName() {
        return universtyOrCollegeName;
    }

    public void setUniverstyOrCollegeName(String universtyOrCollegeName) {
        this.universtyOrCollegeName = universtyOrCollegeName;
    }
}




