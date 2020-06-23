import java.util.*;
public class bankSystem {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bank Admin Menu:");
        System.out.println("Please Enter A Menu option:");
        System.out.println("1. Add customer to the bank.");
        System.out.println("2. Change customer name.");
        System.out.println("3. Check account balance.");
        System.out.println("4. Modify account balance.");
        System.out.println("5. Summary of all accounts.");
        System.out.println("0. Quit the system.");
        int choice = in.nextInt();
           
        int size = 0;
        double[] accBalance = new double[250];
        String[] accNames = new string[250];
            
        switch(choice) {
            case 1:
                //  Add customer
                {
                    System.out.println("Add Customer Menu:");
                    System.out.println("Enter the account balance:");
                    double bal = in.nextDouble();
                    accBalance[size] = bal;
                    System.out.println("Enter the account name: ");
                    in.hasNextLine();   //  Clear the buffer
                    String name = in.nextLine();
                    accNames[size] = name;
                    System.out.println("Customer ID: "+size);
                    size += 1;
                }
                break;
            case 2:
                //  Change name
                break;
            case 3:
                //  Check balance
                break;
            case 4:
                //  Modify
                break;
            case 5:
                //  Summary
                break;
            case 0:
                System.out.println("Thank you for using this application");
                System.exit(0);
                break;
            default:
                System.out.println("Something went wrong.");
                System.exit(1);
        }

    }
}