/* Given an array the task is to rearrange elements like positive and negative without changing
* relative order of positive and negative number. In case of extra positive and negative elements,
* they appear at the end of the array
*
* Input : 1 2 3 -4 -1 4
* Output : 1 -4 2 -1 3 4
* */

package PlacementProblem;

import java.util.Scanner;

public class AlternativePositiveAndNegativeNumber {

    public static void alterInONN(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        int index = 0;
        while(index < n){
            boolean positive = false;
            boolean negative = false;

            if(index % 2 == 0){
                for(int i=0;i<n;i++) {
                    if (arr[i] != 0 && arr[i] > 0) {
                        res[index] = arr[i];
                        arr[i] = 0;
                        positive = true;
                        break;
                    }
                }
            } else{
                for(int i=0;i<n;i++){
                    if(arr[i] != 0 && arr[i] < 0){
                        res[index] = arr[i];
                        arr[i] = 0;
                        negative = true;
                        break;
                    }
                }
            }

            if(positive || negative){
                index++;
            } else{
                break;
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                res[index++] = arr[i];
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }
    }

    public static void alterInON(int[] arr){
        int n = arr.length;
        int[] posArr = new int[n];
        int[] negArr = new int[n];
        int posInd = 0;
        int negInd = 0;

        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                posArr[posInd++] = arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                negArr[negInd++] = arr[i];
            }
        }

        int index = 0;
        int ind1 = 0;
        int ind2 = 0;
        while(ind1 <= posInd - 1 && ind2 <= negInd - 1 && index <= n - 1){
            if(index % 2 == 0){
                arr[index++] = posArr[ind1++];
            } else{
                arr[index++] = negArr[ind2++];
            }
        }

        while(ind1 <= posInd - 1){
            arr[index++] = posArr[ind1++];
        }

        while(ind2 <= negInd - 1){
            arr[index++] = negArr[ind2++];
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

//        alterInONN(arr);
        alterInON(arr);
    }
}
