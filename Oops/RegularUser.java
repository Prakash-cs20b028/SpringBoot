
class RegularUser extends User {

    RegularUser(String name, String email) {
        super(name, email); //Calling the parent constructor to initialize the parameters
    }

    public void BrowseProduct() {
        System.out.println(this.getName() + " is browsing the product.");
    }

    @Override
    public void showDashBoard() {
        System.out.println("Showing admin dashboard for RegularUser");
    }

    public static void main(String[] args) {
        RegularUser regularUser = new RegularUser("Bob", "Bob@123");
        regularUser.Login();
        regularUser.BrowseProduct();
        regularUser.showDashBoard();
    }
}
