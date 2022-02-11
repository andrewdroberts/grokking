package com.andrewro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        slidingWindows();
    }


    static void slidingWindows() {

        // Sliding Window
        double[] result = AverageOfSubarrayOfSizeK.findAveragesBruteForce(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));

        result = AverageOfSubarrayOfSizeK.findAveragesSlidingWindow(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));

    }
}
