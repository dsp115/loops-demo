import java.util.Scanner;

public class Loops2
{
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
    
        int age;
        
        do 
        {
            System.out.println("Enter age: ");
            age = keyboard.nextInt();
            if(age < 0 || age > 115) {
                System.out.println("invalid age");
            }
            
        } while (age < 0 || age > 115);

        System.out.println("ok unc: " + age);
    }
}