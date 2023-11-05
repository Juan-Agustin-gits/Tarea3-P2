package View;

import javax.swing.*;
import java.awt.*;

public class MonedasLabel extends JLabel {
    ImageIcon MonedaIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/Moneda.png");
    Image imagenMonedas = MonedaIcon.getImage();
    int ancho = 100;
    int alto = 100;
    Image ResizedMonedas = imagenMonedas.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH);
    ImageIcon Moneda = new ImageIcon(ResizedMonedas);
    public MonedasLabel(){
        this.setSize(10,10);
        this.setIcon(Moneda);
    }

}
