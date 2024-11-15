import java.util.*;
public class Main {
    public static void main(String[] args) {
        int choice;
        char continueOperation;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = input.nextInt();
            System.out.println("Enter the second number");
            int b = input.nextInt();
            System.out.println("Enter the choice");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("The sum of the numbers "+(a+b));
            } else if (choice == 2) {
                System.out.println("The difference of the numbers "+(a-b));
            } else if (choice == 3) {
                System.out.println("The product of the numbers "+(a*b));
            } else if (choice == 4) {
                if (b != 0) {
                    System.out.println("The quotient of the numbers "+(float)(a/b));
                } else {
                    System.out.println("Cannot divide by zero\n");
                }
            } else {
                System.out.println("Invalid choice.Please enter again\n");
            }
            System.out.println("Do you want to continue?(Y/N)");
            continueOperation=input.next().charAt(0);
        } while (continueOperation == 'Y' || continueOperation == 'y');
        System.out.println("Program terminated.");
    }
}
