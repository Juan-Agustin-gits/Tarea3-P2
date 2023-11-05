package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
// hay que pasarlo a un JPanel para poder organizar las monedas como un JLabel
public class DepositoMonedas extends JPanel {
    private FlowLayout layout = new FlowLayout(FlowLayout.LEFT,30,10);
    private ImageIcon MonedaIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/Moneda.png");
    private Image imagenMonedas = MonedaIcon.getImage();
    private int ancho = 100;
    private int alto = 100;
    private Image ResizedMonedas = imagenMonedas.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH);
    private  ImageIcon Moneda = new ImageIcon(ResizedMonedas);
    private JLabel moneda1 = new JLabel(Moneda);
    private JLabel moneda2 = new JLabel(Moneda);
    private Border borde = BorderFactory.createLineBorder(new Color(245, 245, 2, 200),5);

    public DepositoMonedas(){
        this.setBackground(new Color(1,1,1, 234));
        this.setOpaque(true);
        this.setBorder(borde);
        this.setLayout(layout);
        this.add(moneda1);
        this.add(moneda2);
        this.setBounds(0,510,1233,150);
    }
    public void paint( Graphics g ){
        super.paint(g);
    }
}
