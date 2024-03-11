import java.util.*;
import java.lang.Math;

public class EX226 {

    static void Eq1st_1var()
    {
        System.out.println("Giai phuong trinh bac nhat ax+b =0. Nhap A,B \n");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if ( a == 0 ) 
            if ( b == 0 ) 
                System.out.println("Vo so nghiem \n");
            else 
                System.out.println("Vo nghiem\n");
    
        else {
            double ans =(double) -b/a;
            System.out.printf("Nghiem cua %dx+%d: %.2f\n",a,b,ans);
        }
            
    }

    static void Bienluan(double D, double D1, double D2) 
    {
        if ( D == 0 ) 
            if ( D1 == 0 && D2 == 0 ) 
                System.out.println("Vo so nghiem\n");
            else 
                System.out.println("Vo nghiem\n");
    
        else 
            System.out.printf("Nghiem cua he phuong trinh la: x1 = %.2f, x2 = %.2f\n",D1/D,D2/D);
    }

    static void Eq1st_2var() 
    {
        System.out.println("Giai phuong trinh bac nhat ax+b =0. Nhap a11,a12,b1,a21,a22,b2 \n");
        Scanner input = new Scanner(System.in);
        int a11 = input.nextInt();
        int a12 = input.nextInt();
        int b1 = input.nextInt();
        int a21 = input.nextInt();
        int a22 = input.nextInt();
        int b2 = input.nextInt();

        double D = a11*a22 - a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 - a21*b1;

        Bienluan(D, D1, D2) ;
    }

    static void Eq2st_1var()
    {
        System.out.println("Giai phuong trinh bac nhat ax^2+bx +c =0. Nhap A,B,C \n");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double delta = b*b - 4*a*c;
        if ( delta < 0 ) System.out.println("Phuong trinh vo nghiem \n");
        if ( delta == 0 ) {
            double sol = -b/2*a;
            System.out.printf("Phuong trinh co nghiem kep %.2f\n",sol);
        }
        if ( delta > 0 )
        {
            double x1 = (-b-Math.sqrt(delta))/(2*a);
            double x2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.printf("Phuong trinh co 2 nghiem x1 = %.2f va x2 = %.2f\n",x1,x2);
        }    
    }

    public static void main(String[] args)
    {
        Eq1st_1var();
        Eq1st_2var();
        Eq2st_1var();
    }

}
