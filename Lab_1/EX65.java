import java.util.*;

public class EX65 {
    public static void main(String[] args) 
    {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1789);
        a.add(2035);
        a.add(1899);
        a.add(1456);
        a.add(201);
        
        Collections.sort(a); 

        double tong = 0;
        double tb = 0;
        for (int i:a) 
        {
            tong += i;
        }
        tb = tong / a.size();

        System.out.println("Mang sau khi sort: ");
        for(int i = 0; i < a.size(); i++) 
        {   
            System.out.printf(" %d",a.get(i));
        }  
        System.out.println("\ntong la: " + tong);
        System.out.println("Gia tri trung binh : " + tb);

    }
}
