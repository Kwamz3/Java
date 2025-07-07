

//class Work {
//
//    private String name = "Charles";
//    private long staffNo = 123456789;
//    private String department = "CS";
//
//    public String getName(){
//        return name;
//    }
//
//    public long getIndexNo(){
//        return staffNo;
//    }
//
//    public String getDepartment(){
//        return department;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStaffNo(long staffNo){
//        this.staffNo = staffNo;
//    }
//
//    public void setDepartment(String c){
//        this.department = department;
//    }
//}

class Inventory{

    private int prices = 1750;
    private String goods = "new";
    private int quantity = 75;

    public int getPrices(){
        return prices;
    }

    public String getGoods(){
        return goods;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrices(int prices){
        this.prices = prices;
    }

    public void setGoods(String goods){
        this.goods = goods;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}

public class thisJava {

    public static void main(String[] args)
    {

//        Work obj = new Work();
//        System.out.println(obj.getName());
//        System.out.println(obj.getIndexNo());
//        System.out.println(obj.getDepartment());
//
//        System.out.println();
//
//        obj.setName("Steph");
//        obj.setDepartment("Biossa");
//        obj.setStaffNo(97654321);
//
//        System.out.println(obj.getName());
//        System.out.println(obj.getIndexNo());
//        System.out.println(obj.getDepartment());


        Inventory obj = new Inventory();

        obj.setPrices(5);
        obj.setGoods("old");
        obj.setQuantity(86);

        System.out.println(obj.getGoods());
        System.out.println(obj.getPrices());
        System.out.println(obj.getQuantity());

    }
}