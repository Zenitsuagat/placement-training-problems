package PlacementProblem;

import java.util.Scanner;

public class MergeTheSortedArrayIntoTwoArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for(int i=0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

        int one = 0;
        while(one < m){
            if(arr1[one] > arr2[0]){
                int temp = arr1[one];
                arr1[one] = arr2[0];
                arr2[0] = temp;
            } else {
                one++;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr2[i] > arr2[j]){
                    int temp = arr2[i];
                    arr2[i] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }

        for(int i=0;i<m;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }

}
