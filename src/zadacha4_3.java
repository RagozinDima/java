import java.util.Scanner;

/**
 * Created by Nataly on 07.12.2016.
 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.*/
public class zadacha4_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        double numb = sc.nextDouble();

        double proverka = numb/7;

        if(proverka % 1 == 0){
            System.out.println("Number is integer " +numb*2);
        }else {
            System.out.println("Number is double " +numb);
        }

    }
}
