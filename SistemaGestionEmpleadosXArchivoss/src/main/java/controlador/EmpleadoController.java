/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import modelo.Empleado;
import modelo.Direccion;
import persistencia.ArchivoEmpleadoDAO;
import java.io.IOException;

/**
 *
 * @author Ariana Perez
 */
public class EmpleadoController {
    private ArchivoEmpleadoDAO dao;
    
    public EmpleadoController(){
        this.dao= new ArchivoEmpleadoDAO();
    }
    public boolean registrarEmpleado(String id, String nombre, String ciudad, String calle, double salario, double bono){
     try{
          Direccion dir = new Direccion(ciudad,calle);
          Empleado emp= new Empleado(id, nombre, dir, salario, bono);
          dao.guardarEmpleado(emp);
          return true;
      }catch(IOException e){
        System.err.println("Error de E/S"+ e.getMessage());
         return false;
    }
    } 

public ArrayList<String> listarEmpleados() {
    try {
        return dao.leerEmpleados();
    } catch (IOException e) {
        System.err.println("Error al leer empleados: " + e.getMessage());
        return new ArrayList<>();
    }
}

} 



