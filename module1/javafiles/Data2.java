import java.sql.*;

class Data2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
        try {
         
            Class.forName("com.mysql.cj.jdbc.Driver");

        
            String url = "jdbc:mysql://localhost:3306/java"; 
            String user = "root";
            String password = "Thinkitive123";

        
            Connection con = DriverManager.getConnection(url, user, password);

            
            String q = "insert into table1(tName,tCity) values(?,?)";
            
            PreparedStatement pstmt = con.prepareStatement(q);

        
            pstmt.setString(1, "Zeeshan Siddique");
            pstmt.setString(2, "London");
            pstmt.executeUpdate();

           

            
            if (con.isClosed()) {
                System.out.println("Connection issue");
            } else {
                System.out.println("Inserted data Successfully...");
            }

    
            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
