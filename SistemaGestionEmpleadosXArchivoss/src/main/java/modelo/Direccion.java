/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Cristian Perez
 */
public class Direccion implements Serializable{
    private String ciudad;
     private String calle;
     
     public Direccion(String ciudad, String calle){
         this.ciudad = ciudad;
         this.calle= calle;
     }
     public String getCiudad() {return ciudad;}
      public String getCalle() {return calle;}
      
      @Override
      public String toString(){
          return ciudad + "," + calle;
      }
}
