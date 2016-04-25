package ua.in.dergachovda.less11.Calculator;

import ua.in.dergachovda.less11.Calculator.Calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 3);
        System.out.println("result = " + result);
        System.out.println(calculator.square(5));
        System.out.println(calculator.add(5.3, 1.2));
    }

}
