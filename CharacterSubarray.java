/* Given an character array containing lower case, your task is to print
 maximum length of subarray such that the first and last element of the
 subarray are same

 Input : a b c d a (or) g r e e n
 Output : 5 (or) 2
 */

package PlacementProblem;

import java.util.Scanner;

public class CharacterSubarray {

    public static void startingAndEnding(char[] arr){
        int n = arr.length;
        int[] first = new int[26];
        for(int i=0;i<26;i++){
            first[i] = -1;
        }

        int max = 0;
        for(int i=0;i<n;i++){
            int index = arr[i] - 'a';
            if(first[index] == -1){
                first[index] = i;
            } else{
                int len = i - first[index] + 1;
                max = Math.max(max, len);
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
        startingAndEnding(arr);
    }
}
