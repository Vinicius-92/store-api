package com.store.storeapi.dto.subsidiary;

import com.store.storeapi.dto.address.AddressDTO;

public class UpdateSubsidiaryDTO {
    private Long id;
    private String name;
    private AddressDTO addressDTO;

    public UpdateSubsidiaryDTO() {
    }

    public UpdateSubsidiaryDTO(Long id, String name, AddressDTO addressDTO) {
        this.id = id;
        this.name = name;
        this.addressDTO = addressDTO;
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

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }
}
