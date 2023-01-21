import java.sql.*;

public class CreateTable{
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="";
        Connection con=DriverManager.getConnection(url,username,password);
        Statement stmt=con.createStatement();
        String sql="CREATE TABLE Student "+
            "(ID INTEGER,"+
            "Name VARCHAR(20),"+
            "Address VARCHAR(20),"+
            "Contact INTEGER,"+
            "PRIMARY KEY(ID))";
            // Statement stmt=con.createStatement();

            stmt.execute(sql);
            System.out.println("conn");
            con.close();
        
    }

}