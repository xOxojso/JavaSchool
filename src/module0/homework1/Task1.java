package module0.homework1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 1 Нужно считать с консоли число, создать целочисленный массив размером введенного числа,
 * заполнить его (с помощью класса Random)
 * Пробежаться по циклу и найти освпадающее число с введенным (второе введенное число),
 * вывести в консоль(нашлось или нет) вывод результата совпадения реализовать с foreach.
 * <p>
 * 2 Найти наибольшее число в данном массиве.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите первое число:");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }


        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();
        for (int j : arr) {
            if (j == num2) {
                System.out.println("Совпадение найдено");
            }
        }

        System.out.println("==================================================");
        int maxNumber = Integer.MIN_VALUE;
        for(int i : arr) {
            maxNumber = Math.max(maxNumber,i);
        }
        System.out.println("максимальное число в массиве: " + maxNumber);
    }
}
