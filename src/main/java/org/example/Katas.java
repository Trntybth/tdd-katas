package org.example;

import java.util.Arrays;

public class Katas {

    public int ReturnsSumOfMiddleNumbers(int[] integers) {
        // sort array by size
        // ignore first and last element, sum middle elements
        Arrays.sort(integers);

        int[] newArray = Arrays.copyOfRange(integers, 1, integers.length - 1); // new array to store length

        return Arrays.stream(newArray).sum();
    }

    public float calculateMean(int[] integers){
        float sum = Arrays.stream(integers).sum();
        float result = sum / integers.length;

        return result;
    }
}
