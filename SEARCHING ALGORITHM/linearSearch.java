import java.util.Scanner;

public class linearSearch {
    public static int search(int arr[], int N, int x) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
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
        int x = inp.nextInt();
        System.out.println();

        int result = search(arr, arr.length, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
