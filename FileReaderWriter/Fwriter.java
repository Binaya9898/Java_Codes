import java.io.BufferedWriter;
import java.io.*;
import java.util.*;

public class Fwriter{
    public static void main(String[] args) throws IOException{
        System.out.println("Input a string to write in a file");
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        FileWriter fw=new FileWriter("writeONfile.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(a);
        bw.close();


    }

}