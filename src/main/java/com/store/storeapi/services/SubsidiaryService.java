package com.store.storeapi.services;

import com.store.storeapi.dto.subsidiary.SubsidiaryMapper;
import com.store.storeapi.dto.subsidiary.UpdateSubsidiaryDTO;
import com.store.storeapi.entities.Subsidiary;
import com.store.storeapi.exceptions.EntityNotFoundException;
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

    public Subsidiary getById(Long id) {
        return subsidiaryRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Subsidiary not found."));
    }

    public Subsidiary updateSubsidiary(UpdateSubsidiaryDTO sub, Long id) {
        var originalSub = getById(id);
        sub.setId(originalSub.getId());
        return subsidiaryRepository.save(SubsidiaryMapper.fromUpdateDTO(sub));
    }
}
