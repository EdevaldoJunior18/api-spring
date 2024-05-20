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
public class TableUser {

    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private String age;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DOCUMENT")
    private String document;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ID_ADDRES")
    private TableAddres addres;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TableAddres getAddres() {
        return addres;
    }

    public void setAddres(TableAddres addres) {
        this.addres = addres;
    }

}
