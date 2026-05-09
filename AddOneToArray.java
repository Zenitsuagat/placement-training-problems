/* Given an non-negative number represented as array of digits
* Than task is to add 1 to the array and return it
*
* Input : 1 2 4
* Output : 1 2 5
* */

package PlacementProblem;

import java.util.Scanner;

public class AddOneToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=n-1;i>=0;i--){
            if(arr[i] < 9){
                arr[i]++;
                break;
            }
            arr[i] = 0;
        }

        if(arr[0] == 0){
            int[] newArr = new int[n+1];
            newArr[0] = 1;
            for(int i=0;i<n+1;i++){
                System.out.print(newArr[i] + " ");
            }
        } else{
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
