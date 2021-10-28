package ru.iitdgroup.gpb;

import java.util.Arrays;

public class CalcSum {
    public static int[] windowSum(int[] arr, int windowSize) {
        int[] sum = new int[arr.length-windowSize+1];
        int current = 0;
        for(int i=0; i<windowSize; i++)
            current += arr[i];
        sum[0] = current;
        for(int i=1; i<arr.length-windowSize+1; i++) {
            sum[i] = current + arr[i+windowSize-1] - arr[i-1];
            current = sum[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] num = {4, 2, 73, 11, -5};
        int[] sum = windowSum(num, 2);
        System.out.println(Arrays.toString(sum));
    }

}