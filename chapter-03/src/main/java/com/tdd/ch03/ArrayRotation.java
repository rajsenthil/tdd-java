package com.tdd.ch03;

import java.util.Arrays;

public class ArrayRotation {

    public int[] rotate(int[] input, int rotation) {

        int inputLength = input.length;


        int[] buffer;
        if (rotation<0) {
            //1. Buffer
            buffer = new int[rotation * -1];
            for (int i = 0; i < rotation; i++) buffer[i] = input[inputLength-rotation];
        }
        else {
            //1. Buffer
            buffer = new int[rotation];
            for (int i = 0; i < rotation; i++) buffer[i] = input[i];
        }


        if (rotation<0) {
            //2. Move the remaining element to tail
            for (int i = 0; i < rotation; i++) {
                input[inputLength - rotation+i] = input[i];
            }
        } else {
            //2. Move the remaining element to front
            for (int i = 0; i < inputLength - rotation; i++) {
                input[i] = input[rotation + i];
            }
        }
        System.out.println(Arrays.toString(input));

        if (rotation < 0) {
            //3.Copy the buffer to the front
            for (int i = 0; i < rotation; i++) {
                input[i] = buffer[i];
            }
        } else {
            //3.Copy the buffer to the tail
            for (int i = 0; i < rotation; i++) {
                input[i + inputLength - rotation] = buffer[i];
            }
        }
        System.out.println(Arrays.toString(input));

        return input;
    }
}
