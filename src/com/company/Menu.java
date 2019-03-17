package com.company;

import java.util.Scanner;

public class Menu {

    private String actions = "none";
    private String vent = "";
    private String vent1 = "";
    private String[] values = new String[2];
    private String operand = "";
    private boolean goToRome;
    private boolean thisFirstNumber;
    private boolean thisLastNumber;


    public String getAction() {

        return actions;
    }

    public String[] getValues() {

        return values;
    }


    public boolean getConverter() {
        return goToRome;
    }


    private String[] operators = {"-", "+", "/", "*", "^"};
    private String[] arabianNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    Scanner scanner = new Scanner(System.in);


    public void menu() {


        System.out.println("Введите, пожалуйста, ваши данные");
        System.out.println("Enter value:");
        String vent = scanner.nextLine();

        String vent1 = vent.replaceAll("\\s", "");


        boolean isContain;

        for (int i = 0; i < operators.length; i++) {
            isContain = vent1.contains(operators[i]);
            if (isContain == true) actions = operators[i];

        }
        if (actions == "none") {
            System.out.println("Этого я еще к сожалению не умею делать. ");
            System.out.println("Попробуйте действие из перечисленных + - * / ^");

        }


        int last = vent1.length() - 1;
        char lastSymbol = vent1.charAt(last);
        char firstSymbol = vent1.charAt(0);

        String firstSymbolString = String.valueOf(firstSymbol);
        String lastSymbolString = String.valueOf(lastSymbol);

        if (firstSymbolString == actions || lastSymbolString == actions) {
            System.out.println(" Пожалуйста, введите данные");
            System.exit(1);
        }


        boolean firstNumberArabian = false;
        boolean lastNumberArabian = false;

        for (int i = 0; i < arabianNumbers.length; i++) {
            thisFirstNumber = firstSymbolString.contains(arabianNumbers[i]);
            thisLastNumber = lastSymbolString.contains(arabianNumbers[i]);
            if (thisFirstNumber == true) {

                firstNumberArabian = true;
            }

            if (thisLastNumber == true) {

                lastNumberArabian = true;
            }


        }


        if (firstNumberArabian == false || lastNumberArabian == false) goToRome = true;


        switch (actions) {
            case "+":
                operand = "\\+";
                break;
            case "-":
                operand = "-";
                break;
            case "*":
                operand = "\\*";
                break;
            case "/":
                operand = "/";
                break;
            case "^":
                operand = "\\^";
                break;
            default:
                return;
        }


        String[] split = vent1.split(operand);

        if (split[0] != null && split[0] != actions) {
            values[0] = split[0];
        } else {
            System.out.println(" Пожалуйста, введите данные");
            System.exit(1);
        }


        if (split[1] != null && split[0] != actions) {
            values[1] = split[1];
        } else {
            System.out.println(" Пожалуйста, введите данные");
            System.exit(1);

        }
        if (firstNumberArabian != lastNumberArabian) {
            System.out.println(" Пожалуйста, введите данные одного типа");
            System.exit(1);

        }

    }

}

