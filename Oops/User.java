
class User {

    private String name;
    private String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    String getName() {
        return name;
    }

    public void Login() {
        System.out.println(this.name + " is logged in...");

    }

    public void showDashBoard() {
        System.out.println("Showing dashboard for User");
    }

}
