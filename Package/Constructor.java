
class Constructor {

    Constructor() {
        System.out.println("Constructor is called.");
    }

    Constructor(int a) {
        System.out.println("Constructor with parameter is called: " + a);
    }

    public static void main(String[] args) {

        System.out.println("This is Constructor class.");

    }
    Constructor obj = new Constructor();
}
