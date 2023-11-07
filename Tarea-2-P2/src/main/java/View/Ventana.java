package View;

import codigo.Comprador;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal;
    private PanelExpendedor panelExpendedor ;
    private PanelComprador panelComprador;
    private DepositoMonedas depositoMonedas;
    private Comprador comprador;
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Mi Ventana");
        this.setResizable(false);
        /*
        importar imagen para el icono de la ventana:
               ImageIcon image = new ImageIcon(" Direccion de la imagen en la carpeta del proyecto ")
               this.setIconImage( image.getImage());
         */
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1250,700);
        this.add(panelComprador = new PanelComprador());
        this.add(depositoMonedas = new DepositoMonedas());
        this.add(panelExpendedor = new PanelExpendedor());
        this.add(new PanelPrincipal(),BorderLayout.CENTER);
        this.setVisible(true);
    }


    public PanelPrincipal getPanelPrincipal() {
        return panelPrincipal;
    }

    public PanelExpendedor getPanelExpendedor() {
        return panelExpendedor;
    }
}
