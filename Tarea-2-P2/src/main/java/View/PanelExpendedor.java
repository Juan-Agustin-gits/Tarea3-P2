package View;

import codigo.Expendedor;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
public class PanelExpendedor extends JPanel{
    public ImageIcon ReSize(ImageIcon foto){
        Image FotoOriginal = foto.getImage();
        Image FotoSize = FotoOriginal.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        ImageIcon fotoNueva = new ImageIcon(FotoSize);return  fotoNueva;};
    private int NewSize= 80;
    private ImageIcon FantaIcon = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\FantaLata.png");
        private ImageIcon FantaNueva = ReSize(FantaIcon);
            public ImageIcon getFantaNueva() {return FantaNueva;}
    //Fanta de tamaño 100px x 100px
    private ImageIcon CocaColaIcon = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\CocaColaLata.png");
        private ImageIcon CocaColaNueva = ReSize(CocaColaIcon);
            public ImageIcon getCocaColaNueva() {return CocaColaNueva;}
    //CocaCola de tamaño 100px x 100px

    private ImageIcon SpriteIcon = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\SpriteLata.png");
       private ImageIcon SpriteNueva = ReSize(SpriteIcon);
            public ImageIcon getSpriteNueva() {return SpriteNueva;}
    //Sprite Tamaño 100px x 100px

        private ImageIcon Super8Icon = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\SuperOcho.png");
            private ImageIcon Super8Nueva = ReSize(Super8Icon);
                public ImageIcon getSuper8Nueva() {return Super8Nueva;}
    //Super8 de tamaño 100px x 10
        private ImageIcon SnikersIcon = new ImageIcon("C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Snikers.png");
            private ImageIcon SnikersNueva = ReSize(SnikersIcon);
                public ImageIcon getSnikersNueva(){return SnikersNueva;}
    //Snikers de tamaño 100px x 100px
    private Border BordeExpendeodr = BorderFactory.createLineBorder(new Color(0,0,0),3);

    //private FlowLayout layout = new FlowLayout(FlowLayout.LEFT,30,10);
    private Expendedor expendedor = new Expendedor(6);
    private JLabel[] FantasArray = new JLabel[expendedor.getCantidadProductos()];
    private JLabel[] CocaArray = new JLabel[expendedor.getCantidadProductos()];
    private JLabel[] SpriteArray = new JLabel[expendedor.getCantidadProductos()];
    private JLabel[] Super8Array = new JLabel[expendedor.getCantidadProductos()];
    private JLabel[] SnikersArray = new JLabel[expendedor.getCantidadProductos()];
    private Color colorExp = new Color(131, 8, 8);
    private JPanel[] paneles = new JPanel[5];
    public PanelExpendedor() {
        Border BordeExpendeodr = BorderFactory.createLineBorder(new Color(0,0,0),3);
        this.setVisible(true);
        this.setBackground(new Color(131, 8, 8));
        setBorder(BordeExpendeodr);
        this.setBounds(0,0,600,510);
        //expendedor = new Expendedor(5);
        this.setLayout(new GridLayout(5,1));
        this.setBorder(BordeExpendeodr);
        for (int j = 0; j < 5; j++) {
            this.add(paneles[j] = new JPanel());
            paneles[j].setBackground(colorExp);
        }
            //Columna 0
        for(int i = 0; i < expendedor.getCantidadProductos(); i++) {
           FantasArray[i] = new JLabel(FantaNueva);
            paneles[0].add(FantasArray[i]);
        }
            //Columna 1
        for(int i = 0; i < expendedor.getCantidadProductos(); i++) {
            CocaArray[i] = new JLabel(CocaColaNueva);
            paneles[1].add(CocaArray[i]);
        }
            //Columna 2
        for(int i = 0; i < expendedor.getCantidadProductos(); i++) {
            SpriteArray[i] = new JLabel(SpriteNueva);
            paneles[2].add(SpriteArray[i]);
        }
            //Columna 3
        for(int i = 0; i < expendedor.getCantidadProductos(); i++) {
            Super8Array[i] = new JLabel(Super8Nueva);
            paneles[3].add(Super8Array[i]);
        }
            //Columna 4
        for(int i = 0; i < expendedor.getCantidadProductos(); i++) {
            SnikersArray[i] = new JLabel(SnikersNueva);
            paneles[4].add(SnikersArray[i]);
        }
        this.setBackground(colorExp);
        this.setBounds(0,0,600,510);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            VentanaLlenarDeposito ventanaLlenarDeposito = new VentanaLlenarDeposito();
                ventanaLlenarDeposito.funcionBoton();
            }
        });
    }
    public void paint( Graphics g ){
        super.paint(g);
    }

    public Expendedor getExpendedor() {
        return expendedor;
    }

    public JLabel[] getFantasArray() {
        return FantasArray;
    }

    public JLabel[] getCocaArray() {
        return CocaArray;
    }

    public JLabel[] getSpriteArray() {
        return SpriteArray;
    }

    public JLabel[] getSuper8Array() {
        return Super8Array;
    }

    public JLabel[] getSnikersArray() {
        return SnikersArray;
    }
}
