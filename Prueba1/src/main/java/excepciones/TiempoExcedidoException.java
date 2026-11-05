/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Ariana Perez
 */
public class TiempoExcedidoException extends Exception {
    private double tiempo;

    public TiempoExcedidoException(String mensaje, double tiempo) {
        super(mensaje);
        this.tiempo = tiempo;
    }

    public double getTiempo() {
        return tiempo;
    }
}
    
