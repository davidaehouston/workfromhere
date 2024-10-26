package dh.workfromhere.spaces.controller;

import dh.workfromhere.spaces.model.SpaceResource;
import dh.workfromhere.spaces.service.SpaceResourceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpaceResourceController {

    private final String BASE_PATH = "api/v1/spaces/";

    private final SpaceResourceService spaceResourceService;

    public SpaceResourceController(SpaceResourceService spaceResourceService) {
        this.spaceResourceService = spaceResourceService;
    }

    @GetMapping(BASE_PATH)
    public ResponseEntity<List<SpaceResource>> getAllSpaces() {
        return ResponseEntity.ok(spaceResourceService.getAllSpaces());
    }

    @GetMapping(BASE_PATH + "{id}")
    public ResponseEntity<SpaceResource> getSpaceById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(spaceResourceService.getSpaceById(id));
    }

    @PostMapping(BASE_PATH)
    public ResponseEntity<SpaceResource> createSpace(@RequestBody SpaceResource spaceResource) {
        return new ResponseEntity<>(spaceResourceService.createSpace(spaceResource), HttpStatus.CREATED);
    }

    @PutMapping(BASE_PATH + "{id}")
    public ResponseEntity<Void> updateSpace(@PathVariable("id") Integer id, @RequestBody SpaceResource spaceResource) {
        spaceResourceService.updateSpaceById(id, spaceResource);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(BASE_PATH + "{id}")
    public ResponseEntity<Void> deleteSpace(@PathVariable("id") Integer id) {
        spaceResourceService.deleteSpaceById(id);

        return ResponseEntity.noContent().build();
    }
}
