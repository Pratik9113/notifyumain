/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;
/*
 * @author 91799
 *//*
public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static final String USER = "root";
    static final String PASS = "Ayushi@8383";
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("DB_URL,USER,PASS");
            return conn;
        }
        catch(Exception ex){
            System.out.println("there were error while connecting to db. ");
            return null;
        }
    }
}*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static final String USER = "root";
    static final String PASS = "Ayushi@8383";

    public static Connection connectDB() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("There were errors while connecting to the database.");
            return null;
        }
    }
}

