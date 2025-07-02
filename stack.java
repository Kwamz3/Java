class Calculator {

    int num = 8;
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class stack {
    public static void main(String[] args)
    {

        // int data = 10;

        // Calculator objCalc = new Calculator();
        // Calculator objCalc1 = new Calculator();
        // int result = objCalc.add(3, 4, 6);
        // int result1 = objCalc1.add(3, 4);

        // System.out.println(result);
        // System.out.println(result1);

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        obj.num = 5;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
