package View;

import codigo.Expendedor;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelExpendedor extends JPanel {
        // private DepositoMonedas deposi;
        private Expendedor maquinon;
        private PanelComprador compri;
        Expendedor maquina = new Expendedor(5);
        //aqui agustitn hizo un getter de cantidad de productos para que se ocupe el parametro del constructor de expendedor
        private ImageIcon coca, fanta, sprite, super8, sniker;
        private int xcoca=4;
        private int xsprite=4;
        private int xfanta=4;
        private int xsuper8=4;
        private int xsnickers=4;
        static JLabel[] labelscoca = new JLabel[5];
        static JLabel[] labelsfanta = new JLabel[5];
        static JLabel[] labelssprite = new JLabel[5];
        static JLabel[] labelssuper8 = new JLabel[5];
        static JLabel[] labelssnickers = new JLabel[5];
        Border BordeExpendeodr = BorderFactory.createLineBorder(new Color(0, 0, 0), 0);

        public PanelExpendedor() {
            // deposi = new DepositoMonedas();
            this.setLayout(null);
            maquinon = new Expendedor(5);
            //Tarea-2-P2/src/main/java/View/Imagenes/SuperOcho.pngsuper8 = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/SuperOcho.png");
            super8 = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\SuperOcho.png");
                Image image = super8.getImage();
                    Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        super8.setImage(scaledImage);
            //coca = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/CocaColaLata.png");
            coca = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\CocaColaLata.png");
                Image imageco = coca.getImage();
                    Image scaledImageco = imageco.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        coca.setImage(scaledImageco);
            fanta = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\FantaLata.png");
                Image imagef = fanta.getImage();
                    Image scaledImagefa = imagef.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        fanta.setImage(scaledImagefa);
            sprite = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\SpriteLata.png");
                Image imagesp = sprite.getImage();
                    Image scaledImagesp = imagesp.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        sprite.setImage(scaledImagesp);
            sniker = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Snikers.png");
                Image imagesnk = sniker.getImage();
                    Image scaledImagesnk = imagesnk.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        sniker.setImage(scaledImagesnk);
            for (int j = 0; j < 5; j++) {
                labelscoca[j] = new JLabel();
                    labelscoca[j].setIcon(coca);
                    labelscoca[j].setBounds(j * 90, 10, 50, 50);
                labelsfanta[j] = new JLabel();
                    labelsfanta[j].setIcon(fanta);
                        labelsfanta[j].setBounds(j * 90, 60, 50, 50);
                labelssprite[j] = new JLabel();
                    labelssprite[j].setIcon(sprite);
                        labelssprite[j].setBounds(j * 90, 110, 50, 50);
                labelssuper8[j] = new JLabel();
                    labelssuper8[j].setIcon(super8);
                        labelssuper8[j].setBounds(j * 90, 160, 50, 50);
                labelssnickers[j] = new JLabel();
                    labelssnickers[j].setIcon(sniker);
                        labelssnickers[j].setBounds(j * 90, 210, 50, 50);
                this.add(labelscoca[j]);
                this.add(labelsfanta[j]);
                this.add(labelssprite[j]);
                this.add(labelssuper8[j]);
                this.add(labelssnickers[j]);
                /*sacarcoca();*/

            }
            this.setVisible(true);
            this.setBackground(new Color(131, 8, 8));
            setBorder(BordeExpendeodr);
            this.setBounds(0, 0, 625, 700);
        }
        public void paint(Graphics g) {
            super.paint(g);
        }
        public void sacarcoca(){
            if(xcoca>=0){
                labelscoca[xcoca].setVisible(false);
            }
            xcoca=xcoca-1;
            if(xcoca<=-2){
                noqueda();
                //VentanaNoQueda noquedapo = new VentanaNoQueda();
            }
        }
        public void sacarfanta(){
            if(xfanta>=0){
                labelsfanta[xfanta].setVisible(false);
            }
            xfanta=xfanta-1;
            if(xfanta<=-2){
                noqueda();
            }
        }
        public void sacarsprite(){
            if(xsprite>=0){
                labelssprite[xsprite].setVisible(false);
            }
            xsprite=xsprite-1;
            if(xsprite<=-2){
                noqueda();
            }
        }
        public void sacarsuper8(){
            if(xsuper8>=0){
                labelssuper8[xsuper8].setVisible(false);
            }
            xsuper8=xsuper8-1;
            if(xsuper8<=-2){
                noqueda();
            }
        }
        public void sacarsnickers(){
            if(xsnickers>=0){
                labelssnickers[xsnickers].setVisible(false);
            }
            xsnickers=xsnickers-1;
            if(xsnickers<=-2){
                noqueda();
            }
        }
        public void noqueda(){
            JFrame frami = new JFrame("No hay producto");
                frami.setSize(300, 200);
            JPanel panel = new JPanel();
            // Crear un cuadro de texto con el contenido "No queda"
            JTextField textField = new JTextField("No queda");
            // Deshabilitar la edición para que el texto no sea modificable
            textField.setEditable(false);
            // Agregar el cuadro de texto al panel
            panel.add(textField);
            frami.add(panel);
            frami.setVisible(true);
        }
    }