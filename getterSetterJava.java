
class School{

    private String name = "Charles";
    private long indexNo = 123456789;
    private String course = "CS";

    public String getName(){
        return name;
    }

    public long getIndexNo(){
        return indexNo;
    }

    public String getCourse(){
        return course;
    }

    public void setName(String n) {
        name = n;
    }

    public void setIndexNo(long iN){
           indexNo = iN;
    }

    public void setCourse(String c){
        course = c;
    }
}

public class getterSetterJava {

    public static void main(String[] args)
    {
        School obj = new School();
        System.out.println(obj.getName());
        System.out.println(obj.getIndexNo());
        System.out.println(obj.getCourse());

        System.out.println();

        obj.setName("Steph");
        obj.setCourse("Biossa");
        obj.setIndexNo(97654321);

        System.out.println(obj.getName());
        System.out.println(obj.getIndexNo());
        System.out.println(obj.getCourse());


    }
}
