/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author avbravo
 */
public class conexcion {
private static String username="root";
private static String password="denver";
private static String database="subasta";
private static String url="jdbc:mysql://localhost/"+database;
public Connection con = null;
    
    //constructor de la clase
    public conexcion(){
               
        }
    
    public Connection conectar(){
         try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,username,password);
       // if (con!=null){
          //  JOptionPane.showMessageDialog(null, "Conexcion Exitosa");
       // }            
            
        } catch (SQLException | ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null,"Error de Conexcion" +ex);
        
        }
    return con;
    }
    
    public void desconectar(){
    con=null;
    //JOptionPane.showMessageDialog(null,"desconectada"  );
    }
}
