package Lab2;

import java.util.Scanner;
public class Lab2{
    public static void main(String[] args) {
        int f = 1;
        System.out.print("Введите число от 0 до 14: ");
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        if (input_number < 15) {
            for(int i = 1; i <= input_number; ++i) {
                f *= i;
            }

            System.out.print(input_number + "! = " + f);
        } else {
            System.out.print("Введите число меньше 15");
        }

        scanner.close();
    }
}