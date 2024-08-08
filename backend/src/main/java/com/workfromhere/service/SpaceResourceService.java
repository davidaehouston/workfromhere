package com.workfromhere.service;

import com.workfromhere.model.SpaceResource;
import com.workfromhere.repository.SpaceResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceResourceService {

    final SpaceResourceRepository spaceResourceRepository;

    public SpaceResourceService(SpaceResourceRepository spaceResourceRepository) {
        this.spaceResourceRepository = spaceResourceRepository;
    }

    public List<SpaceResource> getAllSpaces() {
        return spaceResourceRepository.findAll();
    }
}
