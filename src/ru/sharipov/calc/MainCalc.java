package ru.sharipov.calc;


public class MainCalc {

    public static void main(String[] args) throws Exception {
        RomNumber.syncOper();
        RomNumber.confStrOne();
        RomNumber.confStrTwo();
        RomNumber.numberOneInt();
        RomNumber.numberTwoInt();
        RangeInteger.rangeInt1();
        RangeInteger.rangeInt2();
        RangeInteger.rangeInt3();
        RangeInteger.rangeInt4();
        RomNumber.result();
        RomNumber.stringResult(RomNumber.result());
        RomNumber.resultinfo();
    }
}