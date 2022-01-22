package com.store.storeapi.dto.address;

import com.store.storeapi.entities.Address;

public class AddressMapper {
    public static Address fromDTO(AddressDTO dto) {
        return new Address(dto.getStreetName(), dto.getNumber(), dto.getComplement(), dto.getZipcode());
    }

    public static AddressDTO fromEntity(Address address) {
        return new AddressDTO(address.getStreet(),
                address.getNumber(),
                address.getComplement(),
                address.getZipcode());
    }
}
