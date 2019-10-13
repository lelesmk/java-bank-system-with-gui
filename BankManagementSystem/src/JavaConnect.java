/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LelethuMkefa
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    
    Connection conn = null;
    
    // Connect to database
    public static Connection ConnectDb(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite://Users//LelethuMkefa//dev//practice-projects//java-practice//BankManagementSystem//bank.db");
            return conn;
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return null;
    }
}