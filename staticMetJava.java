
class Mobile2{

    String brand;
    int price;
    static String  name;

    //    Static variables are to be called with their class name not object name

    public void show(){

        System.out.println(brand + " " + name + ": " + price);
    }

    public static void show1(){
        System.out.println("In static method you can make a call with the class name");
    }


//    public static void show1(){
//        System.out.println(brand + " " + name + ": " + price);
//    }
//     The use a static variable in a static method is permitted but not a non-static in a static method
//    uncomment line 20-22 to see


    public static void show2(Mobile3 obj){
        System.out.println(obj.brand + " " + name + ": " + obj.price);
    }

}

class Mobile3{

    String brand;
    int price;
    static String  name;

    public void show(){

        System.out.println(brand + " " + name + ": " + price);
    }

    public static void show1(){
        System.out.println("In static method you can make a call with the class name");
    }


//    public static void show1(){
//        System.out.println(brand + " " + name + ": " + price);
//    }
//     The use a static variable in a static method is permitted but not a non-static in a static method
//    uncomment line 20-22 to see


    public static void show2(Mobile3 obj){
        System.out.println(obj.brand + " " + name + ": " + obj.price);
    }
}


public class staticMetJava {
    
    public static void main(String[] args)
    {
        Mobile3 obj1 = new Mobile3();
        obj1.brand = "Apple";
        obj1.price = 7500;
        Mobile.name = "SmartPhone";

        Mobile3 obj2 = new Mobile3();
        obj2.brand = "Samsung";
        obj2.price = 9500;
        Mobile.name = "SmartPhone";


//        obj1.show();
//        obj2.show();

//        However we can access have indirect access by having an object reference
        Mobile3.show2(obj1);

    }
}
