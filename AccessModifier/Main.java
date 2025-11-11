
public class Main {

    int data;

    Main(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public static void main(String[] args) {

        Main obj = new Main(20);
        System.out.println("Data: " + obj.data);

    }
}

class ConstructorOverloading {

    int x, y;

    ConstructorOverloading(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x: " + x + " y: " + y);
    }

    ConstructorOverloading(int x) {
        this(x, x);
    }

    ConstructorOverloading() {
        this(0);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading(10);
        ConstructorOverloading obj2 = new ConstructorOverloading(10, 20);

    }
}

class ObjectAsParameter {

    int data;

    ObjectAsParameter(int data) {
        this.data = data;
        System.err.println("Data before increment: " + this.data);
        ObjectAsParameter();
        System.err.println("Data after increment: " + this.data);
    }

    void ObjectAsParameter() {
        this.data += 50;
        //System.out.println("Data: " + obj.data);
    }

    public static void main(String[] args) {
        ObjectAsParameter obj1 = new ObjectAsParameter(100);

    }
}
