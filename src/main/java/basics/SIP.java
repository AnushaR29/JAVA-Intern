package basics;
import java.util.Scanner;
public class SIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter monthly investment amount: ");
        double monthlyInvestment = scanner.nextDouble();
        System.out.print("Enter expected annual return rate (in %): ");
        double annualReturnRate = scanner.nextDouble();
        System.out.print("Enter investment period (in years): ");
        int years = scanner.nextInt();
        scanner.close();
        double principal = calculatePrincipal(monthlyInvestment, years);
        double totalAmount = calculateSIP(monthlyInvestment, annualReturnRate, years);
        double estimatedReturns = totalAmount - principal;
        System.out.println("Principal Amount: " + principal);
        System.out.println("Estimated Returns: " + estimatedReturns);
        System.out.println("Total Value of Investment: " + totalAmount);
        }
        public static double calculatePrincipal(double monthlyInvestment, int years) {
            return monthlyInvestment * 12 * years;
        }
        public static double calculateSIP(double monthlyInvestment, double annualReturnRate, int years) {
        double monthlyRate = annualReturnRate / 12 / 100;
        int totalMonths = years * 12;
        double futureValue = 0;
        for (int i = 0; i < totalMonths; i++) {
                futureValue += monthlyInvestment * Math.pow(1 + monthlyRate, totalMonths - i);
        }
        return futureValue;
        }
    }

