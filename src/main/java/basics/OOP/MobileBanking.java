package basics.OOP;
import java.util.Scanner;


class Account{
    public void acc()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Account Number:");
        long acc_no = scan.nextLong();
        System.out.println("Enter the Account Holder Name:");
        String acc_name = scan.next();
    }
    public float acc_bal()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Account Balance:");
        float bal = scan.nextFloat();
        return bal;
    }
}

class DebitCard extends Account{
    public void card(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Card Number:");
        long card_no = scan.nextLong();
    }
    public int pin()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Card PIN Number:");
        int pin_no = scan.nextInt();
        return pin_no;
    }

    static class WithDraw extends DebitCard{
        public void wd()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the amount to be withdraw:");
            float withdrw = scan.nextFloat();
            System.out.println("Enter Your PIN:");
            int cpin = scan.nextInt();

            if(withdrw<=acc_bal())
            {
                if (cpin==pin())
                {
                    System.out.println("Your Amount of "+ withdrw+" has been with drawed");
                }
                else {
                    System.out.println("Your PIN is wrong!!");
                }
            }
            else {
                System.out.println("Amount cannot be withdraw due to insufficient of balance!!");
            }

        }
    }

}


//paying bills

class PayBills{
    public String gpay_name(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your User Name:");
        String name = scan.next();
        return name;
    }
    public int upi_pin(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Set the upi pin:");
        int upi = scan.nextInt();
        return upi;
    }

}
class gpay extends PayBills {
    public void bills() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your User Name:");
        String names = scan.next();
        System.out.println("Enter the upi pin:");
        int upis = scan.nextInt();

        if (names.equals(gpay_name()))
        {
            if (upi_pin()==upis) {
                System.out.println("The Customer " + names + " can make an upi payment successfully");
            } else {
                System.out.println("The UPI Pin is wrong!!");
            }
        }
        else
        {
            System.out.println("Enter the correct user name");
        }
    }

}
public class MobileBanking {
    public static void main(String[] args) {
        DebitCard.WithDraw obj = new DebitCard.WithDraw();


        obj.acc();
        obj.acc_bal();
        obj.card();
        obj.pin();
        obj.wd();
        System.out.println("UPI Transaction!!");
        gpay bill = new gpay();
        bill.gpay_name();
        bill.upi_pin();
        bill.bills();
    }

}
