class computer {
    public void playMusic() {
        System.out.println("Music playing...");
    }

    public String getMeAPen(int cost) {
        // if (cost >= 10) {
        //     return "Pen";
        // }
        // else {
        //     return "Nothing";
        // }

        String result = cost >= 10 ? "Pen" : "Nothing";
        return result;
    }
}

public class method {
    public static void main(String args[])
    {
        
        computer objCom = new computer();
        objCom.playMusic();
        String str = objCom.getMeAPen(17);

        System.out.println(str);

    }
}
