package View;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal;
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
        this.add(new PanelComprador());
        this.add(new DepositoMonedas());
        this.add(new PanelExpendedor());
        this.add(new PanelPrincipal(),BorderLayout.CENTER);
        this.setVisible(true);
    }
}
