package dev.davidaehouston.workfromhere.spaces.model;

import lombok.Getter;

@Getter
public enum SpaceTypeResource {
    CAFE(1, "Cafe"),
    BAR(2, "Bar"),
    HOT_DESK(3, "Hot Desk");

    private final Integer id;
    private final String name;

    SpaceTypeResource(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
