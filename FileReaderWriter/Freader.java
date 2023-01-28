import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Freader {
    // In main fnx using exception handling since filestreams throws exception
        public static void main(String[] args) throws Exception{
        //  Creating object of file reader and providing the file path as an iargument 
        //  in a constructor
        FileReader fr= new FileReader("writeONfile.txt");

        BufferedReader br=new BufferedReader(fr);
        String a=br.readLine();
        br.close();
        System.out.println("The string is "+ a);
        System.out.println("The length of the string is "+ a.length());


    }
    
}
