import java.io.FileWriter;
import java.io.IOException;

public class Ex1_write{
    public static void main(String[] args) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
        String filename = "output.txt";
        
        try (FileWriter writer = new FileWriter(filename)) 
        {
            for (char letter : alphabet) 
            {
                writer.write(letter + " ");
            }
            System.out.println("Successfull writing data into file");
        } 
        catch (IOException e) 
        {
            System.err.println("Error in writing file: " + e.getMessage());
        }
    }
}