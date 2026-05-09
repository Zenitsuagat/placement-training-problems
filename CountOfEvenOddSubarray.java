package PlacementProblem;

import java.util.Scanner;

public class CountOfEvenOddSubarray {

    public static void oddOrEven(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int oddSum = 0;
                int evenSum = 0;
                for(int k=i;k<=j;k++){
                    if(k % 2 == 0){
                        evenSum += arr[k];
                    } else{
                        oddSum += arr[k];
                    }
                }

                if(oddSum == evenSum){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        oddOrEven(arr);
    }
}
