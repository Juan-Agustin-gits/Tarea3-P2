package View;

import codigo.Expendedor;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelExpendedor extends JPanel {
        // private DepositoMonedas deposi;
        boolean seLleno ;
        private Expendedor maquinon;
        private PanelComprador compri;
        static Expendedor maquina = new Expendedor(6);
        //aqui agustitn hizo un getter de cantidad de productos para que se ocupe el parametro del constructor de expendedor
        private ImageIcon coca, fanta, sprite, super8, sniker;
        static JLabel[] labelscoca = new JLabel[maquina.getCantidadProductos()];
        static JLabel[] labelsfanta = new JLabel[maquina.getCantidadProductos()];
        static JLabel[] labelssprite = new JLabel[maquina.getCantidadProductos()];
        static JLabel[] labelssuper8 = new JLabel[maquina.getCantidadProductos()];
        static JLabel[] labelssnickers = new JLabel[maquina.getCantidadProductos()];
        private int xcoca     = labelscoca.length-1;
        private int xsprite   = labelssprite.length-1;
        private int xfanta    = labelsfanta.length-1;
        private int xsuper8   = labelssuper8.length-1 ;
        private int xsnickers = labelssnickers.length-1 ;
        Border BordeExpendeodr = BorderFactory.createLineBorder(new Color(0, 0, 0), 0);


        public PanelExpendedor() {
            // deposi = new DepositoMonedas();
            // todas las rutas comentadas son la que sirven en ramaAlan
            this.setLayout(null);
            maquinon = new Expendedor(5);
            //Tarea-2-P2/src/main/java/View/Imagenes/SuperOcho.png
            super8 = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/SuperOcho.png");
            //super8 = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\SuperOcho.png");
                Image image = super8.getImage();
                    Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        super8.setImage(scaledImage);
            coca = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/CocaColaLata.png");
            //coca = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\CocaColaLata.png");
                Image imageco = coca.getImage();
                    Image scaledImageco = imageco.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        coca.setImage(scaledImageco);
            fanta = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/FantaLata.png");
            //fanta = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\FantaLata.png");
                Image imagef = fanta.getImage();
                    Image scaledImagefa = imagef.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        fanta.setImage(scaledImagefa);
            sprite = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/SpriteLata.png");
            //sprite = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\SpriteLata.png");
                Image imagesp = sprite.getImage();
                    Image scaledImagesp = imagesp.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        sprite.setImage(scaledImagesp);
            sniker = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/Snikers.png");
            //sniker = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Snikers.png");
                Image imagesnk = sniker.getImage();
                    Image scaledImagesnk = imagesnk.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        sniker.setImage(scaledImagesnk);
            for (int j = 0; j < maquina.getCantidadProductos(); j++) {
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
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    llenarDep();
                }
            });
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
            }
        }
        public void sacarfanta(){
            if(xfanta>=0 && xfanta < labelsfanta.length ){
                labelsfanta[xfanta].setVisible(false);
            }
            xfanta--;
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
    int auxCoca = xcoca;
        public void llenarCoca(){
            labelscoca[auxCoca].setVisible(true);
            auxCoca = auxCoca-1;
        }
        public void llenarFanta(){
            //labelsfanta[auxFanta].setVisible(true);
            //auxFanta = auxFanta -1;
            for (int i = 0; i < maquina.getCantidadProductos(); i++) {
                labelsfanta[i].setVisible(true);
            }
            xfanta = labelsfanta.length - 1 ;
        }
    int auxSprite = xsprite;
        public void llenarSprite(){
        labelssprite[auxSprite].setVisible(true);
        auxSprite = auxSprite-1;
    }
    int auxSuper8 = xsuper8;
        public void llenarSuper8(){
        labelssuper8[auxSuper8].setVisible(true);
        auxSuper8 = auxSuper8-1;
    }
    int auxSnikers = xsnickers;
        public void llenarSnikers(){
        labelssnickers[auxSnikers].setVisible(true);
        auxSnikers = auxSnikers-1;
    }
    public void llenarDep(){
            System.out.println("valor inicial"+xfanta);
            JFrame frame = new JFrame("¿QUE DEPOSITO QUIERES LLENAR?");
            JPanel panel = new JPanel();
            JButton botones0 = new JButton(coca);
            JButton botones1 = new JButton(fanta);
            JButton botones2 = new JButton(sprite);
            JButton botones3 = new JButton(super8);
            JButton botones4 = new JButton(sniker);
            panel.add(botones0);
                botones0.setVisible(true);
                botones0.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        llenarCoca();
                    }
                });
            panel.add(botones1);
                botones1.setVisible(true);
                botones1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        seLleno = true;
                        llenarFanta();
                        xfanta = labelsfanta.length-1;
                        System.out.println("al pretar el boton"+xfanta);
                    }
                });
            panel.add(botones2);
                botones2.setVisible(true);
                botones2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        llenarSprite();
                    }
                });
            panel.add(botones3);
                botones3.setVisible(true);
                botones3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        llenarSuper8();
                    }
                });
            panel.add(botones4);
                botones4.setVisible(true);
                botones4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        llenarSnikers();
                    }
                });
        panel.setBackground(Color.white);
        panel.setVisible(true);
        frame.add(panel);
        frame.setBounds(500,200,300,300);
        frame.setVisible(true);
    }

    public Expendedor getMaquina() {
        return maquina;
    }

    public ImageIcon getCoca() {
        return coca;
    }

    public ImageIcon getFanta() {
        return fanta;
    }

    public ImageIcon getSprite() {
        return sprite;
    }

    public ImageIcon getSuper8() {
        return super8;
    }

    public ImageIcon getSniker() {
        return sniker;
    }

    public int getSizeLabelscoca() {
        return labelscoca.length;
    }

    public int getSizeLabelsfanta() {
        return labelsfanta.length;
    }

    public int getSizeLabelssprite() {
        return labelssprite.length;
    }

    public int getSizeLabelssuper8() {
        return labelssuper8.length;
    }

    public int getSizeLabelsnickers() {
        return labelssnickers.length;
    }

    public int getXfanta() {
        return xfanta;
    }
}