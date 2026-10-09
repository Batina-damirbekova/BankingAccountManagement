package banking;

import java.util.HashMap;
import java.util.Map;

/**
 * A bank that stores all the accounts using HashMap
 * 
 * @author batinadamirbekova
 */
public class BankMap implements BankInterface {

    private HashMap<Integer, Account> accounts;
/**
 * Creates an empty bank 
 */
    public BankMap() {
        accounts = new HashMap<>();
    }

    @Override
    public void openAccount(String firstName, String lastName, String address) {

        int id = accounts.size();

        Account account = new Account(firstName, lastName, address);

        accounts.put(id, account);

        System.out.println("Account created.");
    }

    @Override
    public int accountID(String firstName, String lastName) {

        for (Map.Entry<Integer, Account> entry : accounts.entrySet()) {

            Account account = entry.getValue();

            if (account.firstName().equalsIgnoreCase(firstName)
                    && account.lastName().equalsIgnoreCase(lastName)) {

                return entry.getKey();
            }
        }

        return -1;
    }

    @Override
    public void depositMoney(String firstName, String lastName, double amount) {

        int info = accountID(firstName, lastName);

        if (info != -1) {

            accounts.get(info).deposit(amount);

            System.out.println("Deposit successful.");

        } else {

            System.out.println("Account not found.");
        }
    }
    
    @Override
    public void withdrawalMoney(String firstName, String lastName, double amount) {

        int info = accountID(firstName, lastName);

        if (info == -1) {

            System.out.println("Account not found.");
            return;
        }

        if (accounts.get(info).withdrawal(amount)) {

            System.out.println("Withdrawal successful.");

        } else {

            System.out.println("Not enough money.");
        }
    }
    
    @Override
    public double getBalance(String firstName, String lastName) {

        int info = accountID(firstName, lastName);

        if (info != -1) {

            return accounts.get(info).balance();
        }

        return -1;
    }

    @Override
    public void listAccounts() {

        if (accounts.isEmpty()) {

            System.out.println("No accounts.");
            return;
        }

        for (Map.Entry<Integer, Account> entry : accounts.entrySet()) {

            Account account = entry.getValue();

            System.out.println((entry.getKey() + 1) + ". "
                    + account.firstName()
                    + " "
                    + account.lastName()
                    + " - "
                    + account.getAddress());
        }
    }
}