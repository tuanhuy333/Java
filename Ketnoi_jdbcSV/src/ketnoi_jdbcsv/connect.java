/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoi_jdbcsv;

/**
 *
 * @author Administrator
 */

    import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;

/**
 *
 * @author Administrator
 */
public class connect {
    public connect(){};
  
    protected Connection getConnection() {
        Connection connection = null;
        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=sanpham;integratedSecurity=true;");
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    public ArrayList < sanpham > getAllSP(String sql) {

        // using try-with-resources to avoid closing resources (boiler plate code)
        ArrayList < sanpham > listSP = new ArrayList <sanpham> ();
        // Step 1: Establishing a Connection
        try {
        	Connection connection = getConnection();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
            
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id=rs.getInt("masp");
                String tensp=rs.getString("tensp");
                String theloai=rs.getString("theloai");
                listSP.add(new sanpham(id,tensp,theloai));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSP;
    }
}
    

