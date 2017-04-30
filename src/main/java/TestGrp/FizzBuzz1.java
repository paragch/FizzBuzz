package TestGrp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class FizzBuzz1 {

    public String countFizzBuzz( int min,  int max, String type){

        long counter =0;
        List<String> available = fizzBuzzLucky(min, max).collect(Collectors.toList()) ;
        StringBuilder b = new StringBuilder(type + ":");

        counter = (type.equals("Integer") ?
                available.stream().filter(s -> Character.isDigit(s.charAt(0)) ).count()
                : available.stream().filter(s -> s.equals(type)).count()) ;

        b.append(counter);
        return b.toString();
    }




    public String getFizzBuzz( int min,  int max){

        List<String> available = fizzBuzz(min, max).collect(Collectors.toList()) ;
        StringBuilder b = new StringBuilder();
        available.forEach(b::append);

       return b.toString();
    }

    public String getFizzBuzzLucky( int min,  int max){

        List<String> available = fizzBuzzLucky(min, max).collect(Collectors.toList()) ;
        StringBuilder b = new StringBuilder();
        available.forEach(b::append);

        return b.toString();
    }


    private static Stream<String> fizzBuzz( int min,  int max) {
        if (min < 0) {
            throw new IllegalArgumentException("min is negative: min = " + min);
        }
        if (min > max) {
            throw new IllegalArgumentException("min > max: min = " + min + " / max = " + max);
        }
        return IntStream.rangeClosed(min, max)
                .mapToObj(FizzBuzz1::fizzBuzzify);
    }

    private static Stream<String> fizzBuzzLucky( int min,  int max) {
        if (min < 0) {
            throw new IllegalArgumentException("min is negative: min = " + min);
        }
        if (min > max) {
            throw new IllegalArgumentException("min > max: min = " + min + " / max = " + max);
        }
        return IntStream.rangeClosed(min, max)
                .mapToObj(FizzBuzz1::fizzBuzzifyLucky);
    }

    private static String fizzBuzzifyLucky(final int value) {
        StringBuilder stringBuilder = new StringBuilder();


        if(String.valueOf(value).contains("3"))
        {
            stringBuilder.append("Lucky");

        }
        else if (value % 15 == 0) {
            stringBuilder.append("FizzBuzz");

        }
        else if (value % 3 == 0) {
            stringBuilder.append("Fizz");

        }
        else if (value % 5 == 0) {
            stringBuilder.append("Buzz");

        }
        else
        {
            stringBuilder.append(String.valueOf(value));
        }

        return stringBuilder.toString();
    }

    private static String fizzBuzzify(final int value) {
        StringBuilder stringBuilder = new StringBuilder();

        if (value % 15 == 0) {
            stringBuilder.append("FizzBuzz");

        }
        else if (value % 3 == 0) {
            stringBuilder.append("Fizz");

        }
        else if (value % 5 == 0) {
            stringBuilder.append("Buzz");

        }
        else
        {
            stringBuilder.append(String.valueOf(value));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {


        System.out.print(new FizzBuzz1().getFizzBuzzLucky(1,20));
        //fizzBuzz(1, 100);
    }
}