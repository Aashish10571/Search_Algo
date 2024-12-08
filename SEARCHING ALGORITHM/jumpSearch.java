/*
 Write a program to search the given element in the array and return its index using jump search.
*/

public class jumpSearch {
    public static int search(int[] arr, int num) {
        int m = (int) Math.sqrt(arr.length);

        int low = 0;
        int high = m;
        int jump = 0;

        if (arr[high] == num) {
            System.out.println("No of jumps : " + jump);
            return high;
        }

        if (arr[low] == num) {
            System.out.println("No of jumps : " + jump);
            return low;
        }

        while (high <= arr.length - 1 && (arr[high] < num && arr[low] < num)) {
            jump++;
            low = high;
            high += m;
        }

        high = Math.min(high, arr.length - 1);

        for (int i = low + 1; i <= high; i++) {
            jump++;
            if (arr[i] == num) {
                System.out.println("No of jumps : " + jump);
                return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int num = 4;
        int index = search(arr, num);

        if (index == -1) System.out.println(num + " was not found in the array.");
        else System.out.println(num + " was found in index : " + index);
    }
}
