package Object;
import java.util.Scanner;
public class LoanRequest {
    private String clientName;
    private double salary;
    private double loanAmount;
    private double interestRate = 0.10;  // Fixed interest rate of 10%
    private int loanPeriod;  // Loan period in months, maximum 12 months

    // Getters and Setters
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    // Method to validate and set salary
    public void validateAndSetSalary(Scanner scanner) {
        while (true) {
            System.out.println("Enter client salary (must be at least 5,000,000):");
            double inputSalary = scanner.nextDouble();
            if (inputSalary >= 5000000) {
                setSalary(inputSalary);
                break;  // Exit the loop when valid salary is entered
            } else {
                System.out.println("Invalid salary! It must be above 5,000,000.");
            }
        }
    }

    // Method to validate and set loan period
    public void validateAndSetLoanPeriod(Scanner scanner) {
        while (true) {
            System.out.println("Enter loan period in months (maximum 12 months):");
            int inputLoanPeriod = scanner.nextInt();
            if (inputLoanPeriod <= 12) {
                setLoanPeriod(inputLoanPeriod);
                break;  // Exit the loop when valid loan period is entered
            } else {
                System.out.println("Invalid loan period! It must be 12 months or less.");
            }
        }
    }

    // Method to calculate and display the loan repayment schedule
    public void calculateRepayment() {
        double remainingBalance = loanAmount;
        double totalInterest = 0;

        System.out.println("\n--- Loan Repayment Schedule ---");
        System.out.printf("%-10s %-20s %-20s %-20s\n", "Month", "Interest", "Principal", "Remaining Balance");

        for (int month = 1; month <= loanPeriod; month++) {
            double monthlyInterest = remainingBalance * interestRate / 12;
            double monthlyPrincipal = loanAmount / loanPeriod;
            remainingBalance -= monthlyPrincipal;

            totalInterest += monthlyInterest;

            System.out.printf("%-10d %-20.2f %-20.2f %-20.2f\n", month, monthlyInterest, monthlyPrincipal, remainingBalance);
        }

        double totalRepayment = loanAmount + totalInterest;
        System.out.printf("\nTotal Interest Paid: %.2f\n", totalInterest);
        System.out.printf("Total Repayment After 1 Year: %.2f\n", totalRepayment);
    }

    // Method for client to pay the loan
    public void payLoan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter payment amount:");
        double payment = scanner.nextDouble();

        if (payment >= loanAmount) {
            System.out.println("Loan fully paid!");
        } else {
            System.out.println("Loan partially paid. Remaining balance is " + (loanAmount - payment));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a LoanRequest object
        LoanRequest loanRequest = new LoanRequest();

        // Get client details
        System.out.println("Enter client name:");
        String clientName = scanner.nextLine();
        loanRequest.setClientName(clientName);

        // Validate and set salary
        loanRequest.validateAndSetSalary(scanner);

        // Enter loan amount
        System.out.println("Enter loan amount:");
        double loanAmount = scanner.nextDouble();
        loanRequest.setLoanAmount(loanAmount);

        // Validate and set loan period
        loanRequest.validateAndSetLoanPeriod(scanner);

        // If loan is valid, calculate repayment schedule
        loanRequest.calculateRepayment();

        // Client can now pay the loan
        loanRequest.payLoan();
    }



        // Private fields for encapsulation

    }

