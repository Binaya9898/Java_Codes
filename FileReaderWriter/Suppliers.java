import java.util.*;
import java.io.*;

public class Suppliers {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name, address;
        int contact;
        FileWriter fw=new FileWriter("Supplier.txt",true);
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter Name:");
            name = sc.next();
            System.out.println("Enter Address:");
            address = sc.next();
            System.out.println("Enter Contact:");
            contact = sc.nextInt();
            fw.write(name + " "+ address+" "+contact+System.lineSeparator());
        }
        sc.close();
        fw.close();


    }

}