package org.CES;


// ********************************************************************
// **   This class creates an array, fills it with numbers           **
// **   between 500 and 1000 and adds the odd numbers in the array   **
// ********************************************************************
public class ArraySupreme {

    // ***************+***
    // **   Attibutes   **
    // *******************

    private int lenght;
    private int[] numbers;

    // *********************************************************
    // ** Constructor that initializes the class ArraySupreme **
    // ** with the length of the array                        **
    // *********************************************************

    public ArraySupreme(int lenght){
        this.lenght = lenght;
        numbers = new int[this.lenght];
        fillArray();
    }

    // *****************************************
    // ** Method that fills the array numbers **
    // ** between 500 and 1000                **
    // *****************************************

    private void fillArray(){
        for (int i = 0; i<this.lenght;i++){
            numbers[i] =  (int)  (Math.random() *  501) + 500;
        }
    }

    // **************************************************************
    // ** Method that returns the add the odd numbers in the array **
    // ***********************************************************++++

    public int addOddNumbersArray(){
        int total = 0;
        for (int number : this.numbers){
           if ((number % 2) != 0){
               total += number;
           }
        }
        return total;
    }
}
