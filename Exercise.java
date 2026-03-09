import java.util.Scanner;

public class Exercise
{
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
    
        int score;
        System.out.println("Enter Test score: ");
            score = keyboard.nextInt();
        do 
        {
            System.out.println("invalid score");
            System.out.println("Enter Test score: ");
            score = keyboard.nextInt();
             
        }
            while (score < 0 || score > 100);
        
        if (score >= 90 && score <= 100) {
            System.out.println("A range");
        } else if (score >= 80 && score < 90) {
            System.out.println("B range");
        } else if (score < 80) {
            System.out.println("below B range");
        } 



        System.out.print("Enter number (-1 to stop): ");

        int number = keyboard.nextInt();

        int sum = 0;

        while(number != -1) {
            sum += number;

            System.out.println("Enter number (-1 to stop): ");
            number keyboard.nextInt();
        }
        System.out.println("The sum is " + sum);
        
    }
}