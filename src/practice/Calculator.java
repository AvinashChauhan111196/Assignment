package practice;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        int resultAdd = calculate(num1, num2, "add");
        System.out.println(num1 + " + " + num2 + " = " + resultAdd);
        
        int resultSubs = calculate(num1, num2, "subs");
        System.out.println(num1 + " - " + num2 + " = " + resultSubs);
        
        int resultMult = calculate(num1, num2, "multiplication");
        System.out.println(num1 + " * " + num2 + " = " + resultMult);
        
        int resultDiv = calculate(num1, num2, "division");
        System.out.println(num1 + " / " + num2 + " = " + resultDiv);
    }
    
    public static int calculate(int num1, int num2, String operation) {
        int result = 0;
        
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subs":
                result = num1 - num2;
                break;
            case "multiplication":
                result = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
        
        return result;
    }
}