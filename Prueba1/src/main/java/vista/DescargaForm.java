/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import controlador.DescargaController;
import modelo.ArchivoDescarga;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Ariana Perez
 */
public class DescargaForm extends JFrame
        implements ArchivoDescarga.DescargaListener {
     private JTextField txtArchivo;
    private JTextField txtTiempo;
    private JButton btnDescargar;
    private JLabel lblEstado;

    private DescargaController controller;

    public DescargaForm() {

        controller = new DescargaController();

        setTitle("Descarga de Archivos");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Nombre del archivo:"));
        txtArchivo = new JTextField();
        panel.add(txtArchivo);

        panel.add(new JLabel("Tiempo limite (segundos):"));
        txtTiempo = new JTextField();
        panel.add(txtTiempo);

        btnDescargar = new JButton("Descargar");
        panel.add(btnDescargar);

        lblEstado = new JLabel("Estado: Esperando...");
        panel.add(lblEstado);

        add(panel);

        btnDescargar.addActionListener(e -> iniciarDescarga());
    }

    private void iniciarDescarga() {

        String nombreArchivo = txtArchivo.getText();

        try {

            double tiempoLimite =
                    Double.parseDouble(txtTiempo.getText());

            controller.iniciarDescarga(
                    nombreArchivo,
                    tiempoLimite,
                    this);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Ingrese un tiempo valido");
        }
    }

    @Override
    public void onInicio() {

        lblEstado.setText("Estado: Descargando...");
        btnDescargar.setEnabled(false);
    }

    @Override
    public void onExito(String mensaje) {

        lblEstado.setText("Estado: Descarga completada");
        btnDescargar.setEnabled(true);

        JOptionPane.showMessageDialog(
                this,
                mensaje);
    }

    @Override
    public void onError(String error) {

        lblEstado.setText("Estado: Error");
        btnDescargar.setEnabled(true);

        JOptionPane.showMessageDialog(
                this,
                error);
    }

    public static void main(String[] args) {

        DescargaForm ventana = new DescargaForm();
        ventana.setVisible(true);
    }
}
  
