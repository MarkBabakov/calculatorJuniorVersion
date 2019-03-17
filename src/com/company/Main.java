package com.company;

public class Main {


    public static void main(String[] args) {


        System.out.println("Здравствуйте! Вас приветствует калькулятор.");
        Menu menu = new Menu();
        menu.menu();

        Processor processor = new Processor(menu);
        processor.processor();


    }
}
