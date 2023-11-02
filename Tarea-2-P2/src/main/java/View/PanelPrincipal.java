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
             this.setBackground(new Color(255, 255, 255));
        }
        public void paint ( Graphics g ){
             super.paint(g);
        }
}
