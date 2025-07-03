

class Human{
    private int age = 11;
    private String name = "Charles";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String b){
        name = b;
    }
}

public class encapsulationJava {

    public static void main(String[] args){

        Human obj = new Human();
        obj.setAge(11);
        obj.setName("Charles");

        System.out.println(obj.getName() + ": "+ obj.getAge());

    }
}
