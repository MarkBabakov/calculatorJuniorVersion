package com.company;

public class Processor {
    private Menu menu;

    public Processor(Menu menu) {
        this.menu = menu;
    }

    public int A, B;
    private String answer = "";
    Converter converter = new Converter();

    private int[] result = new int[2];

    public int add(int a, int b) {
        this.A = a;
        this.B = b;
        return (a + b);
    }

    public int subtract(int a, int b) {
        this.A = a;
        this.B = b;
        return a - b;
    }

    public int multiply(int a, int b) {
        this.A = a;
        this.B = b;
        return a * b;
    }

    public int divide(int a, int b) {
        this.A = a;
        this.B = b;
        return a / b;
    }

    public double pwr(int a, int b) {
        this.A = a;
        this.B = b;
        return (Math.pow(a, b));
    }

    public void processor() {

        if (menu.getConverter() == false) {
            result[0] = Integer.parseInt(menu.getValues()[0]);
            result[1] = Integer.parseInt(menu.getValues()[1]);
        } else {
            for (int i = 0; i < 2; i++) {
                converter.transform(menu.getValues()[i]);
                result[i] = converter.getResult();
            }
        }


        switch (menu.getAction()) {
            case "+":
                answer = Integer.toString(add(result[0], result[1]));

                break;
            case "-":
                answer = Integer.toString(subtract(result[0], result[1]));
                break;
            case "*":
                answer = Integer.toString(multiply(result[0], result[1]));
                break;
            case "/":
                answer = Integer.toString(divide(result[0], result[1]));
                break;
            case "^":
                answer = Double.toString(pwr(result[0], result[1]));
                break;
            default:
                menu.menu();
                break;

        }
        System.out.println("Ответ:  " + answer);
        System.out.println("");


    }
}
