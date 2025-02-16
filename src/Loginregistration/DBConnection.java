/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author Asus
 */
public class DBConnection {
    
    static final String DB_URL="jdbc:mysql://localhost/user";
    static final String USER="root";
    static final String PASS="";
    public static Connection connectDB(){
        Connection conn= null;
        try{
            //Register JDBC Driver ,not requires for newer version of jdk
            //Class.forName("com.mysql.jdbc.Driver");
            //open a connection
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch(Exception ex){
            System.out.println("There were errors while Connecting to Database.");
            return null;
        }
    }
}
