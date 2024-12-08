public class exponentialSort {
    public static void search(int[] arr, int num) {
        if (arr[0] == num) {
            System.out.println(num + " was fount at index : 0");
            return;
        }

        int si = 1, ei = arr.length - 1;

        while (si <= ei && arr[si] <= num) {
            si *= 2;
        }

        int index = searchRecursive(arr, num, si / 2, Math.min(si, ei));

        System.out.println(num + " was found at index : " + index);
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

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int num = 8;
        search(arr, num);
    }
}
