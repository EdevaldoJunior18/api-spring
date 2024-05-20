package com.domain.entities.bo;

import com.domain.entities.vo.UuidVO;

/**
 *
 * @author Ed
 */
public class UserBO {

    private UuidVO id;

    private String name;

    private String age;

    private String email;

    private String document;

    private String phoneNumber;

    private String password;

    private AddresBO addres;

    public UserBO(UuidVO id, String name, String age, String email, String document,
            String phoneNumber, String password, AddresBO addres) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.document = document;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.addres = addres;
    }

    public UuidVO getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getDocument() {
        return document;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AddresBO getAddres() {
        return addres;
    }

    public String getPassword() {
        return password;
    }

}
