/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.ArchivoDescarga;

/**
 *
 * @author Ariana Perez
 */
public class DescargaController {
       public void iniciarDescarga(String nombreArchivo,
            double tiempoLimite,
            ArchivoDescarga.DescargaListener listener) {

        ArchivoDescarga descarga = new ArchivoDescarga(
                nombreArchivo,
                tiempoLimite,
                //this);
                listener);

        Thread hilo = new Thread(descarga);

        hilo.start();
    }
}
    