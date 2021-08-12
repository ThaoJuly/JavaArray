import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.format("arr[%d], ", i);
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        System.out.format("Sum = %d\n", sumElements(arr));

        sortArrayAsc(arr);
        printArray(arr);

//        int[] arr = {1, 2, 3, 4};
//        System.out.println(arr[0]);


//        for (int element : arr) {
//            System.out.format("%d,", element);
//        }
//        System.out.println();

//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.format("%d,", arr[i]);
//        }
//        System.out.println();

//        int j = 0;
//        while ( j < arr.length){
//            System.out.format("%d, ", arr[j]);
//            j++;
//        }
//        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d,", arr[i]);
        }
        System.out.println();
    }

    public static int sumElements(int[] arr) {
        int ret = 0;
        for (int ele : arr) {
            ret += ele;
        }
        return ret;
    }

    public static void sortArrayAsc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
