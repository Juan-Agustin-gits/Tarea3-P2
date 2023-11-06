package View;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador comprador;
    private PanelExpendedor expendedor;
    private DepositoMonedas depositoMonedas;
         public PanelPrincipal(){
             expendedor = new PanelExpendedor();
             comprador = new PanelComprador();
             depositoMonedas = new DepositoMonedas();
             this.setBackground(new Color(255, 255, 255));
             this.setVisible(true);
        }
        private int x = 50 ;
        private int y = 50 ;
        private int radio = 50 ;
        public void paint ( Graphics g ){
             super.paint(g);
             //g.fillOval(x- radio,y - radio,2*radio,2*radio);
        }
}
