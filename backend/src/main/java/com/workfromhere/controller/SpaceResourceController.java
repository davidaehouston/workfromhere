package com.workfromhere.controller;

import com.workfromhere.model.SpaceResource;
import com.workfromhere.service.SpaceResourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpaceResourceController {

    private final SpaceResourceService spaceResourceService;

    public SpaceResourceController(SpaceResourceService spaceResourceService) {
        this.spaceResourceService = spaceResourceService;
    }

    @GetMapping("/spaces")
    public ResponseEntity<List<SpaceResource>> getAllSpaces() {
        return ResponseEntity.ok(spaceResourceService.getAllSpaces());
    }
}
