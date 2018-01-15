package com.yc;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        LambdaAssignment lambdaTest = new LambdaAssignment();
//        lambdaTest.assignment();

        System.out.println("the inc value is: " + inc());
    }

    public static int inc() {
        int x;
        try{
            x=1;
            return x;
        } catch( Exception e) {
            x=2;
            return x;
        } finally{
            x=3;
        }
    }
}
