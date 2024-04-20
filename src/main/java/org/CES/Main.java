package org.CES;

public class Main {
    public static void main(String[] args) {
        // ********************
        // ** Computer Tests **
        // ********************

        ArraySupreme test1 = new ArraySupreme(5);
        test1.showArray();
        System.out.println(test1.addOddNumbersArray());


        ArraySupreme test2 = new ArraySupreme(4);
        test2.showArray();
        System.out.println(test2.addOddNumbersArray());

        ArraySupreme test3 = new ArraySupreme(20);
        test3.showArray();
        System.out.println(test3.addOddNumbersArray());

        ArraySupreme test4 = new ArraySupreme(40);
        test4.showArray();
        System.out.println(test4.addOddNumbersArray());

        // ***************************************************************
        // ** IMPORTANT: There is a file in test/java whit others tests **
        // ***************************************************************
    }
}