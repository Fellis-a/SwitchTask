package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("перевод различных единиц массы в килограммы");
        System.out.println("выберите число: 1-килограмм 2-миллиграмм 3-грамм 4-тонна 5-центнер");

        int number = scanner.nextInt();
        if (number > 0 && number < 6) {
            System.out.println("введите массу");
            float transfer = scanner.nextInt();

            float result = Logic.Measure(number, transfer);
            String outMessage = Logic.Message(number);

            System.out.println(outMessage);
            System.out.print(result);
        }
    }
}
