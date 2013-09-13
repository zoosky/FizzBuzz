/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fizzbuzz;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 *
 * @author Andreas Kapp
 */
public class FizzBuzzTest {
    
    /**
     * Test of main method, of class FizzBuzz.
     */
    @Test
    public void testMain() {
        String[] args = null;
        FizzBuzz.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testNumbers() {
       
        List result = new FizzBuzz().numbers(5);
        List expected = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(result, is(expected)); 
    }
    
    @Test
    public void testFizzBuzz1(){
       String result =  new FizzBuzz().fizzBuzz(16);
       System.out.println(result);
       String expected = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz16";
        assertEquals(expected, result);
    }
    
    
}
