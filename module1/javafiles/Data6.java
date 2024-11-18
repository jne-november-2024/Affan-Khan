import java.sql.*;
import java.util.*;

class Data6 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        try {
  
            Class.forName("com.mysql.cj.jdbc.Driver");

      
            String url = "jdbc:mysql://localhost:3306/java"; 
            String user = "root"; 
            String password = "Thinkitive123"; 

            Connection con = DriverManager.getConnection(url, user, password);

           
            String q = "DELETE FROM table1 WHERE tId = ?";

       
            PreparedStatement pstmt = con.prepareStatement(q);

           
            System.out.print("Enter the tId of the record you want to delete: ");
            int tId = scanner.nextInt();  

      
            pstmt.setInt(1, tId);

            int rowsAffected = pstmt.executeUpdate();

          
            if (rowsAffected > 0) {
                System.out.println("Deleted data successfully...");
            } else {
                System.out.println("No matching record found with tId: " + tId);
            }

        
            pstmt.close();
            con.close();
            scanner.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
