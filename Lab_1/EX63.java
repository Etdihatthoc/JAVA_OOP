import java.util.Scanner;

public class EX63 {

    static void Draw()
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int i=1; i<=n ; i++) 
        {
            for (int j=1; j<= ((n*2-1) - (i*2-1))/2; j++) 
            {
                System.out.print(" ");
            }
            for (int j=1; j<= (i*2-1); j++) 
            {
                System.out.print("*");
            }
            for (int j=1; j<= ((n*2-1) - (i*2-1))/2; j++) 
            {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        Draw();
    }
}
