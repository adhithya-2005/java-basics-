import java.util.Scanner;

public class Flowchart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("  ┌───────────┐");
        System.out.println("  │  START    │");
        System.out.println("  └─────┬─────┘");
        System.out.println("        │");
        System.out.println("  ┌───────────────┐");
        System.out.println("  │ Choose Option │");
        System.out.println("  │ 1. Voting Age │");
        System.out.println("  │ 2. Loan       │");
        System.out.println("  │ 3. Traffic    │");
        System.out.println("  └─────┬─────────┘");
        System.out.print("        │ Enter choice: ");

        int choice = sc.nextInt();
        System.out.println("        │");
        System.out.println("        v");

        switch (choice) {
            case 1:
                // Voting Age
                System.out.print("   Enter Age: ");
                int age = sc.nextInt();
                System.out.println("        │");
                System.out.println("        v");
                System.out.println("  ┌─────────────────┐");
                System.out.println("  │  Age >= 18 ?    │");
                System.out.println("  └─────┬─────┬─────┘");

                if (age >= 18) {
                    System.out.println("        │YES");
                    System.out.println("        v");
                    System.out.println("  ┌─────────────────┐");
                    System.out.println("  │ Eligible to Vote│");
                    System.out.println("  └─────┬───────────┘");
                } else {
                    System.out.println("        │NO");
                    System.out.println("        v");
                    System.out.println("  ┌────────────────────┐");
                    System.out.println("  │ Not Eligible Vote  │");
                    System.out.println("  └─────┬──────────────┘");
                }
                break;

            case 2:
                // Loan Eligibility
                System.out.print("   Enter Age: ");
                int loanAge = sc.nextInt();
                System.out.print("   Enter Salary: ");
                int salary = sc.nextInt();

                System.out.println("        │");
                System.out.println("        v");
                System.out.println("  ┌───────────────────────────────┐");
                System.out.println("  │ Age >= 21 AND Salary >=25000? │");
                System.out.println("  └─────┬─────────┬──────────────┘");

                if (loanAge >= 21 && salary >= 25000) {
                    System.out.println("        │YES");
                    System.out.println("        v");
                    System.out.println("  ┌─────────────────┐");
                    System.out.println("  │  Loan Approved  │");
                    System.out.println("  └─────┬───────────┘");
                } else {
                    System.out.println("        │NO");
                    System.out.println("        v");
                    System.out.println("  ┌────────────────────┐");
                    System.out.println("  │ Loan Not Approved  │");
                    System.out.println("  └─────┬──────────────┘");
                }
                break;

            case 3:
                // Traffic Light
                System.out.print("   Enter Light Color (RED/YELLOW/GREEN): ");
                String color = sc.next().toUpperCase();
                System.out.println("        │");
                System.out.println("        v");
                System.out.println("  ┌───────────────┐");
                System.out.println("  │ Light Color ? │");
                System.out.println("  └─────┬─────────┘");

                switch (color) {
                    case "RED":
                        System.out.println("        │ RED");
                        System.out.println("        v");
                        System.out.println("  ┌─────────┐");
                        System.out.println("  │  STOP   │");
                        System.out.println("  └─────┬───┘");
                        break;
                    case "YELLOW":
                        System.out.println("        │ YELLOW");
                        System.out.println("        v");
                        System.out.println("  ┌─────────┐");
                        System.out.println("  │  READY  │");
                        System.out.println("  └─────┬───┘");
                        break;
                    case "GREEN":
                        System.out.println("        │ GREEN");
                        System.out.println("        v");
                        System.out.println("  ┌─────────┐");
                        System.out.println("  │   GO    │");
                        System.out.println("  └─────┬───┘");
                        break;
                    default:
                        System.out.println("        │ INVALID INPUT");
                        System.out.println("        v");
                        System.out.println("  ┌──────────────┐");
                        System.out.println("  │   ERROR      │");
                        System.out.println("  └─────┬────────┘");
                }
                break;

            default:
                System.out.println("        │ INVALID CHOICE");
                System.out.println("        v");
                System.out.println("  ┌──────────────┐");
                System.out.println("  │   ERROR      │");
                System.out.println("  └─────┬────────┘");
        }

        System.out.println("        │");
        System.out.println("        v");
        System.out.println("  ┌───────────┐");
        System.out.println("  │   END     │");
        System.out.println("  └───────────┘");

        sc.close();
    }
}