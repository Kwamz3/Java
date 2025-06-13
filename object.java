// class Calculator {

//     int a;
//     public int add(int n1, int n2)
//     {
//         // int sum = n1 + n2;
//         // return sum;
//     }

// }

// class Subtract {

//     public int subtract(int n1, int n2)
//     {
//         int sum = n2 - n1;
//         return sum; 
//     }

//     }


class cMultiply {
    public int multiply(int n1, int n2)

    {
        int sum = n1 * n2;
        return sum;
    }

}


public class object {
    public static void main(String args[]) {
        
        int num1 = 7;
        int num2 = 7;

        cMultiply calc = new cMultiply();

        int result = calc.multiply(num1, num2);

        System.out.println(result);


        // int num1 = 4;
        // int num2 = 5;
        // // int result = num1 + num2;

        // Calculator calc = new Calculator();

        // int result = calc.add(num1, num2);

        // System.out.println(result);

        // int num1 = 5;
        // int num2 = 7;

        // Subtract calc = new Subtract();
        // int result = calc.subtract(num1, num2);

        // System.out.println(result);
    }
}
