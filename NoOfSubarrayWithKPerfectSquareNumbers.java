/* Given an unsorted array, your task is to find the no.of subarray
* with exactly k no of perfect square numbers
*
* Input : 2 4 9 3
*         2
* Output : 4*/

package PlacementProblem;

import java.util.Scanner;

public class NoOfSubarrayWithKPerfectSquareNumbers {

    public static boolean isPerfectSquare(int num){
        for(int i=2;i<num;i++){
            if(i * i == num){
                return true;
            }
        }
        return false;
    }

    public static void noOfSubarray(int[] arr, int k){
        int n = arr.length;
        int total = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int squareCount = 0;
                for(int l=i;l<=j;l++){
                    if(isPerfectSquare(arr[l])){
                        squareCount++;
                    }
                }

                if(squareCount == k){
                    total++;
                }
            }
        }

        System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        noOfSubarray(arr, k);
    }
}
