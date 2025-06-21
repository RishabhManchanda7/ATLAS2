import java.io.*;
import java.io.IOException;
public class Task01
{
    public static void main(String args[])
    {

        File f1=new File("FileName01new.txt"); //to create new file
        FileOutputStream outfile = null;
        byte Text[] = {'I', ' ', 'L', 'I', 'N', 'K', ' ', 'I', 'N', 'D', 'I', 'A'};
        try
        {
            outfile = new FileOutputStream(f1);
            outfile.write(Text);
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
