package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
// hay que pasarlo a un JPanel para poder organizar las monedas como un JLabel
public class DepositoMonedas extends JLabel {
    public DepositoMonedas(){
        /*
         con el siguiente codigo pondemos importar imagenes en una variable
         JLabel label = new JLabel();
                label.setText("Ingresa el txt opara mostrar en la ventana");
                label.setIcon(ingresa la variable que guarda la imagen);
        */
        Border borde = BorderFactory.createLineBorder(new Color(245, 245, 2, 200),5);
        this.setBackground(new Color(1,1,1, 234));
        this.setOpaque(true);
        this.setBorder(borde);
        this.setBounds(0,510,1233,150);
    }
    public void paint( Graphics g ){
        super.paint(g);
    }
}
