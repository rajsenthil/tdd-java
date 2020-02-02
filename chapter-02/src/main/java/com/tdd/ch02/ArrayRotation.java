package com.tdd.ch02;

import java.util.Arrays;

public class ArrayRotation {

    public int[] rotate(int[] input, int rotation) {

        int inputLength = input.length;

        //1. Buffer
        int[] buffer = new int[rotation];
        for (int i = 0; i < rotation; i++) buffer[i] = input[i];


        //2. Move the remaining element to front
        for(int i = 0; i < inputLength-rotation; i++) {
            input[i] = input[rotation+i];
        }
        System.out.println(Arrays.toString(input));

        //3.Copy the buffer to the tail
        for (int i = 0; i < rotation; i++) {
            input[i+inputLength-rotation] = buffer[i];
        }
        System.out.println(Arrays.toString(input));

        return input;
    }
}
