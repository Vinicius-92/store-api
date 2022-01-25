package com.store.storeapi.dto.address;

public class AddressDTO {
    private String street;
    private String number;
    private String complement;
    private String zipcode;

    public AddressDTO(String street, String number, String complement, String zipcode) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
