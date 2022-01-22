package com.store.storeapi.dto.subsidiary;

import com.store.storeapi.dto.address.AddressDTO;

public class ReturnSubsidiaryDTO {
    private Long id;
    private String nome;
    private AddressDTO addressDTO;

    public ReturnSubsidiaryDTO() {
    }

    public ReturnSubsidiaryDTO(Long id, String nome, AddressDTO addressDTO) {
        this.id = id;
        this.nome = nome;
        this.addressDTO = addressDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }
}
