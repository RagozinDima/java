import java.util.Scanner;

/**
 * Created by Nataly on 04.12.2016.
 */
public class zadacha7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter month number");
        int month = sc.nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autimn");
        } else {
            System.out.println("wrong number");
        }
        }
    }
