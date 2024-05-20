package com.domain.entities.bo;

import com.domain.entities.vo.UuidVO;

/**
 *
 * @author Ed
 */
public class AddresBO {

    private UuidVO id;

    private String road;

    private String neighborhood;

    private String houseNumber;

    private String postalCode;

    private String complement;

    public AddresBO(UuidVO id, String road, String neighborhood,
            String houseNumber, String postalCode, String complement) {
        this.id = id;
        this.road = road;
        this.neighborhood = neighborhood;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.complement = complement;
    }

    public UuidVO getId() {
        return id;
    }

    public String getRoad() {
        return road;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getComplement() {
        return complement;
    }

}
