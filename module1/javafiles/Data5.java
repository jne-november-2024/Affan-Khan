import java.sql.*;
import java.util.*;

class Data5 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        try {
      
            Class.forName("com.mysql.cj.jdbc.Driver");

   
            String url = "jdbc:mysql://localhost:3306/java"; 
            String user = "root"; 
            String password = "Thinkitive123"; 

     
            Connection con = DriverManager.getConnection(url, user, password);

          
            String q = "UPDATE table1 SET tName = ?, tCity = ? WHERE tId = ?";

        
            PreparedStatement pstmt = con.prepareStatement(q);

          
            System.out.print("Enter the tId of the record you want to update: ");
            int tId = scanner.nextInt(); 
            scanner.nextLine();

            System.out.print("Enter the new name: ");
            String tName = scanner.nextLine();  

            System.out.print("Enter the new city: ");
            String tCity = scanner.nextLine();

     
            pstmt.setString(1, tName);
            pstmt.setString(2, tCity);
            pstmt.setInt(3, tId);

        
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Updated data successfully...");
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

