/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazsamsclub;
import java.lang.System.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author sergio
 */

public class conexion {
 
     Connection conectar=null;
       interfazproyecto lg = new interfazproyecto();
       String usuario;
       String contrasena;
       String base="samsclub2";
       String ip="192.168.43.25";
       String puerto="1433";
       
       public Connection establecerConexion()
       {
           Usuario user = new Usuario();    
           usuario=user.usuario;
           contrasena=user.contraseña;
           try {
               String cadena="jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+base+";user="+usuario+";password="+contrasena+";encrypt=true;trustServerCertificate=true;";
               conectar=DriverManager.getConnection(cadena, usuario, contrasena);   
           }catch(Exception e)
           {
               JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos"+e.toString());
           }
           return conectar;
       }

       public ResultSet Seleccionar()
       {
           Connection cn = establecerConexion();
           Statement st;
           ResultSet rs= null;
           try{
               st=cn.createStatement();
               rs=st.executeQuery("SELECT * FROM Sucursales");
           }catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(null,"Error al mostrar el Querry "+ex.toString());
           }
               
          return rs; 
       }
}
   