/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Tserng
 */
public class clientes {
    Connection conexcion;
    PreparedStatement guardar;
    conexcion conex = new conexcion();
    //CONSTRUCTOR DE CLASE
    public clientes(){}
    
    //este metodo guarda los datos del cliente - vendedor - comprador
    public void guardar(int idclientes, String cedula, String nombre, String apellido, String direccion, String telefono, String correo, String status, String credito, String fechacreacion, String fechamodificacion, String idusuario){
        
     try{
     conex.conectar();
     guardar=conex.con.prepareStatement("INSERT INTO clientes (idclientes,cedula, nombre, apellido,direccion,telefono,correo,status,credito,fechacreacion,fechamodificacion,idusuario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        guardar.setInt(1, idclientes);
        guardar.setString(2, cedula);
        guardar.setString(3, nombre);
        guardar.setString(4, apellido);
        guardar.setString(5, direccion);
        guardar.setString(6, telefono);
        guardar.setString(7, correo);
        guardar.setString(8, status);
        guardar.setString(9, credito);
        guardar.setString(10, fechacreacion);
        guardar.setString(11, fechamodificacion);
        guardar.setString(12, idusuario);
        guardar.execute();
        JOptionPane.showMessageDialog(null, "Registro Guardado Satisfactoriamente");
     } catch (SQLException ex){
     JOptionPane.showMessageDialog(null,"El Registro No Se Logro Realizar Error:" +ex);
     }  
    
    }
    
    //este metodo actualiza los datos cliente - vendedor - comprador
    public void actualizar(){}
    
    //este metodo elimina cliente - vendedor - comprador
    public void eliminar(){}
    
    //este metodo lista los cliente - vendedor - comprador
    public void listar (){}

}
