package com.aarambh.aarambhwebapp.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Access(AccessType.PROPERTY)
public class Address {
    private Integer id;
    private String street;
    private String city;
    private String province;
    private String country;
    private String pincode;

    @JoinColumn(name = "user_id")
    @OneToOne(optional = false)
    private Integer user_id;

    @Column(name = "address")
    @NotEmpty(message = "Please provide your Address")
    private String address;

    @Id
    @GeneratedValue
    @Column(name = "address_id")
    public Integer getId() {
        return id;
    }

    public Address setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
