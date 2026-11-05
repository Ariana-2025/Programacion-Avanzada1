/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author Cristian Perez
 */

//METODO ABSTRACTO CREADO PARA OBLIGAR A LAS SUBCLASES A IMPLEMENTAR SU CALCULO DE SUELDO
   // public abstract double calcularSalario();

public class Empleado extends Persona{
    private double salarioBase;
    private double bono;
    //SERA EL MIEMBRO ESTATICO QUE NOS AYUDARA A CONTAR LAS INSTANCIAS GLOBALES CREADAS
    public static int contadorEmpleados= 0;
    
    public Empleado(String id, String nombre, Direccion direccion, double salarioBase, double bono){
        super(id, nombre, direccion); //llamada al constructor padre
        this.salarioBase= salarioBase;
        this.bono= bono;
        contadorEmpleados++;
    }
     @Override
      public double calcularSalario(){
          return salarioBase + bono;
      }
}

