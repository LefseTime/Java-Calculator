import java.util.Scanner;

class Calculator {

    public Calculator(){

    }

    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (0==0) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a calculation:");

            double a = input.nextDouble();
            String operand = input.next();
            double b = input.nextDouble();

            if (operand.equals("+")){
                double result = calculator.add(a,b);
                System.out.println(result);
            
            } else if (operand.equals("-")){
                double result = calculator.subtract(a,b);
                System.out.println(result);
            
            } else if (operand.equals("*")){
                double result = calculator.multiply(a,b);
                System.out.println(result);
            
            } else if (operand.equals("/")){
                double result = calculator.divide(a,b);
                System.out.println(result);
            
            }
        }
    }
}