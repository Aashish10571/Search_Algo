/*
 Write a program to find the given element and return its index using interpolation sort.
*/

public class interpolationSort {
    public static int searchRecursive(int[] arr, int num, int si, int ei) {
        int pos;

        if (si <= ei && num >= arr[si] && num <= arr[ei]) {
            pos = si + ((num - arr[si]) * (ei - si)) / (arr[ei] - arr[si]);
            if (arr[pos] == num)
                return pos;

            if (arr[pos] < num)
                return searchRecursive(arr, num, pos + 1, ei);

            return searchRecursive(arr, num, si, pos - 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int num = 8;
        int index = searchRecursive(arr, num, 0, arr.length - 1);

        if (index == -1) System.out.println(num + " was not found in the array.");
        else System.out.println(num + " was found in index : " + index);
    }
}
