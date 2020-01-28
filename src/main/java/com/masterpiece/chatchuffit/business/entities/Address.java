package com.masterpiece.chatchuffit.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_address")
public class Address extends AbstractEntity {

    @Column(nullable = false, length = 255)
    private String road;

    @Column(nullable = false, length = 5)
    private String zipCode;

    @Column(nullable = false, length = 50)
    private String town;

    public Address() {
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
