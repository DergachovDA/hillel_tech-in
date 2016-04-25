package ua.in.dergachovda.less11.Calculator;

public class Calculator {

    public int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public int add(double operand1, double operand2) {
        return (int) (operand1 + operand2);
    }

    public int subtract(int operand1, int operand2) {
        return operand1 - operand2;
    }

    public int multiply(int operand1, int operand2) {
        return operand1 * operand2;
    }

    public int divide(int operand1, int operand2) {
        return operand1 / operand2;
    }

   public int square(int operand) {
       return operand * operand;
   }

    public static int execute(int op1, int op2, String operation) {
        return op1 + op2;
    }

}
