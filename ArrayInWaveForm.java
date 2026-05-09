/* Given an sorted array rearrange elements in place to form a wave like array.
* An array is said to be wave form if it satisfy the following pattern
* arr[0] >= arr[1], arr[1] <= arr[2], arr[2] >= arr[3]
*
* Input : 1 2 3 4 5 (or) 2 4 7 8 9 10
* Output : 2 1 4 3 5 (or) 4 2 8 7 10 9
* */

package PlacementProblem;

import java.util.Scanner;

public class ArrayInWaveForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
    }
}
