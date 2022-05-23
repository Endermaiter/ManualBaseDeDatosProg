/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manualbasededatos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Endermaiter
 */
public class Conexion {

   public static final String url = "jdbc:mysql://localhost:3306/Productos";
   public static final String userName = "root";
   public static final String password = "marcosydavid1.";
   
   public static Connection establecerConexionBD(){
       Connection con = null;
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection(url,userName,password);
           System.out.println("Conexión Establecida");
       }catch(Exception e){
           System.out.println("e");
       }
       return con;
   }
    
}
