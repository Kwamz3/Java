class Calc {
    
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class methodOv {
    public static void main(String args [])
    {

        Calc objCalc = new Calc();
        Calc objCalc1 = new Calc();
        int result = objCalc.add(3, 4, 6);
        int result1 = objCalc1.add(3, 4);

        System.out.println(result);
        System.out.println(result1);
    }
}
