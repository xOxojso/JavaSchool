package module0.homework1;

import java.util.Scanner;

/**
 * Реализовать простейший калькулятор используя кострукцию switch-case
 * <p>
 * С консоли вводится два числа, которые будут принимать участие в операции
 * <p>
 * Далее выводится сообщение в таком виде: Выберете операцию:
 * 1 - сложение, 2 - вычитание, 3 - целочисленное деление, 4 - деление с остатком
 * <p>
 * Вывести результат операции.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Выберете операцию: 1 - сложение, 2 - вычитание, 3 - целочисленное деление, 4 - деление с остатком");
        int choice = sc.nextInt();
        int result = 0;
        switch (choice) {
            case 1 -> result = num1 + num2;
            case 2 -> result = num1 - num2;
            case 3 -> result = num1 / num2;
            case 4 -> result = num1 % num2;
            default -> System.out.println("неверный тип");
        }

        System.out.println("результат: " + result);
    }
}
