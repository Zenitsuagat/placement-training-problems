/* Given an array find the element that appears n/2 times. If no such elements return -1
*
* Input : 1 1 2 1 3 5 1 (or) 2 13
* Output : 1 (or) -1
* */

package PlacementProblem;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int maj = arr[n/2];
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == maj){
                count++;
            }
        }

        if(count > n / 2){
            System.out.println(maj);
        } else{
            System.out.println(-1);
        }
    }
}
