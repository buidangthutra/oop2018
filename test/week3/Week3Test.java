package week3;

import  org.junit.Test;
import org.junit.*;

public class Week3Test {

    @Test
    public void testMax() {
        assertEquals(5, max(2,5));
        assertEquals(6, max(2,6));
        assertEquals(7, max(2,7)); 
        assertEquals(8, max(2,8));
        assertEquals(9, max(2,9)); 
    }

    /**
     * Test of minOfArray method, of class Week3.
     */
    @Test
    public void testMinOfArray() {
        int[] arr0 = {0,-3,4,3,9};
        int[] arr1 = {3,6,4,14,9};
        int[] arr2 = {7,0,50,42,4};
        int[] arr3 = {1,6,3,4,4,3,9};
        int[] arr4 = {3,4,6,2,43,9};
        
        assertEquals(-3,minOfArray(arr0));
        assertEquals(3,minOfArray(arr1));
        assertEquals(0,minOfArray(arr2));
        assertEquals(1,minOfArray(arr3));
        assertEquals(2,minOfArray(arr4));
        
   }

    /**
     * Test of calculateBMI method, of class Week3.
     */
    @Test
    public void testCalculateBMI() {
        assertEquals("Béo phì",calculateBMI(70,1.65) );
        assertEquals("Thừa cân",calculateBMI(57,1.52) );
        assertEquals("Bình thường",calculateBMI(51,1.65) );
        assertEquals("Thiếu cân",calculateBMI(40,1.6) );
        assertEquals("Béo phì",calculateBMI(60,1.5) );
        
    }
}
