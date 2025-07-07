class A {

    public A(){
        System.out.println("new object created");
    }

    public void show(){

        System.out.println("In the show"+ " A "+"method");
    }
}

public class anonymousJava {

    public static void main(String[] args){
//        A obj = new A();
//        obj.show();

        new A().show();

    }
}
