package PlacementProblem;

import java.util.Scanner;

public class CountAndSay38 {

    public static void countSay(int n){
        String result = "1";
        for(int i=2;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=1;j<result.length();j++){
                if(result.charAt(j) == result.charAt(j-1)){
                    count++;
                } else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count = 1;
                }
            }

            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
        }

        System.out.println(result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countSay(n);
    }

}
