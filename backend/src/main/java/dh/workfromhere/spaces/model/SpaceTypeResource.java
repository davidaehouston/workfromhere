package dh.workfromhere.spaces.model;

import lombok.Getter;

@Getter
public enum SpaceTypeResource {
    CAFE(1, "Cafe");
    // TODO - More to be added.

    private final Integer id;
    private final String name;

    SpaceTypeResource(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
