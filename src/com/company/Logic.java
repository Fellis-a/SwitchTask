package com.company;

public class Logic {
    public static float Measure(int number, float transfer) {

        switch (number) {
            case 1:
                break;
            case 2:
                transfer = (transfer / 1000000);
                break;
            case 3:
                transfer = (transfer / 1000);
                break;
            case 4:
                transfer = (transfer * 1000);
                break;
            case 5:
                transfer = (transfer * 100);
                break;

            default:
                return 0;


        }
        return transfer;
    }

    public static String Message(int number) {
        String outMessage;
        switch (number) {
            case 1:
                outMessage = "введенная масса в килограммах:";
                break;
            case 2:
                outMessage = "миллиграмм в килограммах::";
                break;
            case 3:
                outMessage = "грамм в килограммах:";
                break;
            case 4:
                outMessage = "тонн в килограммах:";
                break;
            case 5:
                outMessage = "центнеров в килограммах:";
                break;

            default:
                return "введите число от 1 до 5";
        }
        return outMessage;
    }
}
