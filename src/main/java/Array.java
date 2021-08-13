import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("n = ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.format("arr[%d], ", i);
//            arr[i] = sc.nextInt();
//        }

        int[] arr = generateArray(20,0,100);

        int maxIdx = findMaxIndex(arr);
        System.out.format("MAX =%d");

        printArray(arr);
        System.out.format("Sum = %d\n", sumElements(arr));

        System.out.format("MAX =%d\n",findMax(arr));
        System.out.format("MIN =%d\n",findMin(arr));

        int firstNegIdx = findFirstNagativeNumber(arr);
        if (firstNegIdx >=0){
            System.out.format("FirstNegative = %d", Index= %d\n, arr[firstNegIdx],firstNegIdx);
        }else System.out.println(Khong co phan tu am trong day);

        int lastPostIdx = findLastPositiveIndex(arr);
        if (lastPostIdx >=0){
            System.out.format("LastPositive =%d", Index =%d\n, arr[lastPostIdx], lastPostIdx);
        }else System.out.println(Khong co phan tu duong trong day);

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

//    public static int[] generateArray(int n, int min, int max){
//        int[] ret = new int[n];
//        for (int i=0; i<ret.length; i++){
//            ret[i]= (int)Math.floor(Math.radom()*100);
//        }
//        return  ret;
//
//    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxIndex(int[] arr) {
        int idx = 0;

        for (int i = 1; i< arr.length;i++){
            if (arr[i] > arr[idx]) {
                idx = i;
            }
        }
        return idx;
    }

    public  static int findFirstNagativeNumber(int[] arr){
        for (int i =0;i<arr.length; i++){
            if (arr[i]<0){
                return i;
            }
        }
        return -1; // khong co phan tu am
    }

    public  static int findLastPositiveIndex(int[] arr){
        for (int i =arr.length-1; i>=0;i++){
            if (arr[i]>0){
                return i;
            }
        }
        return -1;
    }

    public static int findMinPositiveIndex(int[] arr){
        int lastPosIdx = findLastPositiveIndex(arr);
        if (lastPosIdx <0){
            return -1;
        }
        int minPostIdx = lastPosIdx;
        for (int i =0; i<arr.length; i++){
            if(arr[i]>0 && arr[i] <arr[minPostIdx]){
                minPostIdx=i;
            }
        }
        return minPostIdx;
    }

}

