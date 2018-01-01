package com.yc;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaAssignment {

    public void assignment() {
        //add up numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = addUp(numbers.stream());
        System.out.println(sum);
    }

    private int addUp(Stream<Integer> numbers){
        return numbers.reduce(0, (num1, num2) -> num1 + num2);
    }
}
