package io.gitlab.lordkorea.simplewaypoints;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Represents a waypoint.
 */
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
public class Waypoint {

    /**
     * The name of this waypoint.
     */
    private final String name;

    /**
     * The x position of this waypoint.
     */
    private final int x;

    /**
     * The y position of this waypoint.
     */
    private final int y;

    /**
     * The z position of this waypoint.
     */
    private final int z;

    /**
     * The RGB encoded color of this waypoint.
     */
    private final int colorRGB;
}
