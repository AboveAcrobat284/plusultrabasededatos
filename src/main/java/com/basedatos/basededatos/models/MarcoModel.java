package com.basedatos.basededatos.models;

import jakarta.persistence.*;
@Entity
@Table(schema = "marco")
public class MarcoModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "postal_marco")
    private int postalMarco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPostalMarco() {
        return postalMarco;
    }

    public void setPostalMarco(int postalMarco) {
        this.postalMarco = postalMarco;
    }

}
