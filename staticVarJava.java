
class Mobile{

    String brand;
    int price;
    static String  name;

    //    Static variables are to be called with their class name not object name

    public void show(){

        System.out.println(brand + " " + name + ": " + price);
    }
}

public class staticVarJava {

    public static void main( String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 7500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 9500;
        Mobile.name = "SmartPhone";



        obj1.show();
        obj2.show();


    }
}

//class School{
//
//    String name;
//    int indexNo;
//    static String Course;
//
//    public void show(){
//
//        System.out.println(name + ": " + indexNo);
//        System.out.println(Course);
//        System.out.println();
//
//    }
//}
//
//class staticVarJava{
//
//    public static void main(String[] args)
//    {
//
//        School obj1 = new School();
//        School obj2 = new School();
//        School obj3 = new School();
//
//        obj1.name = "Charles";
//        obj1.indexNo = 12345;
//        School.Course = "Computer Science";
//
//        obj2.name = "Derrick";
//        obj2.indexNo = 12346;
//        School.Course = "Business";
//
//        obj3.name = "Shark";
//        obj3.indexNo = 12347;
//        School.Course = "Bio Science";
//
//        obj1.show();
//        obj2.show();
//        obj3.show();
//
//    }
//}