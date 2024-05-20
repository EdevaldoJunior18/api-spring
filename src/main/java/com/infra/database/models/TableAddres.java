package com.infra.database.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author Ed
 */
@Entity
public class TableAddres {

    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "ROAD")
    private String road;

    @Column(name = "NEIGHBORHOOD")
    private String neighborhood;

    @Column(name = "HOUSE_NUMBER")
    private String houseNumber;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "COMPLEMENT")
    private String complement;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

}
