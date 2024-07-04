package Array;

import java.util.Scanner;

public class arraysearching {
    public static void main(String[] args) {
        String[] Friends = {"Kani", "Aarthi", "Anisha", "Brindha", "Abinaya", "Aishu"};
        Scanner scan = new Scanner(System.in);

        System.out.println(Friends.length);
        System.out.println("Who is you best friend ? ");
        String best = scan.next();

        for (int pos = 0; pos < Friends.length; pos++)
        {
            if (best.equalsIgnoreCase(Friends[pos]))
            {
                System.out.println(best + " is my best friend");
            }
            else
            {
                System.out.println(best + " is not found in your friends list");
            }
        }
    }
}
