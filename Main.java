package banking;

import java.util.InputMismatchException;
import java.util.Scanner;

	/**
	 * Runs the Banking application.
	 *
	 * @author Batina Damirbekova
	 */
	public class Main {

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        BankInterface bank = new Bank();
	        boolean quit = false;

	        while (!quit) {

	            System.out.println("\n===== Banking Menu =====");
	            System.out.println("1. Create account");
	            System.out.println("2. List accounts");
	            System.out.println("3. Make deposit");
	            System.out.println("4. Make withdrawal");
	            System.out.println("5. Get balance");
	            System.out.println("6. Quit");
	            System.out.print("Choose an option: ");

	            try {

	                int choice = input.nextInt();
	                input.nextLine();

	                switch (choice) {

	                case 1:

	                    System.out.print("First name: ");
	                    String first = input.nextLine();

	                    System.out.print("Last name: ");
	                    String last = input.nextLine();

	                    System.out.print("Address: ");
	                    String address = input.nextLine();

	                    bank.openAccount(first, last, address);
	                    break;

	                case 2:

	                    bank.listAccounts();
	                    break;

	                case 3:

	                    System.out.print("First name: ");
	                    first = input.nextLine();

	                    System.out.print("Last name: ");
	                    last = input.nextLine();

	                    System.out.print("Amount to deposit: ");
	                    double deposit = input.nextDouble();
	                    input.nextLine();

	                    bank.depositMoney(first, last, deposit);
	                    break;

	                case 4:

	                    System.out.print("First name: ");
	                    first = input.nextLine();

	                    System.out.print("Last name: ");
	                    last = input.nextLine();

	                    System.out.print("Amount to withdraw: ");
	                    double withdraw = input.nextDouble();
	                    input.nextLine();

	                    bank.withdrawalMoney(first, last, withdraw);
	                    break;

	                case 5:

	                    System.out.print("First name: ");
	                    first = input.nextLine();

	                    System.out.print("Last name: ");
	                    last = input.nextLine();

	                    double balance = bank.getBalance(first, last);

	                    if (balance == -1) {
	                        System.out.println("Account not found.");
	                    } else {
	                        System.out.println("Balance: $" + balance);
	                    }

	                    break;

	                case 6:

	                    quit = true;
	                    System.out.println("Goodbye!");
	                    break;

	                default:

	                    System.out.println("Please choose a number between 1 and 6.");
	                }

	            } catch (InputMismatchException e) {

	                System.out.println("Invalid input. Please enter a number.");
	                input.nextLine();
	            }
	        }

	        input.close();
	    }
	}