package com.store.storeapi.dto.subsidiary;

import com.store.storeapi.dto.address.AddressDTO;

public class CreateSubsidiaryDTO {
    private String name;
    private AddressDTO address;

    public CreateSubsidiaryDTO() {
    }

    public CreateSubsidiaryDTO(String name, AddressDTO addressDTO) {
        this.name = name;
        this.address = addressDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
