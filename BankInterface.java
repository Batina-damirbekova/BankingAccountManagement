package banking;
/**
 * Interface for our bank. Shows what any bank must provide
 * 
 * @author batinadamirbekova
 */
public interface BankInterface {
	
/**
 * Opens a new bank account.
 *
 * @param firstName Client's first name.
 * @param lastName CClient'slast name.
 * @param address Client's address.
 */
	
void openAccount(String firstName, String lastName,String address );
/**
 * Finds the client's account
 * 
 * @param firstName
 * @param lastName
 * @return account IF or -1 when cant find the account
 */

int accountID(String firstName, String lastName);
/**
 * Deposits money
 * 
 * @param firstName
 * @param lastName
 * @param amount
 */

void depositMoney(String firstName, String lastName, double amount );
/**
 * Withdrawal from account
 * 
 * @param firstName
 * @param lastName
 * @param amount
 */
void withdrawalMoney(String firstName, String lastName, double amount);
/**
 * Getting the balance amount
 * 
 * @param firstName
 * @param lastName
 * @return amount that is in the account
 */

double getBalance(String firstName, String lastName);
/**
 * Shows all bank accounts
 */

void listAccounts();
}
