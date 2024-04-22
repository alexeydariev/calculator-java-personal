import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        //System.out.println(args[1]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);;
        String oper = args[1];
        //int s = a + b;
        if (oper.equals('+')){
            System.out.println(a + b);
        }
        else if (oper.equals('-'))
        {
            System.out.println(a - b);
        } else if (oper.equals('*'))
        {
            System.out.println(a * b);
        } else if (oper.equals('/'))
        {
            System.out.println(a * b);
        }
        //System.out.println(s);
        //System.out.println("Hello world!");
        return;
    }
}