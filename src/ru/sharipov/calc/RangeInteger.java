package ru.sharipov.calc;

public class RangeInteger extends RomNumber {


    public static void rangeInt1() throws IllegalArgumentException {
        int a=1;
        try {
            if(numberOneInt()<a) {
                throw new IllegalArgumentException ("Введенное значение находится за пределами разрешенного диапозона ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    public static void rangeInt2() throws IllegalArgumentException {
        int a=10;
        try {
            if(numberOneInt()>a) {
                throw new IllegalArgumentException("Введенное значение находится за пределами разрешенного диапозона ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void rangeInt3() throws IllegalArgumentException {
        int a=1;
        try {
            if(numberTwoInt()<a) {
                throw new IllegalArgumentException("Введенное значение находится за пределами разрешенного диапозона ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    public static void rangeInt4 () throws IllegalArgumentException  {
        int a=10;
        try {
            if(numberTwoInt()>a) {
                throw new IllegalArgumentException("Введенное значение находится за пределами разрешенного диапозона ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
