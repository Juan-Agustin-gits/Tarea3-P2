package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import codigo.Expendedor;

public class PanelExpendedor extends JPanel {
    private Expendedor maquinon;
    Expendedor maquina = new Expendedor(5);
    //aqui agustitn hizo un getter de cantidad de productos para que se ocupe el parametro del constructor de expendedor
    private ImageIcon coca, fanta, sprite, super8, sniker;
    JLabel[] labelscoca = new JLabel[5];
    JLabel[] labelsfanta = new JLabel[5];
    JLabel[] labelssprite = new JLabel[5];
    JLabel[] labelssuper8 = new JLabel[5];
    JLabel[] labelssnickers = new JLabel[5];
    Border BordeExpendeodr = BorderFactory.createLineBorder(new Color(0,0,0),3);
    public PanelExpendedor() {
        this.setLayout(null);
        maquinon = new Expendedor(5);
        super8 = new ImageIcon("src/main/java/view/SUPER-8.png");
        Image image = super8.getImage();
        Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        super8.setImage(scaledImage);
        coca = new ImageIcon("src/main/java/view/coca.png");
        Image imageco = coca.getImage();
        Image scaledImageco = imageco.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        coca.setImage(scaledImageco);
        fanta = new ImageIcon("src/main/java/view/fanta.png");
        Image imagef = fanta.getImage();
        Image scaledImagefa = imagef.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        fanta.setImage(scaledImagefa);
        sprite = new ImageIcon("src/main/java/view/sprite.png");
        Image imagesp = sprite.getImage();
        Image scaledImagesp = imagesp.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        sprite.setImage(scaledImagesp);
        sniker = new ImageIcon("src/main/java/view/sniker.png");
        Image imagesnk = sniker.getImage();
        Image scaledImagesnk = imagesnk.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        sniker.setImage(scaledImagesnk);
        for(int j=0; j<5; j++){
            labelscoca[j]=new JLabel();
            labelscoca[j].setIcon(coca);
            labelscoca[j].setBounds(j*90, 10, 50, 50);
            labelsfanta[j]=new JLabel();
            labelsfanta[j].setIcon(fanta);
            labelsfanta[j].setBounds(j*90, 60, 50, 50);
            labelssprite[j]=new JLabel();
            labelssprite[j].setIcon(sprite);
            labelssprite[j].setBounds(j*90, 110, 50, 50);
            labelssuper8[j]=new JLabel();
            labelssuper8[j].setIcon(super8);
            labelssuper8[j].setBounds(j*90, 160, 50, 50);
            labelssnickers[j]=new JLabel();
            labelssnickers[j].setIcon(sniker);
            labelssnickers[j].setBounds(j*90, 210, 50, 50);
            this.add(labelscoca[j]);
            this.add(labelsfanta[j]);
            this.add(labelssprite[j]);
            this.add(labelssuper8[j]);
            this.add(labelssnickers[j]);
        }
        this.setVisible(true);
        this.setBackground(new Color(131, 8, 8));
        setBorder(BordeExpendeodr);
        this.setBounds(0,0,600,510);
    }
    public void paint(Graphics g) {
        super.paint(g);
    }
}
