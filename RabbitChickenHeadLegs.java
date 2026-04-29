/* There is a farm that contains rabbits and chickens. Given leg count and head count of total animal
The task is to find the no. of rabbits and no. of chickens are there in the farm

Input : 40 15
Output : 5 10
*/

package PlacementProblem;

import java.util.Scanner;

public class RabbitChickenHeadLegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leg = sc.nextInt();
        int head = sc.nextInt();

        int r = (leg - (2 * head)) / 2;
        int c = head - r;

        System.out.println("Rabbit : "+ r);
        System.out.println("Chicken : "+ c);
    }
}
