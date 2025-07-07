

class PencilCase{

    private String brand;
    private int carNo;

    public PencilCase()
    {
        brand = "Please select a brand";
        carNo = 0;
    }

    public PencilCase(String n, int a)
    {
        brand = n;
        carNo = a;
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

public class parameterizedJava {

    public static void main(String[] args){

        PencilCase obj = new PencilCase();
        PencilCase obj1 = new PencilCase("Charles", 22);
        obj.setBrand("Toyota");
        obj.setCarNo(12);

        System.out.println(obj.getBrand() + ": " + obj.getCarNo());
        System.out.println(obj1.getBrand() + ": " + obj1.getCarNo());

    }
}
