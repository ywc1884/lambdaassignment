package com.yc;


import java.util.stream.Stream;

public class LambdaAssignment {

    public void assignment() {
        //add up numbers
        int sum = addUp(Stream.of(1, 2, 3, 4, 5, 6));
        System.out.println(sum);
    }

    private int addUp(Stream<Integer> numbers){
        return numbers.reduce(0, (num1, num2) -> num1 + num2);
    }
}
