package org.example;

import java.util.ArrayList;

public class Point {

    private ArrayList<Float> coordinates;

    public Point(ArrayList<Float> coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<Float> getC() {
        return this.coordinates;
    }

    @Override
    public String toString() {
        return "Point{" +
                "coordinates=" + coordinates +
                '}';
    }
}
