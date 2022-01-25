package com.store.storeapi.controllers;

import com.store.storeapi.dto.subsidiary.CreateSubsidiaryDTO;
import com.store.storeapi.dto.subsidiary.ReturnSubsidiaryDTO;
import com.store.storeapi.dto.subsidiary.SubsidiaryMapper;
import com.store.storeapi.services.SubsidiaryService;
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
    public ResponseEntity<List<ReturnSubsidiaryDTO>> getAllSubsidiaries() {
        return ResponseEntity.ok(subsidiaryService.getAllSubsidiaries()
                .stream().map(SubsidiaryMapper::fromEntity).collect(Collectors.toList()));
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
}
