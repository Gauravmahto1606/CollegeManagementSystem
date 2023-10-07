import java.sql.*;
class Conn {
    static Connection getCon() throws ClassNotFoundException,SQLException
    {
        //Step 1 : Load And Register Driver
        String driverName ="com.mysql.cj.jdbc.Driver";
        Class.forName(driverName);
        // System.out.println("Driver Loogged Succesfuly");
        //Step 2 : Connect with Db
        String dburl="jdbc:mysql://localhost:3306/lJUniversityData";
        String dbuser="root";
        String dbpass="";
       Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);
        //check is connection establihed
        return con;//returning Connection reference variable.
    }
}
