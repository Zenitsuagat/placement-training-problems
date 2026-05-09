package PlacementProblem;

import java.util.Scanner;

public class MaximumAverageSubarrayLengthK {

    public static void maximumSubarray(int[] arr, int k){
        int n = arr.length;
        int avg = 0;
        int maxAvg = 0;
        int runningAvg;
        int maxIndex = -1;
        int left = 0;
        int right = 0;
        while(right < n){
            avg += arr[right];

            if((right - left) + 1 == k){
                runningAvg = avg / k;
                if(maxAvg < runningAvg){
                    maxAvg = runningAvg;
                    maxIndex = left;
                }
                avg -= arr[left];
                left++;
            }

            right++;
        }

        System.out.println(maxIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        maximumSubarray(arr, k);
    }
}
