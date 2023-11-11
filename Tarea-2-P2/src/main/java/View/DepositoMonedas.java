package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
// hay que pasarlo a un JPanel para poder organizar las monedas como un JLabel
public class DepositoMonedas extends JPanel {
    private Border borde = BorderFactory.createLineBorder(new Color(245, 245, 2, 200),5);

    public DepositoMonedas(){
        
    }
    public void paint( Graphics g ){
        super.paint(g);
    }
}
