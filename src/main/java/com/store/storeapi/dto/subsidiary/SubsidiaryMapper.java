package com.store.storeapi.dto.subsidiary;

import com.store.storeapi.dto.address.AddressMapper;
import com.store.storeapi.entities.Subsidiary;

public class SubsidiaryMapper {

    public static Subsidiary fromDTO(CreateSubsidiaryDTO dto) {
        return new Subsidiary(null, dto.getName(), AddressMapper.fromDTO(dto.getAddress()));
    }

    public static Subsidiary fromUpdateDTO(UpdateSubsidiaryDTO dto) {
        return new Subsidiary(dto.getId(), dto.getName(), AddressMapper.fromDTO(dto.getAddressDTO()));
    }

    public static ReturnSubsidiaryDTO fromEntity(Subsidiary subsidiary) {
        return new ReturnSubsidiaryDTO(subsidiary.getId(),
                subsidiary.getName(),
                AddressMapper.fromEntity(subsidiary.getAddress()));
    }
}
