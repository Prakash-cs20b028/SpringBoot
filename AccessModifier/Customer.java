
class Customer {

    public static void main(String args[]) {
        Bank b = new Bank();

        b.setBalance(5000.00);
        System.out.println("Balance: " + b.getBalance());
        //System.out.println("Balance: " + b.Balance); // This line would cause a compilation error due to private access
    }
}
