package com.store.storeapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_subsidiary")
public class Subsidiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private Address address;

    public Subsidiary() {
    }

    public Subsidiary(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
