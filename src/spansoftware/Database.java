/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spansoftware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Niraj
 */
public class Database {

    

    String url = "jdbc:mysql://localhost:3306/?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "root";
      public Statement getDBConnection() throws SQLException {
           Connection con = DriverManager.getConnection(url, user, password);
           System.out.println("connection done.");
        Statement stmt_ = con.createStatement();
        System.out.println("hii");
         return stmt_;
      }
   

   /** public Statement getStmt_() {
        return stmt_;
    }**/
}
