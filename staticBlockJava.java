class Mobile4 {

    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("In static Block");
    }

    // Proper constructor (no return type)
    public Mobile4() {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println(brand + " " + name + ": " + price);
    }

    public static void show1() {
        System.out.println("In static method you can make a call with the class name");
    }

    // Static methods cannot access non-static fields like 'brand' or 'price' directly.
    // public static void show1() {
    //     System.out.println(brand + " " + name + ": " + price); // This will cause an error
    // }
}

public class staticBlockJava {
    public static void main(String[] args) {
        Mobile4 obj1 = new Mobile4();
        obj1.brand = "Apple";
        obj1.price = 7500;
        Mobile4.name = "SmartPhone";

        Mobile4 obj2 = new Mobile4();

//        obj1.show();
//        obj2.show();

//        Mobile4.show1();
    }
}
