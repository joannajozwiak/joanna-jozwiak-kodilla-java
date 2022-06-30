package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add (double a, double b) {
       double Add = a+b;
       display.displayValue(Add);
       return Add;
    }

    public double sub (double a, double b) {
        double Sub = a-b;
        display.displayValue(Sub);
        return Sub;
    }

    public double mul (double a, double b) {
        double Mul = a*b;
        display.displayValue(Mul);
        return Mul;
    }

    public double div (double a, double b) {
        double div = a/b;
        display.displayValue(div);
        return div;
    }
}
