import java.util.Scanner;
class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountHolderName;
    
    public BankAccount(String accountNumber, String name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = name;
        this.balance = initialBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public String getAccountInfo() {
        return "Account: " + accountNumber + " | Holder: " + accountHolderName;
    }
}


class ATM {
    private BankAccount userAccount;
    private Scanner scanner;
    
    public ATM(BankAccount account) {
        this.userAccount = account;
        this.scanner = new Scanner(System.in);
    }
    
    public void showMenu() {
        System.out.println("\n" + "=".repeat(35));
        System.out.println("         ATM MAIN MENU");
        System.out.println("=".repeat(35));
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Account Info");
        System.out.println("5. Exit");
        System.out.println("=".repeat(35));
        System.out.print("Please select an option (1-5): ");
    }
    

    public void checkBalance() {
        System.out.println("\n" + "-".repeat(30));
        System.out.println("      BALANCE INQUIRY");
        System.out.println("-".repeat(30));
        System.out.printf("Current Balance: $%.2f\n", userAccount.getBalance());
        System.out.println("-".repeat(30));
    }

    public void deposit() {
        System.out.println("\n" + "-".repeat(30));
        System.out.println("        DEPOSIT");
        System.out.println("-".repeat(30));
        
        System.out.print("Enter amount to deposit: $");
        double amount = getValidAmount();
        
        if(amount == -1) {
            return; 
        }
        
        if(userAccount.deposit(amount)) {
            System.out.println("SUCCESS!");
            System.out.printf("$%.2f deposited successfully.\n", amount);
            System.out.printf("New balance: $%.2f\n", userAccount.getBalance());
        } else {
            System.out.println("FAILED!");
            System.out.println("Invalid deposit amount.");
        }
        System.out.println("-".repeat(30));
    }

    public void withdraw() {
        System.out.println("\n" + "-".repeat(30));
        System.out.println("       WITHDRAWAL");
        System.out.println("-".repeat(30));
        
        System.out.printf("Current balance: $%.2f\n", userAccount.getBalance());
        System.out.print("Enter amount to withdraw: $");
        double amount = getValidAmount();
        
        if(amount == -1) {
            return; 
        }
 
        if(amount > userAccount.getBalance()) {
            System.out.println("FAILED!");
            System.out.println("Insufficient balance for this transaction.");
            System.out.printf("Available balance: $%.2f\n", userAccount.getBalance());
        } else if(userAccount.withdraw(amount)) {
            System.out.println("SUCCESS!");
            System.out.printf("$%.2f withdrawn successfully.\n", amount);
            System.out.printf("Remaining balance: $%.2f\n", userAccount.getBalance());
        } else {
            System.out.println("FAILED!");
            System.out.println("Invalid withdrawal amount.");
        }
        System.out.println("-".repeat(30));
    }
   
    public void showAccountInfo() {
        System.out.println("\n" + "-".repeat(30));
        System.out.println("     ACCOUNT INFORMATION");
        System.out.println("-".repeat(30));
        System.out.println(userAccount.getAccountInfo());
        System.out.printf("Current Balance: $%.2f\n", userAccount.getBalance());
        System.out.println("-".repeat(30));
    }
    private double getValidAmount() {
        try {
            double amount = scanner.nextDouble();
            if(amount <= 0) {
                System.out.println("Please enter a positive amount.");
                return -1;
            }
            return amount;
        } catch(Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
            scanner.nextLine(); 
            return -1;
        }
    }
    
    public void run() {
        System.out.println("Welcome to ABC Bank ATM");
        System.out.println(userAccount.getAccountInfo());
        
        boolean keepRunning = true;
        
        while(keepRunning) {
            showMenu();
            
            try {
                int choice = scanner.nextInt();
                
                switch(choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        showAccountInfo();
                        break;
                    case 5:
                        System.out.println("\nThank you for using ABC Bank ATM!");
                        System.out.println("Have a great day!");
                        keepRunning = false;
                        break;
                    default:
                        System.out.println("Invalid option! Please select 1-5.");
                }

                if(keepRunning) {
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine();
                }
                
            } catch(Exception e) {
                System.out.println("Invalid input! Please enter a number between 1-5.");
                scanner.nextLine(); 
            }
        }
        
        scanner.close();
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        
      
        BankAccount userAccount = new BankAccount("123456789", "John Doe", 1000.00);
        
    
        ATM atmMachine = new ATM(userAccount);
        
       
        atmMachine.run();
    }
}