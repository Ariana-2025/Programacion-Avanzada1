/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import excepciones.TiempoExcedidoException;

/**
 *
 * @author Ariana Perez
 */
public class ArchivoDescarga implements Runnable {
    private String nombreArchivo;
    private double tiempoLimite;
    private DescargaListener listener;

    public interface DescargaListener {
        void onInicio();
        void onExito(String mensaje);
        void onError(String error);
    }

    public ArchivoDescarga(String nombreArchivo, double tiempoLimite,
            DescargaListener listener) {

        this.nombreArchivo = nombreArchivo;
        this.tiempoLimite = tiempoLimite;
        this.listener = listener;
    }

    @Override
    public void run() {

        listener.onInicio();

        try {
            Thread.sleep(3000);

            double tiempoDescarga = 3;

            if (tiempoDescarga > tiempoLimite) {
                throw new TiempoExcedidoException(
                        "Tiempo limite de descarga excedido",
                        tiempoDescarga - tiempoLimite);
            }

            listener.onExito(
                    "Archivo descargado correctamente: "
                    + nombreArchivo);

        } catch (TiempoExcedidoException e) {

            listener.onError(
                    e.getMessage()
                    + ". Tiempo excedido: "
                    + e.getTiempo()
                    + " segundos");

        } catch (InterruptedException e) {

            listener.onError(
                    "La descarga fue interrumpida");
        }
    }
}
 
