package com.store.storeapi.services;

import com.store.storeapi.entities.Subsidiary;
import com.store.storeapi.repositories.SubsidiaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsidiaryService {

    private final SubsidiaryRepository subsidiaryRepository;

    public SubsidiaryService(SubsidiaryRepository subsidiaryRepository) {
        this.subsidiaryRepository = subsidiaryRepository;
    }

    public Subsidiary saveSubsidiary(Subsidiary sub) {
        return subsidiaryRepository.save(sub);
    }

    public List<Subsidiary> getAllSubsidiaries() {
        return subsidiaryRepository.findAll();
    }
}
