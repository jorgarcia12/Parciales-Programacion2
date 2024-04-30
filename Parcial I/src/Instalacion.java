public class Instalacion {
    private String category;
    private String location;
    private String facilityName;
    private String facilityType;
    private Sede campus;

    public Instalacion(String category, String location, String facilityName, String facilityType) {
        this.category = category;
        this.location = location;
        this.facilityName = facilityName;
        this.facilityType = facilityType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public Sede getCampus() {
        return campus;
    }

    public void setCampus(Sede campus) {
        this.campus = campus;
    }
}
