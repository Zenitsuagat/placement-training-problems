

package PlacementProblem;

import java.util.Scanner;

public class SubarraySumAtleastK {
    public static void FindSubarraySum(int[] arr, int target){
        int n = arr.length;
        int total = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                if(sum >= target){
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
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        FindSubarraySum(arr, target);
    }
}
