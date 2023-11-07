package View;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador comprador;
    private PanelExpendedor expendedor;
    private DepositoMonedas depositoMonedas;
         public PanelPrincipal(){
             this.setLayout(null);
             expendedor = new PanelExpendedor();
             comprador = new PanelComprador();
             this.setBackground(new Color(25, 255, 255));
             this.setVisible(true);
             this.setBounds(0,0,1233,500);
             this.add(comprador);
             this.add(expendedor);
        }
        public void paint ( Graphics g ){
             super.paint(g);
        }
}
