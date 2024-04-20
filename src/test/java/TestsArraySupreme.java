import org.CES.ArraySupreme;
import org.junit.Test;
import static org.junit.Assert.*;

// **************************************************************
// ** This class has different tests of the class ArraySupreme **
// **************************************************************



public class TestsArraySupreme {
    public int addsOddNumbers(int[] numbers){
        int total = 0;
        for (int i = 0; i< numbers.length;i++){
            if ((numbers[i] % 2) != 0){
                total = total + numbers[i];
            }
        }
        return  total;
    }

    @Test
    public void test1() {
        ArraySupreme test1 = new ArraySupreme(5);
        int tol = test1.addOddNumbersArray();
        assertEquals(addsOddNumbers(test1.getNumbers()),tol);

    }

    @Test
    public void test2() {
        ArraySupreme test2 = new ArraySupreme(20);
        int tol = test2.addOddNumbersArray();
        assertEquals(addsOddNumbers(test2.getNumbers()),tol);

    }

    @Test
    public void test3() {
        ArraySupreme test3 = new ArraySupreme(100);
        int tol = test3.addOddNumbersArray();
        assertEquals(addsOddNumbers(test3.getNumbers()),tol);

    }

    @Test
    public void test4() {
        ArraySupreme test4 = new ArraySupreme(7);
        int tol = test4.addOddNumbersArray();
        assertEquals(addsOddNumbers(test4.getNumbers()),tol);

    }
}
