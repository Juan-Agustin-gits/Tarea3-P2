package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLlenarDeposito extends JFrame {
    private PanelExpendedor panelExpendedor = new PanelExpendedor();
    private JButton Depfanta = new JButton();
    private JButton Depcocacola = new JButton();
    private JButton Depsprite = new JButton();
    private JButton DepSuper8 = new JButton();
    private JButton DepSnikers = new JButton();
    public VentanaLlenarDeposito(){
        JPanel panel = new JPanel();
            panel.add(Depfanta);
                Depfanta.setIcon(panelExpendedor.getFantaNueva());
            panel.add(Depcocacola);
                Depcocacola.setIcon(panelExpendedor.getCocaColaNueva());
            panel.add(Depsprite);
                Depsprite.setIcon(panelExpendedor.getSpriteNueva());
            panel.add(DepSuper8);
                DepSuper8.setIcon(panelExpendedor.getSuper8Nueva());
            panel.add(DepSnikers);
                DepSnikers.setIcon(panelExpendedor.getSnikersNueva());
            panel.setBackground(new Color(255, 255, 255));
            panel.setVisible(true);
        this.add(panel);
        this.setVisible(true);
        this.setTitle("¿QUE DEPOSITO QUIERES LLENAR?");
        this.setBounds(500,100, 400,400);
    }
    public void funcionBoton(){
        int sizeFanta = panelExpendedor.getExpendedor().getFanta().size();
        int sizeCoca = panelExpendedor.getExpendedor().getFanta().size();
        int sizeSprite = panelExpendedor.getExpendedor().getSprite().size();
        int sizeSuper = panelExpendedor.getExpendedor().getSuper8().size();
        int sizesprite = panelExpendedor.getExpendedor().getSniker().size();
    }
}
