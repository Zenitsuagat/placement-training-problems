/* Given an array the task is to find length of the longest altering
* even odd subarray
*
* Input : 1 2 3 4 5 7 9  (or) 1 3 5
* Output : 5                  0          */

package PlacementProblem;

import java.util.Scanner;

public class LongestOddEvenSubarray {

    public static void longestAlterSubarray(int[] arr){
        int n = arr.length;
        int longest = 0;
        int runningLength = 1;
        for(int i=1;i<n;i++){
            if(arr[i] % 2 != arr[i-1] % 2){
                runningLength++;
                longest = Math.max(longest, runningLength);
            } else{
                runningLength = 1;
            }
        }

        if(longest == 1){
            System.out.println(0);
        } else{
            System.out.println(longest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        longestAlterSubarray(arr);
    }
}
