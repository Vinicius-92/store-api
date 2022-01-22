package com.store.storeapi.dto;

public class CreateSubsidiaryDTO {
    private String nome;
    private AddressDTO addressDTO;

    public CreateSubsidiaryDTO() {
    }

    public CreateSubsidiaryDTO(String nome, AddressDTO addressDTO) {
        this.nome = nome;
        this.addressDTO = addressDTO;
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
