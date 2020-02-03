package com.tdd.ch03;

import java.util.Arrays;

public class ArrayRotation {

    public int[] rotate(int[] input, int rotation) {

        int inputLength = input.length;

        int[] buffer;
        if (rotation<0) {
            //1. Buffer
            buffer = new int[rotation * -1];
            for (int i = 0; i < rotation*-1; i++) {
                buffer[i] = input[inputLength+rotation+i];
            }
        }
        else {
            //1. Buffer
            buffer = new int[rotation];
            for (int i = 0; i < rotation; i++) buffer[i] = input[i];
        }

        System.out.println("Buffer: " + Arrays.toString(buffer));

        if (rotation<0) {
            //2. Move the remaining element to tail
            for(int i = inputLength-1; i > (rotation*-1)-1; i--) {
                System.out.println("i="+i);
                input[i] = input[i-(rotation*-1)];
            }
        } else {
            //2. Move the remaining element to front
            for (int i = 0; i < inputLength - rotation; i++) {
                input[i] = input[rotation + i];
            }
        }
        System.out.println("After rotation:" + Arrays.toString(input));

        if (rotation < 0) {
            //3.Copy the buffer to the front
            for (int i = 0; i < rotation*-1; i++) {
                input[i] = buffer[i];
            }
        } else {
            //3.Copy the buffer to the tail
            for (int i = 0; i < rotation; i++) {
                input[i + inputLength - rotation] = buffer[i];
            }
        }
        System.out.println("After copying the buffer:" + Arrays.toString(input));

        return input;
    }
}
