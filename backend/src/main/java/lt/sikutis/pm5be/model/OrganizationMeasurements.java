package lt.sikutis.pm5be.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "organization_measurements", schema = "dbo")
public class OrganizationMeasurements {

    @Id
    private long org;
    private float scope1tco2e;
    private float scope2tco2e;
    private float scope3tco2e;
    private float renewabletco2e;
    private Date utctime;

    public OrganizationMeasurements() {

    }

    public OrganizationMeasurements(long org, float scope1tco2e, float scope2tco2e, float scope3tco2e, float renewabletco2e, Date utctime) {
        this.org = org;
        this.scope1tco2e = scope1tco2e;
        this.scope2tco2e = scope2tco2e;
        this.scope3tco2e = scope3tco2e;
        this.renewabletco2e = renewabletco2e;
        this.utctime = utctime;
    }

    public long getOrg() {
        return org;
    }

    public float getScope1tco2e() {
        return scope1tco2e;
    }

    public float getScope2tco2e() {
        return scope2tco2e;
    }

    public float getScope3tco2e() {
        return scope3tco2e;
    }

    public float getRenewabletco2e() {
        return renewabletco2e;
    }

    public Date getUtctime() {
        return utctime;
    }
}
