package TestGrp;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by paragchatterjee on 30/04/2017.
 */
public class FizzBuzz1Test {

    FizzBuzz1 fz1 ;
    int minNumber;
    int maxNumber;
    String[] types;


    @org.junit.Before
    public void setUp() throws Exception {

        fz1= new FizzBuzz1();
        minNumber =1;
        maxNumber =20;
        types = new String[]{"Fizz","Buzz","FizzBuzz","Lucky","Integer"};
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testgetFizzBuzz()
    {
        assertEquals(fz1.getFizzBuzz(minNumber,maxNumber),"12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz");
        assertNotEquals(fz1.getFizzBuzz(minNumber,maxNumber),"1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz fizzbuzz 14 fizzbuzz");
    }

    @Test
    public void testgetFizzBuzzLucky()
    {
        assertEquals(fz1.getFizzBuzzLucky(minNumber,maxNumber),"12Lucky4BuzzFizz78FizzBuzz11FizzLucky14FizzBuzz1617Fizz19Buzz");
        assertNotEquals(fz1.getFizzBuzzLucky(minNumber,maxNumber),"1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz fizzbuzz 14 fizzbuzz");
    }

    @Test
    public void testcountFizzBuzz()
    {
        assertEquals(fz1.countFizzBuzz(minNumber,maxNumber,types[0]),"Fizz:4");
        assertEquals(fz1.countFizzBuzz(minNumber,maxNumber,types[1]),"Buzz:3");
        assertEquals(fz1.countFizzBuzz(minNumber,maxNumber,types[2]),"FizzBuzz:1");
        assertEquals(fz1.countFizzBuzz(minNumber,maxNumber,types[3]),"Lucky:2");
       assertEquals(fz1.countFizzBuzz(minNumber,maxNumber,types[4]),"Integer:10");
        assertNotEquals(fz1.countFizzBuzz(minNumber,maxNumber,types[0]),"1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz fizzbuzz 14 fizzbuzz");
    }
}