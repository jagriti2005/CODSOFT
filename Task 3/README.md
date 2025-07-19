# ATM Interface System

A simple command-line ATM (Automated Teller Machine) simulation built in Java that allows users to perform basic banking operations.

## Features

- **Balance Inquiry** - Check current account balance
- **Deposit Money** - Add funds to the account
- **Withdraw Money** - Remove funds from the account (with balance validation)
- **Account Information** - View account holder details
- **Input Validation** - Handles invalid inputs gracefully
- **User-Friendly Interface** - Clean, formatted console output

## Project Structure

The application consists of three main classes:

### `BankAccount` Class
- Manages account data (balance, account number, holder name)
- Provides methods for deposit and withdrawal operations
- Includes balance validation for transactions

### `ATM` Class
- Handles user interface and menu operations
- Processes user input and validates transactions
- Manages the interaction between user and bank account

### `ATMInterface` Class
- Contains the main method
- Initializes the bank account and ATM system
- Starts the application

## Requirements

- Java Development Kit (JDK) 8 or higher
- Command line interface or Java IDE

## Installation & Setup

1. **Clone or download** the source code
2. **Save** the code as `ATMInterface.java`
3. **Compile** the program:
   ```bash
   javac ATMInterface.java
   ```
4. **Run** the application:
   ```bash
   java ATMInterface
   ```

## Usage

When you run the program, you'll see a welcome message followed by the main menu:

```
Welcome to ABC Bank ATM
Account: 123456789 | Holder: John Doe

===================================
         ATM MAIN MENU
===================================
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Account Info
5. Exit
===================================
Please select an option (1-5):
```

### Available Operations

1. **Check Balance (Option 1)**
   - Displays current account balance

2. **Deposit Money (Option 2)**
   - Enter amount to deposit
   - Amount must be positive
   - Shows new balance after successful deposit

3. **Withdraw Money (Option 3)**
   - Enter amount to withdraw
   - Validates sufficient balance
   - Shows remaining balance after successful withdrawal

4. **Account Info (Option 4)**
   - Displays account number, holder name, and current balance

5. **Exit (Option 5)**
   - Safely exits the application

## Default Account Details

The program comes with a pre-configured test account:

- **Account Number:** 123456789
- **Account Holder:** John Doe
- **Initial Balance:** $1,000.00

## Error Handling

The application includes comprehensive error handling for:

- Invalid menu selections
- Non-numeric input for amounts
- Negative or zero amounts for transactions
- Insufficient balance for withdrawals
- General input validation errors

## Example Session

```
Welcome to ABC Bank ATM
Account: 123456789 | Holder: John Doe

===================================
         ATM MAIN MENU
===================================
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Account Info
5. Exit
===================================
Please select an option (1-5): 1

------------------------------
      BALANCE INQUIRY
------------------------------
Current Balance: $1000.00
------------------------------

Press Enter to continue...
```

## Customization

To modify the default account details, edit the `main` method in the `ATMInterface` class:

```java
// Create a bank account for the user
BankAccount userAccount = new BankAccount("YOUR_ACCOUNT_NUMBER", "YOUR_NAME", INITIAL_BALANCE);
```

## Technical Notes

- The application uses `Scanner` for user input
- All monetary values are handled as `double` data types
- Input validation prevents common user errors
- The program continues running until the user selects "Exit"

## Future Enhancements

Potential improvements could include:
- Multiple account support
- PIN authentication
- Transaction history
- Account creation functionality
- Database integration
- GUI interface
