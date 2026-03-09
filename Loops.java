import java.util.Scanner;

public class Loops
{
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        double number = keyboard.nextDouble();
        
        while(number < 0) {
            System.out.println("Error: Number must be non-neg.");
            System.out.print("Try again: ");
            number = keyboard.nextDouble();
        }

        System.out.println("good: " + number);
    }
}