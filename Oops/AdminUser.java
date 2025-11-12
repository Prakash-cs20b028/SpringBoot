
class AdminUser extends User {

    AdminUser(String name, String email) {
        super(name, email);
    }

    public void ManageOrders() {
        System.out.println(this.getName() + "is managing orders...");
    }

    @Override
    public void showDashBoard() {
        System.out.println("Showing admin dashboard for AdminUser");
    }

    public static void main(String[] args) {
        AdminUser adminUser = new AdminUser("Charlie", "Charlie@123");
        adminUser.Login();
        adminUser.ManageOrders();
        adminUser.showDashBoard();
    }

}
