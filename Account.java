/**
 * This class has account information
 * like customer's name, address, and account balance.
 * 
 * @author Batina Damirbekova
 */

package banking;

public class Account {
	private String firstName;
    private String lastName;
    private String address;
    private double balance;
/**
 * Creates bank account 
 * 
 * @param firstName
 * @param lastName
 * @param address
 * 
 */
    public Account(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        balance = 0;
    }
/**
 * Deposit money 
 * 
 * @param amount amount that we deposit
 */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
   /**
     * Withdraw money 
     * 
     * @param amount amount that we withdraw
     * @return if it was successful, otherwise false
     */
    public boolean withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Current balance 
     * 
     * @return account balance
     */    
    public double balance() {
        return balance;
    }

    /**
     * Customers first name
     * 
     * @return first name
     */ 
    public String firstName() {
        return firstName;
    }

    /**
     * Customers last name
     * 
     * @return last name
     */
    public String lastName() {
        return lastName;
    }
    /**
     * Customers address
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }
    
}

