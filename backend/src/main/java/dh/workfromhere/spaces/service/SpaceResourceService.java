package dh.workfromhere.spaces.service;

import dh.workfromhere.spaces.exception.SpaceResourceException;
import dh.workfromhere.spaces.model.SpaceResource;
import dh.workfromhere.spaces.repository.SpaceResourceRepository;
import dh.workfromhere.utils.exceptions.ErrorCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceResourceService {

    private final SpaceResourceRepository spaceResourceRepository;

    public SpaceResourceService(SpaceResourceRepository spaceResourceRepository) {
        this.spaceResourceRepository = spaceResourceRepository;
    }

    public List<SpaceResource> getAllSpaces() {
        return spaceResourceRepository.findAll();
    }

    public SpaceResource getSpaceById(Integer id) {
        return spaceResourceRepository.findById(id).orElseThrow(() -> new SpaceResourceException(ErrorCode.SPACE_NOT_FOUND));
    }

    public SpaceResource createSpace(SpaceResource spaceResource) {
        return spaceResourceRepository.save(spaceResource);
    }

    public void updateSpaceById(Integer id, SpaceResource spaceResource) {
        SpaceResource spaceResourceToUpdate = spaceResourceRepository.findById(id).orElseThrow(() -> new SpaceResourceException(ErrorCode.SPACE_NOT_FOUND));

        if (spaceResourceToUpdate != null) {
            spaceResourceToUpdate.setName(spaceResource.getName());
            spaceResourceToUpdate.setDescription(spaceResource.getDescription());
            spaceResourceToUpdate.setType(spaceResource.getType());
            spaceResourceToUpdate.setWifiAvailable(spaceResource.getWifiAvailable());
            spaceResourceToUpdate.setWifiPassword(spaceResource.getWifiPassword());
            spaceResourceToUpdate.setWifiSpeed(spaceResource.getWifiSpeed());

            spaceResourceRepository.save(spaceResourceToUpdate);
        }
    }

    public void deleteSpaceById(Integer id) {
        SpaceResource spaceResourceToDelete = spaceResourceRepository.findById(id).orElse(null);

        if (spaceResourceToDelete != null) {
            spaceResourceRepository.delete(spaceResourceToDelete);
        }
    }
}
