package com.tdd.ch03;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayRotationTest {

    int[] input = {8, 3, 4, 9, 1};
    ArrayRotation arrayRotation = new ArrayRotation();

    @Test
    public void rotateArrayByOnePosition() {
        int[] result = arrayRotation.rotate(input, 2);
        int[] expected = {4, 9, 1, 8, 3};
        assert Arrays.equals(result,expected);
    }

    @Test
    public void rotateArrayZeroPosition() {
        int[] result = arrayRotation.rotate(input, 0);
        int[] expected = {8, 3, 4, 9, 1};
        assert Arrays.equals(result,expected);
    }

    @Test
    public void rotateArrayByNegtativePosition() {
        int[] result = arrayRotation.rotate(input, -2);
        int[] expected = {9, 1, 8, 3, 4};
        assert Arrays.equals(result,expected);
    }
}
