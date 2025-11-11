
class Bank1 {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Customer1 {

    public static void main(String[] args) {
        Bank1 b = new Bank1();
        b.setBalance(5000.00);
        System.out.println("Balance: " + b.getBalance());
    }
}

class Customer2 {

    public static void main(String[] args) {
        Bank1 b = new Bank1();
        b.setBalance(10000.00);
        System.out.println("Balance: " + b.getBalance());
    }
}

class Customer3 {

    public static void main(String[] args) {
        Bank1 b = new Bank1();
        b.setBalance(20000.00);
        System.out.println("Balance: " + b.getBalance());
    }
}

public class Customer {

    public static void main(String[] args) {
        Customer1.main(args);
        Customer2.main(args);
        Customer3.main(args);
    }
}
