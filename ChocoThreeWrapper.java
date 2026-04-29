/* One choco cost one rupee, Rohith has n rupees, he brought n choco. The shop offers discount on giving one choco per 3 Wrappers.
So finally how many choco Rohith has eaten

Input : 15
Output : 22
*/

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
