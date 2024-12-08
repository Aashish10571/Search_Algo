/*
 Write a program to search the given element in the array and return the index of the element using binary search.
*/

import java.util.Scanner;

public class binarySearch {
    public static int search(int[] arr, int num) {
        int si = 0, ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == num) return mid;

            if (arr[mid] < num) si = mid + 1;
            else ei = mid - 1;
        }

        return -1;
    }

    public static int searchRecursive(int[] arr, int num, int si, int ei) {
        if (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == num) return mid;

            if (arr[mid] > num) return searchRecursive(arr, num, si, mid - 1);

            return searchRecursive(arr, num, mid + 1, ei);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Size : ");
        int n = inp.nextInt();
        System.out.println();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array");
        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.println();

        System.out.print("Enter the element you want to search : ");
        int num = inp.nextInt();
        System.out.println();

        int index = searchRecursive(arr, num, 0, arr.length - 1);

        if (index == -1) System.out.println(num + " was not found in the array.");
        else System.out.println(num + " was found in index : " + index);
    }
}
