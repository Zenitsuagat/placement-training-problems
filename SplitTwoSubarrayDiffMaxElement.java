/* Given an array, your task is to split the array into two subarray such that difference
* between their maximum element is minimum
* Input : 4            (or) 3
*         7 9 5 10          6 6 6
* Output : 1                0*/

package PlacementProblem;

import java.util.Scanner;

public class SplitTwoSubarrayDiffMaxElement {

    public static void firstMaxSecondMax(int[] arr){
        int n = arr.length;
        int first = arr[0];
        int second = arr[0];
        int firstIndex = 0;
        for(int i=1;i<n;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
                firstIndex = i;
            }
        }
        if(firstIndex == 0){
            System.out.println(arr[0]);
            for(int i=1;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else{
            for(int i=0;i<firstIndex;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for(int i=firstIndex;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        System.out.println(first - second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        firstMaxSecondMax(arr);
    }
}
