package com.gaurav.search;

/**
 * @author gsinha
 * Find the maximum element in an array which is first increasing and then decreasing
 */
public class HighestNumber {
    public static void main(String[] args) {
        int arr[] = {1, 3, 50, 10, 9, 7, 6};
        int n = arr.length;
        System.out.println("The maximum element is " +
                findMaximum(arr, 0, n - 1));
    }

    private static int findMaximum(int[] a, int start, int end) {
        if (start == end) {
            return a[start];
        }
        if (end == start + 1 && a[start] > a[end]) {
            return a[start];
        }
        if (end == start + 1 && a[start] < a[end]) {
            return a[end];
        }
        int mid = (start + end) / 2;
        if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
            return a[mid];
        }
        if (a[mid] > a[mid + 1] && a[mid] < a[mid - 1]) {
            return findMaximum(a, start, mid - 1);
        } else
            return findMaximum(a, mid + 1, end);
    }
}
