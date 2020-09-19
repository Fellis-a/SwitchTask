package com.company;

public class Logic {
    public static float Measure(int n, float a) {

        switch (n) {
            case 1:
                return a;
            case 2:
                a = (a / 1000000);
                return a;
            case 3:
                a = (a / 1000);
                return a;
            case 4:
                a = (a * 1000);
                return a;
            case 5:
                a = (a * 100);
                return a;

            default:
                return 0;


        }

    }
    public static String Message(int n){
        String outMessage;
        switch (n){
            case 1:
                outMessage = "введенная масса в килограммах:";
                return outMessage ;
            case 2:
                outMessage = "миллиграмм в килограммах::";
                return outMessage;
            case 3:
                outMessage = "грамм в килограммах:";
                return outMessage;
            case 4:
                outMessage = "тонн в килограммах:";
                return outMessage;
            case 5:
                outMessage = "центнеров в килограммах:";
                return outMessage;

            default:
                return "введите число от 1 до 5";
        }
    }
}
