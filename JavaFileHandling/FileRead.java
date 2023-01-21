import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class FileRead{
    public static void main(String[] args) throws IOException {
        String line=null;
        FileReader fr=new FileReader("read.txt");
        BufferedReader Br= new BufferedReader(fr);
        int count=0;
        while((line=Br.readLine())!=null){
            // String result=Br.readLine();
            if(line.contains("I")){
                count++;
            }

                

            }
            System.out.println(count);

            Br.close();
        }
      


    }
