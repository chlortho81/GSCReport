// Connect to mySql

import.java.sql.*;

public class Java2MySql{

    public static void main(String[] args) {

        String url = "jdbc.mysql://localhost:3306/";
        String dbName = "demo";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "bmwkilla123";
        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,username,password);

            conn.close();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


