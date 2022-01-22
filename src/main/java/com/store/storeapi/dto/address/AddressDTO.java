package com.store.storeapi.dto.address;

public class AddressDTO {
    private String streetName;
    private String number;
    private String complement;
    private String zipcode;

    public AddressDTO(String streetName, String number, String complement, String zipcode) {
        this.streetName = streetName;
        this.number = number;
        this.complement = complement;
        this.zipcode = zipcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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
