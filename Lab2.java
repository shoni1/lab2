package Lab2;

import java.util.Scanner;
public class Lab2{
    public static void main(String[] args) {
        int fac = 1;
        System.out.print("Введите число от 0 до 14: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 15) {
            for(int i = 1; i <= num; ++i) {
                fac *= i;
            }

            System.out.print(num + "! = " + fac);
        } else {
            System.out.print("Введите число меньше 15");
        }

        scanner.close();
    }
}
