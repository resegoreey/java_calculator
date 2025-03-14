import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 =scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Enter second number: ");
        int num2 =scanner.nextInt();

        switch (operator) {
            case "+" :
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*" :
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        }
        scanner.close();
    }
}
