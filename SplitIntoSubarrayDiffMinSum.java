package PlacementProblem;

import java.util.Scanner;

public class SplitIntoSubarrayDiffMinSum {
    public static void diffMinimumSum(int[] arr){
        int n = arr.length;
        int rightSum = 0;
        for(int i=0;i<n;i++){
            rightSum += arr[i];
        }

        int minDiff = Integer.MAX_VALUE;
        int leftSum = 0;
        for(int i=0;i<n;i++){
            leftSum += arr[i];
            rightSum -= arr[i];
            int diff = Math.abs(leftSum - rightSum);
            minDiff = Math.min(minDiff, diff);
        }

        System.out.println(minDiff);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        diffMinimumSum(arr);
    }
}
