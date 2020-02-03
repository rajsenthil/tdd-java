package com.tdd.ch03;

import java.util.Arrays;

public class ArrayRotation {

    public int[] rotate(int[] input, int rotation) {

        int inputLength = input.length;

        int[] buffer;
        if (rotation<0) {
            //1. Buffer
            int cRotation = rotation * -1;
            buffer = new int[cRotation];
            for (int i = 0; i < cRotation; i++) {
                buffer[i] = input[inputLength+rotation+i];
            }

            //2. Move the remaining element to tail
            for(int i = inputLength-1; i > cRotation -1; i--) {
                System.out.println("i="+i);
                input[i] = input[i- cRotation];
            }

            //3.Copy the buffer to the front
            for (int i = 0; i < cRotation; i++) {
                input[i] = buffer[i];
            }
        }
        else {
            //1. Buffer
            buffer = new int[rotation];
            for (int i = 0; i < rotation; i++) buffer[i] = input[i];

            //2. Move the remaining element to front
            for (int i = 0; i < inputLength - rotation; i++) {
                input[i] = input[rotation + i];
            }

            //3.Copy the buffer to the tail
            for (int i = 0; i < rotation; i++) {
                input[i + inputLength - rotation] = buffer[i];
            }
        }

        return input;
    }
}
