package src.com.company;

public class Main {

    public static void main(String[] args) {
        int b = 7;

        System.out.println( Number(b) );
    }

    public static boolean Number(int k) {
        int g;
        g = k % 3;
        if (g == 0)
        return true;
        else 
        return false;
        
    }

   
}
