import java.sql.*;

class Data1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
        try {
         
            Class.forName("com.mysql.cj.jdbc.Driver");

        
            String url = "jdbc:mysql://localhost:3306/java"; 
            String user = "root";
            String password = "Thinkitive123";

        
            Connection con = DriverManager.getConnection(url, user, password);

            
            String q = "CREATE TABLE table1 ("
                        + "tId INT(20) PRIMARY KEY AUTO_INCREMENT, "
                        + "tName VARCHAR(200) NOT NULL, "
                        + "tCity VARCHAR(400));";

            
            Statement stmt = con.createStatement();

        
            stmt.executeUpdate(q);
            System.out.println("Table 'table1' created successfully.");

            
            if (con.isClosed()) {
                System.out.println("Connection issue");
            } else {
                System.out.println("Connection established....");
            }

    
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
