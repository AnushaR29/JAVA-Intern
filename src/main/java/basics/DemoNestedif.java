package basics;
import java.util.Scanner;

public class DemoNestedif {
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter your age..?");
        int age=scan.nextInt();

        if(age>=17)
        {
            System.out.println("Your age is eligible to apply for NEET exam");
            System.out.println("Enter your 12th mark..?");
            int mark=scan.nextInt();
            if((mark>=170) && (age>=18))
            {
                System.out.println("Your mark is also eligible for applying NEET exam");
                System.out.println("What is your major group in 11th grade..?");
                String majorgroup = scan.next();
                if (majorgroup.equals("Biology"))
                {
                    System.out.println("You are eligible to apply for NEET exam");
                }
                else if (majorgroup.equals("Computer"))
                {
                    System.out.println("Study related to chemicals");
                }
                else
                {
                    System.out.println("You cannot apply for NEET exam ");
                }
            }
            else
            {
                System.out.println("You are not eligible to apply for NEET exam");
            }
        }
        else
        {
            System.out.println("You are not eligible to apply for NEET exam ");
        }
    }
}
