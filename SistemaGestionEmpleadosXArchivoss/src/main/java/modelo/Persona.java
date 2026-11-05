/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Cristian Perez
 */
public abstract class Persona{
    private String id;
    private String nombre;
    private Direccion direccion;
    
    public Persona(String id, String nombre, Direccion direccion){
        this.id= id;
        this.nombre= nombre;
        this.direccion= direccion;
    }
    public String getId(){return id;}
    public String getNombre(){return nombre;}
    public Direccion getDireccion(){ return direccion;}
    
    public abstract double calcularSalario();
}