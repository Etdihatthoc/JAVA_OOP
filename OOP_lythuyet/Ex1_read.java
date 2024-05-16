import java.io.FileReader;
import java.io.IOException;

public class Ex1_read
{
    public static void main(String[] args) 
    {
        String filename = "output.txt";
        
        try (FileReader reader = new FileReader(filename)) 
        {
            int a;
            while ((a = reader.read()) != -1) {
                System.out.print((char) a);
            }
            System.out.println();
        } 
        catch (IOException e) 
        {
            System.err.println("Error in reading file: " + e.getMessage());
        }
    }
}