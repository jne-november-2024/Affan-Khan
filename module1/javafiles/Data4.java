import java.io.*;
import java.sql.*;
import java.util.*;

class Data4 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/java"; 
            String user = "root"; 
            String password = "Thinkitive123"; 

            Connection con = DriverManager.getConnection(url, user, password);

            String q = "INSERT INTO images (pic) VALUES (?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            System.out.print("Enter the file path of the image: ");
            String filePath = scanner.nextLine();  

            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);

            pstmt.setBinaryStream(1, fis, (int) file.length());

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Inserted image successfully...");
            } else {
                System.out.println("Failed to insert image.");
            }

            fis.close();
            pstmt.close();
            con.close();
            scanner.close();  

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
