import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //System.out.printf(String.format(args[0] + args[1] + args[2]));
        //System.out.println(args[1]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);;
        String oper = args[1];
        //System.out.println(oper.equals(String.valueOf('+')));
        //int s = a + bgit
        if (oper.equals(String.valueOf('+'))){
            System.out.println(a + b);
        }
        else if (oper.equals(String.valueOf('-')))
        {
            System.out.println(a - b);
        } else if (oper.equals(String.valueOf('*')))
        {
            System.out.println(a * b);
        } else if (oper.equals(String.valueOf('/')))
        {
            System.out.println(a / b);
        }
        //System.out.println(s);
        //System.out.println("Hello world!");
        return;
    }
}