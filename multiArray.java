public class multiArray {

    public static void main(String args [])
    {
        
    //      int nums[][] = new int[3][4];

    //     // int num = (int)( Math.random() * 100);

    //     // System.out.println(num);

    //     for (int i = 0; i <= 2; i++) {

    //         for (int j = 0; j <= 3; j++) {
    //             // System.out.print(nums[i][j] + " ");
    //             nums[i][j] = (int)( Math.random() * 10);
    //         }

            // System.out.println();
        // }

        // for (int i = 0; i <= 2; i++) {

        //     for (int j = 0; j <= 3; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }

        //     System.out.println();
        // }

    
        // for (int n[] : nums) {
            
        //     for (int m : n) {
        //         System.out.print(m + " ");
        //     }

        //     System.out.println();
        // }
        
        
        
        
        
        int nums[][] = new int[3][3];
        // int num = (int) (Math.random() * 100);

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {
                // System.out.print(nums[i][j] = (int) (Math.random() * 100));
                nums[i][j] = (int) (Math.random() * 100);
            }

            // System.out.println();
        }
       
        // for (int i = 0; i <= 2; i++) {

        //     for (int j = 0; j <= 2; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }

        //     System.out.println();
        // }
        

        for (int n[] : nums) {
            
            for (int m : n) {
                System.out.print(m + " ");
            }

            System.out.println();
        }

    }
    
}