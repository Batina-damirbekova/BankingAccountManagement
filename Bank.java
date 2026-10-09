package banking;

/**
 * This is like a bank with stores everything.
 *
 * @author Batina Damirbekova
 */
public class Bank implements BankInterface {
	
	private Account[] accounts;
    private int count;
    /**
     * Creates a bank with space for 100 accounts.
     */
    public Bank() {
        accounts = new Account[100];
        count = 0;
    }

    /**
     * Opens a new bank account.
     *
     * @param firstName Customer's first name.
     * @param lastName Customer's last name.
     * @param address Customer's address.
     */   
    public void openAccount(String firstName, String lastName, String address) {

        if (count < accounts.length) {
            accounts[count] = new Account(firstName, lastName, address);
            count++;
            System.out.println("Account created.");
        } else {
            System.out.println("Bank is full.");
        }
    }

    /**
     * Finds the account.
     *
     * @param firstName Customer's first name.
     * @param lastName Customer's last name.
     * 
     * @return The account index; otherwise -1.
     */    
    public int accountID(String firstName, String lastName) {

        for (int i = 0; i < count; i++) {

            if (accounts[i].firstName().equalsIgnoreCase(firstName)
                    && accounts[i].lastName().equalsIgnoreCase(lastName)) {

                return i;
            }
        }

        return -1;
    }

    /**
     * Deposits money into a customer's account.
     *
     * @param firstName Customer's first name.
     * @param lastName Customer's last name.
     * @param amount Amount to deposit.
     */
    public void depositMoney(String firstName, String lastName, double amount) {

        int info = accountID(firstName, lastName);

        if (info != -1) {
            accounts[info].deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    /**
     * Withdraws money from a customer's account.
     *
     * @param firstName Customer's first name.
     * @param lastName Customer's last name.
     * @param amount Amount to withdraw.
     */
    public void withdrawalMoney(String firstName, String lastName, double amount) {

        int info = accountID(firstName, lastName);

        if (info == -1) {
            System.out.println("Account not found.");
            return;
        }

        if (accounts[info].withdrawal(amount)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Not enough money.");
        }
    }

    /**
     * Returns the balance of a client's account.
     *
     * @param firstName Customer's first name.
     * @param lastName Customer's last name.
     * @return The account balance, or -1 if the account is not found.
     */
    public double getBalance(String firstName, String lastName) {

        int info = accountID(firstName, lastName);

        if (info != -1) {
            return accounts[info].balance();
        }

        return -1;
    }

    /**
     * Shows all bank accounts.
     */
    public void listAccounts() {

        if (count == 0) {
            System.out.println("No accounts.");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println((i + 1) + ". "
                    + accounts[i].firstName()
                    + " "
                    + accounts[i].lastName()
                    + " - "
                    + accounts[i].getAddress());
        }
    }
}


