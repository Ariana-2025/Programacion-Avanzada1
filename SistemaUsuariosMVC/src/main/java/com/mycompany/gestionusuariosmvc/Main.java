/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionusuariosmvc;
import Controlador.UsuarioController;
import Vista.UsuarioView;


/**
 *
 * @author Cristian Perez
 */
public class Main{
    public static void main(String[] args) {
        UsuarioView vista = new UsuarioView();
        UsuarioController controlador = new UsuarioController(vista);
        
        controlador.iniciar();
    }
}