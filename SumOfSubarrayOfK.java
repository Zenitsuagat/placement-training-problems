/* Given an array, your task is to calculate all the subarray of size k
* Input : 1 2 3 4 5 6  (or)  1 -2 3 -4 5 6
*         3                  2
* Output : 6 9 12 15         -1 1 -1 1 11
* */

package PlacementProblem;

import java.util.Scanner;

public class SumOfSubarrayOfK {
    public static void SlidingWindow(int[] arr, int k){
        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(right < n){
            sum += arr[right];
            if((right - left) + 1 == k){
                System.out.print(sum+" ");
                sum -= arr[left];
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        SlidingWindow(arr, k);
    }
}
