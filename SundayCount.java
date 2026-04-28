package PlacementProblem;

import java.util.Scanner;

public class SundayCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startDay = sc.nextLine();
        int days = sc.nextInt();
        int nextSunday;
        switch(startDay){
            case "Monday":
                nextSunday = 6;
                break;
            case "Tuesday":
                nextSunday = 5;
                break;
            case "Wednesday":
                nextSunday = 4;
                break;
            case "Thursday":
                nextSunday = 3;
                break;
            case "Friday":
                nextSunday = 2;
                break;
            case "Saturday":
                nextSunday = 1;
                break;
            default:
                nextSunday = 0;
                break;
        }
        int count = 0;
        days = days - nextSunday;
        count = days / 7;
        System.out.println("Sunday Count : "+(count + 1));
    }
}
