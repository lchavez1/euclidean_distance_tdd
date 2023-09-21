package org.example;

import java.text.DecimalFormat;

public class Euclidean {

    // The euclidean distance is a math formula that calculate the distance
    // between 2 points

    // d = √(xb - xa)2 + (yb - ya)2 ...
    // Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    // (xb - xa)2 sum of each dimension and then square of result

    public Double distance(Point a, Point b) {
        double sum = 0.0;
        for(int i = 0; i < a.getC().size(); i++) {
            sum += Math.pow(b.getC().get(i) - a.getC().get(i), 2);
        }
        return Math.sqrt(sum);
    }
}
