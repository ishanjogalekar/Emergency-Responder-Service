/*
Developed by Ishan Jogalekar
 */
package com.eme_res.emergency_responder_user.model;

import javax.persistence.*;
import java.io.Serializable;

//JPA class with Hibernate to fetch data from Database
@Entity
@Table(name="userdata")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //Checking columns of database
    @Column(name = "r_name")
    private String RName;
    @Column(name = "need")
    private String need;
    @Column(name="disas")
    private String disas;
    @Column(name = "contact")
    private String contact;
    @Column(name = "email")
    private String email;
    @Column(name = "city")
    private String city;
    @Column(name = "district")
    private String district;
    @Column(name = "state")
    private String state;


    //Getter & setter method

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRName() {
        return RName;
    }

    public void setRName(String RName) {
        this.RName = RName;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    public String getDisas() {
        return disas;
    }

    public void setDisas(String disas) {
        this.disas = disas;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
