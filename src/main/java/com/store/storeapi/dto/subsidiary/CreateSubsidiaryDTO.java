package com.store.storeapi.dto.subsidiary;

import com.store.storeapi.dto.address.AddressDTO;

public class CreateSubsidiaryDTO {
    private String name;
    private AddressDTO addressDTO;

    public CreateSubsidiaryDTO() {
    }

    public CreateSubsidiaryDTO(String name, AddressDTO addressDTO) {
        this.name = name;
        this.addressDTO = addressDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }
}
