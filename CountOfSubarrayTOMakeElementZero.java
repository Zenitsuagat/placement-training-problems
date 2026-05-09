package PlacementProblem;

import java.util.Scanner;

public class CountOfSubarrayTOMakeElementZero {
    public static void minNoOfSubarray(int[] arr){
        int n = arr.length;
        int count = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i-1] < arr[i]){
                count++;
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

        minNoOfSubarray(arr);
    }
}
