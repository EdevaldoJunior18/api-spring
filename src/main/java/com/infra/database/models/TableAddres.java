package com.infra.database.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TableAddres {

    @Id
    private UUID id;

    private String road;

    private String neighborhood;

    private String houseNumber;

    private String postalCode;

    private String complement;

}
