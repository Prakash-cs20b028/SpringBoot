
class SellerUser extends User {

    SellerUser(String name, String email) {
        super(name, email);
    }

    public void AddProduct(String name) {
        System.out.println(name + " is adding the products.");
    }

    @Override
    public void showDashBoard() {
        System.out.println("Showing admin dashboard for SellerUser");
    }

    public static void main(String[] args) {
        SellerUser seller = new SellerUser("Alice", "Alice@123");
        seller.Login();
        seller.AddProduct("Alice");
        seller.showDashBoard();
    }
}
