import java.util.*;
import java.io.*;
public class bankSystem {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        int size = 0;
        double[] accBalance = new double[250];
        String[] accNames = new String[250];
        for(;true;) {           //  Returns to original

            System.out.println("Bank Admin Menu:");
            System.out.println("Please Enter A Menu option:");
            System.out.println("1. Add customer to the bank.");
            System.out.println("2. Change customer name.");
            System.out.println("3. Check account balance.");
            System.out.println("4. Modify account balance.");
            System.out.println("5. Summary of all accounts.");
            System.out.println("0. Quit the system.");
            int choice = in.nextInt();   
            
            switch(choice) {
                case 1:
                //  Add customer
                    {
                        
                        String name = "";
                        System.out.println("\n\n\n\nAdd Customer Menu:");
                        System.out.println("\nEnter the account balance:");
                        double bal = in.nextDouble();
                        accBalance[size] = bal;
                        in.nextLine();      //  Clear the buffer
                        
                        System.out.println("\nEnter the account name: ");
                        name = in.nextLine();
                        accNames[size] = name;
                        System.out.println("\n\nPress Enter!");
                        in.nextLine();      //  Clear the buffer
                        
                        System.out.println("\nCustomer ID: "+size);
                        size += 1;
                    }
                    break;
                case 2:
                //  Change name
                    {
                        
                        System.out.println("\n\n\n\nChange customer Name");
                        System.out.println("\nPlease enter customer ID to change their name: ");
                        int id = in.nextInt();
                        System.out.println("\nWhat is the customer\'s new name? ");
                        in.hasNextLine();
                        accNames[id] = in.nextLine();
                    }
                    break;
                case 3:
                //  Check balance
                    {
                        
                        System.out.println("\n\n\n\nCheck balance menu");
                        System.out.println("\nPlease enter a customer ID to check balance: ");
                        int id = in.nextInt();
                        double balance = accBalance[id];
                        System.out.println("\nThe customer has Rs."+balance+" in their account");
                    }
                    break;
                case 4:
                //  Modify
                    {
                        
                        System.out.println("\n\n\n\nModify the balance menu");
                        System.out.println("\nEnter customer ID to edit the balance amount: ");
                        int id = in.nextInt();
                        System.out.println("\nEnter the new balance: ");
                        accBalance[id] = in.nextDouble();
                    }
                    break;
                case 5:
                //  Summary
                    {
                        
                        System.out.println("\n\n\n\nBank all customer summary menu\n");
                        double total = 0.00;
                        for(int i=0;i<size;i++) {
                            total += accBalance[i];
                            System.out.println(accNames[i]+" has Rs"+accBalance[i]+" in their account.");
                        }
                        System.out.println("\nIn total there is Rs"+total+" in the bank.");
                    }
                    break;
                case 0:
                    System.out.println("\n\n\n\nThank you for using this application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Something went wrong.");
                    System.exit(1);
            }
        }
    }
}