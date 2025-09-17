class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int a, String h, double b) {
        accountNumber = a;
        accountHolder = h;
        balance = b;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int a, String h, double b, double r) {
        super(a, h, b);
        interestRate = r;
    }

    void display() {
        System.out.println(accountNumber + " " + accountHolder + " " + getBalance() + " " + interestRate);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Navroop", 5000, 5.5);
        s.display();
    }
}

