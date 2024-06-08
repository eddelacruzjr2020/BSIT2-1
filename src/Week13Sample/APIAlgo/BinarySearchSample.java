/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Sample.APIAlgo;

import java.util.*;


/**
 *
 * @author Edmundo Dela Cruz
 */
public class BinarySearchSample {
     
        public static int binarySearch(int arr[], int first, int last, int key) {

        if (last >= first) {

        int mid = first + (last - first) / 2;

        if (arr[mid] == key) {

        return mid;

        }

        if (arr[mid] > key) {

        return binarySearch(arr, first, mid - 1, key);

        } else {

        return binarySearch(arr, mid + 1, last, key);

        }

        }

        return -1;

        }

        public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };

        int k = 5;

        int last = arr.length - 1;

        int result = binarySearch(arr, 0, last, k);

        if (result == -1)

        System.out.println("Element is not found!");

        else

        System.out.println("Element is found at index: " + result);

    }
    
}
