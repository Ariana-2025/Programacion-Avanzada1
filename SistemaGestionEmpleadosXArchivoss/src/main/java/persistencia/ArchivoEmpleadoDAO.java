/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import modelo.Empleado;
import modelo.Direccion;
import java.io.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;


/**
 *
 * @author Ariana Perez
 */
public class ArchivoEmpleadoDAO {
    private static final String RUTA_ARCHIVO = "empleados.txt";
    public void guardarEmpleado(Empleado emp) throws IOException{
        try(PrintWriter write= new PrintWriter(new FileWriter(RUTA_ARCHIVO, true))){
           write.println(emp.getId()+";"+emp.getNombre()+";"+ emp.getDireccion().getCiudad() +";"+emp.getDireccion().getCalle()+";"+
                   emp.calcularSalario());
        }
    }
    
    public ArrayList<String> leerEmpleados()throws IOException{
        ArrayList<String> lista = new ArrayList<>();
        File file= new File(RUTA_ARCHIVO);
        if(!file.exists()) return lista;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(file)) ){
            String linea;
            while((linea= reader.readLine())!= null){
            lista.add(linea);
        }
            
        }
        return lista;
    }
    
}

