import java.sql.*;
import java.util.*;

class Data3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/java"; 
            String user = "root"; 
            String password = "Thinkitive123"; 

            Connection con = DriverManager.getConnection(url, user, password);

            String q = "INSERT INTO table1 (tName, tCity) VALUES (?, ?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            System.out.print("Enter name: ");
            String tName = scanner.nextLine();  

            System.out.print("Enter city: ");
            String tCity = scanner.nextLine();  

            pstmt.setString(1, tName);
            pstmt.setString(2, tCity);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Inserted data successfully...");
                scanner.close();
                pstmt.close();
       
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}