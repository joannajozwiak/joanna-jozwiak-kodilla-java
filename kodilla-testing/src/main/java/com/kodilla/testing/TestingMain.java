package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String [] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test Ok");
        } else {
            System.out.println ("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int sum = calculator.add(5,3);
        if (sum == 8) {
            System.out.println("Result of add is ok");
        } else {
            System.out.println("error! Result of add is bad!");
        }

        int difference = calculator.subtract(10,3);
        if (difference == 7) {
            System.out.println("Result of subtract is ok");
        } else {
            System.out.println("Error! Result of subtract is bad");
        }

        }


}
