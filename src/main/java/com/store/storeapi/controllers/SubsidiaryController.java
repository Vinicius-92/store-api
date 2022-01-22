package com.store.storeapi.controllers;

import com.store.storeapi.dto.AddressDTO;
import com.store.storeapi.dto.ReturnSubsidiaryDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1/subsidiaries")
public class SubsidiaryController {

    @GetMapping
    public ResponseEntity<List<ReturnSubsidiaryDTO>> getAllSubsidiaries() {
        var address1 = new AddressDTO("Elm Street", "349", "", "13481489");
        var address2 = new AddressDTO("Cristal Lake Lane", "13", "", "13481666");
        var sub1 = new ReturnSubsidiaryDTO(1L, "Sub Freddy", address1);
        var sub2 = new ReturnSubsidiaryDTO(2L, "Sub Jason", address2);
        return ResponseEntity.ok(new ArrayList<ReturnSubsidiaryDTO>(Arrays.asList(sub1, sub2)));
    }
}
