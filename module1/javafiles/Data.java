import java.sql.*;

class Data{
    public static void main(String args[])
    {
        try{
        //   Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");

          String url = "jdbc:mysql://localhost:3306/java";
          String user = "root"; 
          String password = "Thinkitive123";
          Connection con=DriverManager.getConnection(url,user,password);

          if (con.isClosed())
          {
           System.out.println("Connection issue");
          }
          else{
            System.out.println("Connection established....");
          }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}


//compile javac -cp .:/home/lnv-155/Documents/Training/Affan-Khan/module1/javafiles/lib/mysql-connector-java-9.1.0.jar Data.java
//run java file-->java -cp .:/home/lnv-155/Documents/Training/Affan-Khan/module1/javafiles/lib/mysql-connector-java-9.1.0.jar Data
