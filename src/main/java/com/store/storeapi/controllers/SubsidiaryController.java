package com.store.storeapi.controllers;

import com.store.storeapi.dto.subsidiary.CreateSubsidiaryDTO;
import com.store.storeapi.dto.subsidiary.ReturnSubsidiaryDTO;
import com.store.storeapi.dto.subsidiary.SubsidiaryMapper;
import com.store.storeapi.dto.subsidiary.UpdateSubsidiaryDTO;
import com.store.storeapi.services.SubsidiaryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/subsidiaries")
public class SubsidiaryController {

    private final SubsidiaryService subsidiaryService;

    public SubsidiaryController(SubsidiaryService subsidiaryService) {
        this.subsidiaryService = subsidiaryService;
    }

    @GetMapping
    public ResponseEntity<Page<ReturnSubsidiaryDTO>> getAllSubsidiaries(@PageableDefault Pageable page) {
        return ResponseEntity.ok(subsidiaryService.getAllSubsidiaries(page)
                .map(SubsidiaryMapper::fromEntity));
    }

    @GetMapping("{id}")
    public ResponseEntity<ReturnSubsidiaryDTO> getById(@PathVariable Long id) {
         var sub = subsidiaryService.getById(id);
        return ResponseEntity.ok(SubsidiaryMapper.fromEntity(sub));
    }

    @PostMapping
    public ResponseEntity<ReturnSubsidiaryDTO> createNewSubsidiary(@RequestBody CreateSubsidiaryDTO dto) {
        var sub = subsidiaryService.saveSubsidiary(SubsidiaryMapper.fromDTO(dto));
        var uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{/id}")
                .buildAndExpand(sub.getId())
                .toUri();
        return ResponseEntity.created(uri).body(SubsidiaryMapper.fromEntity(sub));
    }

    @PutMapping("{id}")
    public ResponseEntity<ReturnSubsidiaryDTO> updateSubsidiary(@RequestBody UpdateSubsidiaryDTO sub, @PathVariable Long id) {
        var updatedSub = subsidiaryService.updateSubsidiary(sub, id);
        return ResponseEntity.ok(SubsidiaryMapper.fromEntity(updatedSub));
    }
}
