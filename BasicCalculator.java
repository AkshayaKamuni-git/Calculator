import java.util.Scanner;

public class BasicCalculator {

    static double calculate(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) return a / b;
                System.out.println("Error: Division by zero");
                return 0;
            case '%':
                if (b != 0) return a % b;
                System.out.println("Error: Modulo by zero");
                return 0;
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }

    public static void main(String[] args) {
            System.out.println("===== Basic Calculator =====");
            Scanner sc = new Scanner(System.in);
            try{
            while (true) {
                System.out.print("\nEnter first number: ");
                double num1 = sc.nextDouble();
                
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
                
                System.out.print("Enter operator (+, -, *, /,%) or x to exit: ");
                char op = sc.next().charAt(0);
                
                if (op == 'x' || op == 'X') {
                    System.out.println("Calculator Closed");
                    break;
                }
                
                double result = calculate(num1, num2, op);
                System.out.println("Result: " + result);
        }
     }
     catch(Exception e){

     }
    }
}
