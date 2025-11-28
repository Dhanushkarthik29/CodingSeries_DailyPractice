import java.util.*;

class Kadanes {

    public static int[] MaxSubArray(int arr[]) {
        int curSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int s = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if (curSum > MaxSum) {
                MaxSum = curSum;
                start = s;
                end = i;
            }

            if (curSum < 0) {
                curSum = 0;
                s = i + 1;
            }
        }

        return new int[]{MaxSum, start, end};
    }

    public static void main(String[] args) {
        int arr[] = {4, -1, 2, -7, 3, 4};

        int result[] = MaxSubArray(arr);

        System.out.println("Max Sum: " + result[0]);
        System.out.println("Start index: " + result[1]);
        System.out.println("End index: " + result[2]);
    }
}
