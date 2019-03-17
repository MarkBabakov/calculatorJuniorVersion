package com.company;


public class Converter {


    String[] Rome = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static int[] Arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private int result;


    public int getResult() {
        return result;
    }


    public int transform(String rome) {
        rome = rome.toUpperCase();

        StringBuffer romeNumber = new StringBuffer(rome);
        int arabNumber = 0, i = 0;

        if (romeNumber.length() > 0) {
            while (true) {
                do {


                    if (Rome[i].length() <= romeNumber.length()) {


                        if (Rome[i].equals(romeNumber.substring(0, Rome[i].length()))) {


                            arabNumber += Arab[i];


                            romeNumber.delete(0, Rome[i].length());

                            if (romeNumber.length() == 0) {
                                result = arabNumber;
                                return arabNumber;
                            }
                        } else

                            break;

                    } else
                        break;

                } while (romeNumber.length() != 0);

                i++;

                if (i > 12) {
                    System.out.println("Пожалуйста, вводите корректные данные");
                    System.exit(1);
                }

            }

        }
        return 0;

    }
}