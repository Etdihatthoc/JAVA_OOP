import java.util.*;
import java.lang.Math;

public class EX225 {

    static String a, b; 

    static double sum(double x, double y)
    {
        return x + y ;
    }

    static double difference(double x, double y)
    {
        return Math.abs(x - y) ;
    }

    static double product(double x, double y)
    {
        return x * y ;
    }

    static double quotient(double x, double y)
    {
        return x / y ;
    }

    public static void main(String[] args)
    {
        Scanner inpp = new Scanner(System.in);
        a = inpp.nextLine();
        b = inpp.nextLine();

        double x = Double.parseDouble(a);
        double y = Double.parseDouble (b);

        System.out.printf("Tong 2 so %.2f, %.2f la: %.2f \n" , x, y,sum(x,y));
        System.out.printf("Hieu 2 so %.2f, %.2f la: %.2f \n" , x, y,difference(x,y));
        System.out.printf("Tich 2 so %.2f, %.2f la: %.2f \n" , x, y,product(x,y));
        System.out.printf("Thuong 2 so %.2f, %.2f la: %.2f \n" , x, y,quotient(x,y));
    }

}
