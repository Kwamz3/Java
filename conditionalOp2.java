public class conditionalOp2 {
    public static void main(String args [])
    {
        // int x = 8;
        // int y = 17;
        // int z = 9;

        // if (x > y && x > z) {
        //     System.out.println(x);
        // }
        // else if(y > x && y > z) {
        //     System.out.println(y);
        // }
        // else{
        //     System.out.println(z);
        // }

        int markAcc = 34;
        int jeffAcc = 17;
        int fredAcc = 6;

        if (markAcc > jeffAcc && markAcc > fredAcc) {
            System.out.println("Mark has more money");
        }
        else if (jeffAcc > markAcc && jeffAcc > fredAcc) {
            System.out.println("Jeff has more money");
        }
        else {
            System.out.println("Fred has more money");
        }
    }
}
