package PlacementProblem;

import java.util.Scanner;

public class ChocoThreeWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = n;
        while(n >= 3){
            if(n % 3 == 0){
                total += n / 3;
                n = n / 3;
            } else{
                total += n / 3;
                n = (n / 3) + (n % 3);
            }
        }

        System.out.println(total);
    }
}
