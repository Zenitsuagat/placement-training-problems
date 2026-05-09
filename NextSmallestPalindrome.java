/* Given an number in the form of array from 1 to 9, find the next smallest palindrome
* strictly larger than the given number
*
* Input : 9 4 1 8 7 9 7 8 3 2 2 (or) 8 4 7 4
* Output : 9 4 1 8 8 0 8 8 1 4 9 (or) 8 5 5 8
* */

package PlacementProblem;

import java.util.Scanner;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }


    }
}
