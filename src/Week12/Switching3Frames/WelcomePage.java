/*
 * NetBeans default comment.
 * This file demonstrates different search algorithms
 * and compares their time complexity.
 */
package Week15To16; 
// Declares the package name where this class belongs

import java.util.HashMap;
// Imports HashMap for hashing demonstration (O(1) average lookup)

import java.util.Arrays;
// Imported but not used here; usually used for array utilities

public class TimeComplexityDemo {
    // Main class for demonstrating time complexity

    public static void main(String[] args) {

        // Create an integer array with size 10
        int[] data = new int[10];

        // Fill the array with values 0 to 9
        // This loop runs 10 times → O(n)
        for (int i = 0; i < 10; i++) {
            data[i] = i;
        }

        // Target value we want to search in the array
        int target = 7;

        // ===================== LINEAR SEARCH =====================

        // Record the start time before executing linear search
        long startTime = System.nanoTime();

        // Call linear search method
        int linearResult = linearSearch(data, target);

        // Record the end time after linear search
        long endTime = System.nanoTime();

        // Display results for linear search
        System.out.println("Linear Search:");
        System.out.println("Found at index: " + linearResult);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds\n");

        // ===================== BINARY SEARCH =====================

        // Record the start time before binary search
        startTime = System.nanoTime();

        // Call binary search method (array must be sorted)
        int binaryResult = binarySearch(data, target);

        // Record the end time after binary search
        endTime = System.nanoTime();

        // Display results for binary search
        System.out.println("Binary Search:");
        System.out.println("Found at index: " + binaryResult);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds\n");

        // ===================== HASHING =====================

        // Record the start time for HashMap setup
        startTime = System.nanoTime();

        // Create a HashMap where the key is the number
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Insert all numbers into the HashMap
        // Average time complexity: O(n)
        for (int num : data) {
            map.put(num, true);
        }

        // Record time after HashMap setup
        long setupEndTime = System.nanoTime();

        // Check if the target exists in the HashMap
        // Average lookup time: O(1)
        boolean hashResult = map.containsKey(target);

        // Record end time after lookup
        endTime = System.nanoTime();

        // Display hashing results
        System.out.println("Hashing:");
        System.out.println("HashMap Setup Time: " + (setupEndTime - startTime) + " nanoseconds");
        System.out.println("HashMap Lookup Time: " + (endTime - setupEndTime) + " nanoseconds");
        System.out.println("Found: " + hashResult);
    }

    // ===================== LINEAR SEARCH METHOD =====================

    // Linear Search checks each element one by one
    // Time Complexity: O(n)
    public static int linearSearch(int[] data, int target) {

        // Loop through the entire array
        for (int i = 0; i < data.length; i++) {

            // Compare current element with target
            if (data[i] == target) {

                // Return index if target is found
                return i;
            }
        }

        // Return -1 if target is not found
        return -1;
    }

    // ===================== BINARY SEARCH METHOD =====================

    // Binary Search repeatedly divides the search range in half
    // Time Complexity: O(log n)
    // Note: Array must be sorted
    public static int binarySearch(int[] data, int target) {

        // Initialize left and right pointers
        int left = 0, right = data.length - 1;

        // Continue searching while left pointer is less than or equal to right
        while (left <= right) {

            // Calculate middle index safely
