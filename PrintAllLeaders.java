package PlacementProblem;

import java.util.Scanner;

public class PrintAllLeaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = new int[n];
        int leader = 0;
        int i = 0;
        for(int j=n-1;j>=0;j--){
            if(arr[j] >= leader){
                res[i++] = arr[j];
                leader = arr[j];
            }
        }

        for(int k=i-1;k>=0;k--){
            System.out.print(res[k] + " ");
        }
    }
}
