package com.softserve.practical.dopHW1;

/**
 * Bob needs a fast way to calculate the volume of a cuboid with three values:
 * the length, width and height of the cuboid. Write a function to help Bob with this calculation.
 */
public class VolumeOfCuboid {
    public static void main(String[] args) {
        System.out.println(getVolumeOfCuboid(1, 2, 2));
        System.out.println(getVolumeOfCuboid(6.3, 2, 5));
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

}