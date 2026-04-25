class BankAccount {
    int balance = 0;

    // Thread 1 (Son) calls this
    public synchronized void withdraw(int amount) {
        System.out.println("Son: Going to withdraw Rs. " + amount);
        
        if (balance < amount) {
            System.out.println("Son: Less balance; waiting for deposit...");
            try {
                wait(); // SON STOPS HERE AND WAITS!
            } catch (Exception e) {}
        }
        
        // This runs ONLY AFTER Papa calls notify()
        balance = balance - amount;
        System.out.println("Son: Withdraw successful! Remaining Balance: " + balance);
    }

    // Thread 2 (Papa) calls this
    public synchronized void deposit(int amount) {
        System.out.println("Papa: Going to deposit Rs. " + amount);
        balance = balance + amount;
        System.out.println("Papa: Deposit successful!");
        
        notify(); // PAPA TELLS SON TO WAKE UP AND COMPLETE WITHDRAWAL!
    }
}

class interThreadCommunication {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        // Creating Son Thread
        Thread son = new Thread() {
            public void run() {
                myAccount.withdraw(5000); // Tries to withdraw 5000
            }
        };

        // Creating Papa Thread
        Thread papa = new Thread() {
            public void run() {
                myAccount.deposit(10000); // Deposits 10000
            }
        };

        son.start(); // Son goes first, but has to wait because balance is 0
        papa.start(); // Papa goes second, deposits, and wakes up the son
    }
}