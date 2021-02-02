/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONEXION_BD;

/**
 *
 * @author USUARIO1
 */
import java.sql.*;
public class Conexion {
//       Connection miconexion=null;
//   Statement sql=null;
//public Connection Conexion1(){
//    try {
//    Class.forName("com.mysql.jdbc.Driver");
// miconexion=DriverManager.getConnection("jdbc:mysql://localhost/bdregistros","Luis","123456");
//    } catch (Exception e) {
//        System.out.print(e.getMessage());
//    }
//    return miconexion; 
//}

     Connection miconexion=null;
 
public Conexion(){
    try {
    Class.forName("com.mysql.jdbc.Driver");
 miconexion=DriverManager.getConnection("jdbc:mysql://localhost/bdregistros","Luis1","123456");
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
   
}
public Connection getConnection(){
     return miconexion; 
}

}
