package com.converterinterface;

public class ConverterApplication {

    public static void main(String[] args) {

        ConverterIf convertIF = new ConverterIf();
        System.out.println(convertIF.convertDay(1));
        System.out.println(convertIF.convertMonth(3));

        ConverterSwitch convertSWITCH = new ConverterSwitch();
        System.out.println(convertSWITCH.convertDay(2));
        System.out.println(convertSWITCH.convertMonth(3));
    }
}
