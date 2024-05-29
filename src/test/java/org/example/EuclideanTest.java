package org.example;

import org.junit.jupiter.api.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

class EuclideanTest {

    // Statement of variables

    Euclidean euclidean;

    // Point A and B will be used to test "2 Points 2 dimensions"
    Point pointA;
    Point pointB;

    // Point C and D will be used to test "2 Points 3 dimensions"
    Point pointC;
    Point pointD;

    @BeforeEach
    void setUp() {
        // Initialize my variables
        euclidean = new Euclidean();
        pointA = new Point(new ArrayList<>(List.of(10f, 10.5f)));
        pointB = new Point(new ArrayList<>(List.of(3.3f, 7.8f)));
        pointC = new Point(new ArrayList<>(List.of(10f, 4f, 7.8f)));
        pointD = new Point(new ArrayList<>(List.of(-12f, 0.5f, 3.2f)));
    }

    // Point A (10, 10.5)
    // Point B (3.3, 7.8)
    @Test
    @DisplayName("2 Points 2 dimensions")
    void distanceTwoPoints() {
        Double result = euclidean.distance(pointA, pointB);

        // Decimal format helps to format my Float, this is because the test can fail due to
        // the number of decimals
        DecimalFormat df = new DecimalFormat("#.00");

        Assertions.assertEquals("7.22", df.format(result));
    }

    // Point C (10, 4, 7.8)
    // Point D (-12, 0.5, 3.2)
    @Test
    @DisplayName("2 Points 3 dimensions")
    void distanceNDimensional() {
        Double result = euclidean.distance(pointC, pointD);

        // Decimal format helps to format my Float, this is because the test can fail due to
        // the number of decimals
        DecimalFormat df = new DecimalFormat("#.00");

        Assertions.assertEquals("22.75", df.format(result));
    }
}