package PlacementProblem;

import java.util.Scanner;

public class MaximumProductSubarray {
    public static void findMax(int[] arr){
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;
        int leftToRight = 1;
        int rightToLeft = 1;
        for(int i=0;i<n;i++){
            if(leftToRight == 0){
                leftToRight = 1;
            }
            if(rightToLeft == 0){
                rightToLeft = 1;
            }

            leftToRight *= arr[i];
            int j = n - i - 1;
            rightToLeft *= arr[j];

            maxProd = Math.max(leftToRight, Math.max(rightToLeft, maxProd));
        }

        System.out.println(maxProd);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        findMax(arr);
    }
}
