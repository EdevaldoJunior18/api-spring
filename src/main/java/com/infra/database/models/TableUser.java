package com.infra.database.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TableUser {

    @Id
    private UUID id;

    private String name;

    private String age;

    private String email;

    private String document;

    private String phoneNumber;

    private String password;

    private TableAddres addres;

}
