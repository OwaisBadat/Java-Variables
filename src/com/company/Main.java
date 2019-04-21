package com.company;

public class Main {

    public static void main(String[] args) {

//        //Interger has a width of 32
//        int myMinValue=-2_147_483_648;
//        int myMaxValue=2_147_483_647;
//        int myTotal = (myMinValue/2);
//
//        System.out.println("MyTotal = " + myTotal);
//
//        // byte has a  width of 8
//        byte myByteValue=-128;
//        byte myNewByteValue = (byte) (myByteValue/2);
//        System.out.println("myNewByteValue = " + myNewByteValue);
//
//        //short has width of 16
//        short myShortValue= 33767;
//        short myNewShortValue = (short) (myByteValue/2)
//
//        //long has width of 64
//        long myLongValue = 9_223_372_036_854_755_807L;
//        long myL

        byte myByteVariable = 100;
        short myShortVariable = 2000;
        int myIntValue = 25;

        long LongTotal = 50000l + 10l *(myByteVariable + myShortVariable + myIntValue);
        System.out.println("myLongTotal = " + LongTotal);
    }
}
