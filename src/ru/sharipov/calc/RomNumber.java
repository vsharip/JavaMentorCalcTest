package ru.sharipov.calc;

import java.util.Scanner;

public class RomNumber {

    static Scanner sc = new Scanner(System.in);

    static String str = sc.nextLine().toUpperCase();

    static String[] strArray = str.split("[-+*/]"); //разделение строки str на массив массив строк. В данном случае разделителями является массив символов [-+*/]
    static String strOne = strArray[0];
    static String strTwo = strArray[1];


    static int operatorNumb() {
        int i = 0;
        for (char opr : str.toCharArray()) {
            if (opr == '+') i++;
            if (opr == '-') i++;
            if (opr == '*') i++;
            if (opr == '/') i++;
        }
        return i;
    }

    static void syncOper() throws Exception {      //исключения
        int j = 1;
        try {
            if (operatorNumb() != j) {
                throw new Exception("Введены некорректные данные символы");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    static String confStrOne() {
        String str2 = strOne;
        try {
            if (strOne.matches("-?\\d+(\\.\\d+)?")) {
                int a = Integer.parseInt(strOne);
                str2 = Integer.toString(a);
            } else {
                EnumRomNumber.valueOf(strOne);
                str2 = strOne;
            }
        } catch (ClassCastException e) {
            e.printStackTrace();
            throw e;
        }
        return str2;
    }

    static String confStrTwo() {
        String str2 = strTwo;
        try {
            if (confStrOne().matches("-?\\d+(\\.\\d+)?")) {
                int a = Integer.parseInt(strTwo);
                str2 = Integer.toString(a);
            } else {
                EnumRomNumber.valueOf(strTwo);
                str2 = strTwo;
            }
        } catch (ClassCastException e) {
            e.printStackTrace();
            throw e;
        }
        return str2;
    }


    static int numberOneInt() {
        int romNumber = 0;
        try {
            if (strOne.matches("-?\\d+(\\.\\d+)?")) {
                romNumber = Integer.parseInt(strOne);
                return romNumber;
            } else {
                switch (confStrOne()) {
                    case "I":
                        return 1;
                    case "II":
                        return 2;
                    case "III":
                        return 3;
                    case "IV":
                        return 4;
                    case "V":
                        return 5;
                    case "VI":
                        return 6;
                    case "VII":
                        return 7;
                    case "VIII":
                        return 8;
                    case "IX":
                        return 9;
                    case "X":
                        return 10;
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
        return romNumber;
    }

    static int numberTwoInt() {
        int romNumber = 0;
        try {
            if (strTwo.matches("-?\\d+(\\.\\d+)?")) {
                romNumber = Integer.parseInt(strTwo);
                return romNumber;
            } else {
                switch (confStrTwo()) {
                    case "I":
                        return 1;
                    case "II":
                        return 2;
                    case "III":
                        return 3;
                    case "IV":
                        return 4;
                    case "V":
                        return 5;
                    case "VI":
                        return 6;
                    case "VII":
                        return 7;
                    case "VIII":
                        return 8;
                    case "IX":
                        return 9;
                    case "X":
                        return 10;
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
        return romNumber;
    }


    static int result() {
        int c = 0;
        int a = numberOneInt();
        int b = numberTwoInt();
        char plus = '+', minus = '-', multi = '*', div = '/';
        if (str.indexOf(plus) != -1) {
            c = a + b;
            return c;
        }
        if (str.indexOf(minus) != -1) {
            c = a - b;
            return c;
        }
        if (str.indexOf(multi) != -1) {
            c = a * b;
            return c;
        }
        if (str.indexOf(div) != -1) {
            c = a / b;
            return c;
        }
        return c;
    }

    static String stringResult(int a) {
        String str = "";
        if (strOne.matches("-?\\d+(\\.\\d+)?")) {
            str = Integer.toString(result());
            return str;
        } else {
            while (a >= 100) {
                str += "C";
                a -= 100;
            }
            while (a >= 90) {
                str += "XC";
                a -= 90;
            }
            while (a >= 50) {
                str += "L";
                a -= 50;
            }
            while (a >= 40) {
                str += "XL";
                a -= 40;
            }
            while (a >= 10) {
                str += "X";
                a -= 10;
            }
            while (a >= 9) {
                str += "IX";
                a -= 9;
            }
            while (a >= 5) {
                str += "V";
                a -= 5;
            }
            while (a >= 4) {
                str += "IV";
                a -= 4;
            }
            while (a >= 1) {
                str += "I";
                a -= 1;
            }
        }
        return str;
    }

    public static void resultinfo() {
        try {
            System.out.println(stringResult(result()));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}