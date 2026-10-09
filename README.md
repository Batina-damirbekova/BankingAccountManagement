# Banking Account Management System

A Java console application developed as a Computer Science coursework project. It demonstrates object-oriented programming, interfaces, account management, and two ways to store accounts: an array-backed implementation and a `HashMap`-backed implementation.

## Features

- Create bank accounts with a customer's name and address
- List accounts
- Deposit money
- Withdraw money when sufficient funds are available
- Check an account balance
- Find accounts by first and last name (case-insensitive)
- Compare two implementations of the `BankInterface`: `Bank` and `BankMap`

## Technologies and concepts

- Java
- Classes and encapsulation
- Interfaces and implementation
- Arrays
- `HashMap` and `Map`
- `Scanner` for console input
- Exception handling with `InputMismatchException`

## Requirements

- JDK installed (Java Development Kit)

Check your installation with:

```bash
java -version
javac -version
```

## Compile and run

From the project root directory, compile the source files:

```bash
javac -d out src/banking/*.java
```

Run the application:

```bash
java -cp out banking.Main
```

Use the numbered menu to create accounts, list them, deposit or withdraw money, check balances, and quit.

## Project structure

```text
BankingAccountManagement/
├── README.md
├── .gitignore
└── src/
    └── banking/
        ├── Account.java
        ├── Bank.java
        ├── BankInterface.java
        ├── BankMap.java
        └── Main.java
```

## Notes and future improvements

This is an educational console project, not production banking software. Possible next steps include improving validation and error messages for invalid deposit or withdrawal amounts, adding automated unit tests, and using a unique account ID instead of identifying accounts only by first and last name.

The current menu uses the array-backed `Bank` implementation. `BankMap` is included as an alternative implementation of the same interface.
