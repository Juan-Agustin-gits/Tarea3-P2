 package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

 public class VentanaLlenarDeposito extends JFrame {
    private PanelExpendedor panelExpendedor;
    private JButton Depfanta = new JButton();
    private JButton Depcocacola = new JButton();
    private JButton Depsprite = new JButton();
    private JButton DepSuper8 = new JButton();
    private JButton DepSnikers = new JButton();
    public VentanaLlenarDeposito(){
        JPanel panel = new JPanel();
            panel.add(Depfanta);
                Depfanta.setIcon(panelExpendedor.getFanta());
                    Depfanta.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelExpendedor.llenarFanta();
                        }
                    });
            panel.add(Depcocacola);
                Depcocacola.setIcon(panelExpendedor.getCoca());
            panel.add(Depsprite);
                Depsprite.setIcon(panelExpendedor.getSprite());
            panel.add(DepSuper8);
                DepSuper8.setIcon(panelExpendedor.getSuper8());
            panel.add(DepSnikers);
                DepSnikers.setIcon(panelExpendedor.getSniker());
            panel.setBackground(new Color(255, 255, 255));
            panel.setVisible(true);
        this.add(panel);
        this.setVisible(true);
        this.setTitle("¿QUE DEPOSITO QUIERES LLENAR?");
        this.setBounds(500,100, 400,400);

    }
    public boolean verificaLleno(int sizeLabel,int sizeExp ){
        if(sizeLabel == sizeExp){
            getVentanaLlena();
            return false;
        }else{
            return true;
        }
    }
    public void getVentanaLlena(){
        JFrame ventanaLlena = new JFrame();
        JPanel panel = new JPanel();
        ventanaLlena.add(panel);
        JLabel lleno = new JLabel("Deposito lleno");
        panel.add(lleno);
        ventanaLlena.setVisible(true);
        ventanaLlena.setBounds(300,500,400,400);
        ventanaLlena.setVisible(true);
    }
}


