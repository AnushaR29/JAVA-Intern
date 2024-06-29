package basics;
import java.util.Scanner;

public class KYC {
    //customer class to hold customer details
    static class Customer {
    String Name;
    String DOB;
    String Contact;
    String Email;
    String Aadhaar;
    String Pan;
    //constructor to initialize customer details
    public Customer() {
        this.Name = Name;
        this.DOB = DOB;
        this.Contact = Contact;
        this.Email = Email;
        this.Aadhaar = Aadhaar;
        this.Pan = Pan;
    }
    //method to display acknowledge message
            public void displayAcknowledgement() {
        System.out.println("Application submitted successfully for " + Name);
            }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner to read user input
        //prompting user for details
        System.out.println("Enter customer details to open an SB account in MEC_BANK:");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Date of birth (dd/mm/yyyy):");
        String dob = scanner.nextLine();
        System.out.println("Contact:");
        String contact = scanner.nextLine();
        System.out.println("Email:");
        String Email = scanner.nextLine();
        System.out.println("Aadhaar:");
        String Aadhaar = scanner.nextLine();
        System.out.println("Pan:");
        String Pan = scanner.nextLine();
        //Creating a customer object with the collected details
        Customer Customer = new Customer ();
        //Displaying the acknowledgement message
        Customer.displayAcknowledgement();
        scanner.close();
    }
}
