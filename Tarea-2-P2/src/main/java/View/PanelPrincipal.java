package View;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador comprador;
    private PanelExpendedor expendedor;
    private DepositoMonedas depositoMonedas;
         public PanelPrincipal() {
             this.setLayout(null);
             //depositoMonedas = new DepositoMonedas();
             this.setBackground(new Color(255, 255, 255));
             this.setVisible(true);
             this.setBounds(0, 0, 1233, 500);
             this.add(comprador = new PanelComprador());
             this.add(expendedor = new PanelExpendedor());
             this.add(depositoMonedas = new DepositoMonedas());
        }
    public void paint ( Graphics g ){
             super.paint(g);
        }
    public PanelComprador getComprador() {
        return comprador;
    }
    public PanelExpendedor getPanelExpendedor() {
        return expendedor;
    }
}
