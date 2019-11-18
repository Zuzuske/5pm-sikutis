package lt.sikutis.pm5be.model;

import javax.persistence.*;

@Entity
@Table(name = "organizations", schema = "dbo")
public class Organizations {

    @Id
    private long org;
    private float lat;
    private float lon;
    private String org_name;
    private String org_address;

    public Organizations() {

    }

    public Organizations(long org, float lat, float lon, String org_name, String org_address) {
        this.org = org;
        this.lat = lat;
        this.lon = lon;
        this.org_name = org_name;
        this.org_address = org_address;
    }

    public long getOrg() {
        return org;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }

    public String getOrg_name() {
        return org_name;
    }

    public String getOrg_address() {
        return org_address;
    }

    @OneToOne
    @JoinColumn(name = "org", referencedColumnName = "org")
    private OrganizationMeasurements organizationMeasurements;

    public OrganizationMeasurements getOrganizationMeasurements() {
        return organizationMeasurements;
    }
}
