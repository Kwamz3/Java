
class Car{

    private String brand;
    private int carNo;

    public Car()
    {
        brand = "Please select a brand";
        carNo = 0;
    }

    public String getBrand(){
        return brand;
    }

    public int getCarNo(){
        return carNo;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setCarNo(int carNo){
        this.carNo = carNo;
    }

}

public class ConstructorJava {

    public static void main(String[] args)
    {
//    each time a new object is created a constructor is called

        Car obj = new Car();
//        Car obj1 = new Car();
//        obj.setBrand("Toyota");
//        obj.setCarNo(12);

        System.out.println(obj.getBrand() + ": " + obj.getCarNo());

    }
}
