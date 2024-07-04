package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayupdation
{
    public static void main(String[] args)
    {
       String [] Cartoons = {"Shinchan","Doremon","Dorabujji","Chottabheem"};
       System.out.println("Before Updating Values");
       System.out.println(Arrays.toString(Cartoons));

       Scanner scan =new Scanner(System.in);

       System.out.println("Tell us what is the position to update");
       int pos=scan.nextInt();
       System.out.println("What is update/replace value");
       String name=scan.next();
       Cartoons[pos]=name;

       System.out.println("After Updating Values");
       System.out.println(Arrays.toString(Cartoons));
    }
}
