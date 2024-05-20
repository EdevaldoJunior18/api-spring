package com.domain.entities.dto;

/**
 *
 * @author Ed
 */
public class UserDTO {

    private String id;

    private String name;

    private String age;

    private String email;

    private String document;

    private String phoneNumber;

    private String password;

    private AddresDTO addres;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public AddresDTO getAddres() {
        return addres;
    }

    public void setAddres(AddresDTO addres) {
        this.addres = addres;
    }

}
