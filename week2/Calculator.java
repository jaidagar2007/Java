import java.util.Scanner;

public class CreateCalculator {
    public static void PrintFeature() {
        System.out.println("Enter 1 for Add");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiply");
        System.out.println("Enter 4 for Divide");
        System.out.println("Enter 0 for exit ");
    }

    public static void Calculator(int choice, double number1, double number2) {
        switch (choice) {
            case 1:
                System.out.println("Sum of the given numbers is " + number1 + number2);
                break;
            case 2:
                System.out.println("Subtraction of two number is " + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication of two number is " + number1 * number2);
                break;
            case 4:
                System.out.println("Divide of two number is " + number1 / number2);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        do {
            PrintFeature();
            if (choice < 0 || choice > 4) {
                System.out.println("Invalid choice! Enter between 0 to 5");
            }
            if (choice == 0) {
                System.out.println("");
            }
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            Calculator(choice, num1, num2);
        } while (choice != 0);
        sc.close();
    }
}
