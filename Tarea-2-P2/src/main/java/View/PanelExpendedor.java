package View;

import codigo.Expendedor;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PanelExpendedor extends JPanel {
    private int NewSize= 80;
    private ImageIcon FantaIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/FantaLata.png");
        private Image FantaOriginal = FantaIcon.getImage();
        private Image FantaSize = FantaOriginal.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon FantaNueva = new ImageIcon(FantaSize);

    public ImageIcon getFantaNueva() {
        return FantaNueva;
    }

    //Fanta de tamaño 100px x 100px
    private ImageIcon CocaColaIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/CocaColaLata.png");
        private Image CocacolaOriginal = CocaColaIcon.getImage();
        private Image CocaColaSize = CocacolaOriginal.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon CocaColaNueva = new ImageIcon(CocaColaSize);
    public ImageIcon getCocaColaNueva() {
        return CocaColaNueva;
    }
    //CocaCola de tamaño 100px x 100px

    private ImageIcon SpriteIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/SpriteLata.png");
        private Image SpriteOriginal = SpriteIcon.getImage();
        private Image SpriteSize = SpriteOriginal.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon SpriteNueva = new ImageIcon(SpriteSize);
    public ImageIcon getSpriteNueva() {
        return SpriteNueva;
    }
    //Sprite Tamaño 100px x 100px

        private ImageIcon Super8Icon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/SuperOcho.png");
        private Image Super8Origial = Super8Icon.getImage();
        private Image Super8Size = Super8Origial.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon Super8Nueva = new ImageIcon(Super8Size);
    public ImageIcon getSuper8Nueva() {
        return Super8Nueva;
    }
    //Super8 de tamaño 100px x 10
        private ImageIcon SnikersIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/Snikers.png");
        private Image SnikersOriginal = SnikersIcon.getImage();
        private Image SnikersSize = SnikersOriginal.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon SnikersNueva = new ImageIcon(SnikersSize);
    public ImageIcon getSnikersNueva() {
        return SnikersNueva;
    }
    //Snikers de tamaño 100px x 100px
    private Border BordeExpendeodr = BorderFactory.createLineBorder(new Color(0,0,0),3);
    private JLabel JFanta = new JLabel(FantaNueva);
        private JLabel JFanta1 = new JLabel(FantaNueva);
        private JLabel JFanta2 = new JLabel(FantaNueva);
        private JLabel JFanta3 = new JLabel(FantaNueva);
        private JLabel JFanta4 = new JLabel(FantaNueva);
    private JLabel JCocaCola = new JLabel(CocaColaNueva);
        private JLabel JCocaCola1 = new JLabel(CocaColaNueva);
        private JLabel JCocaCola2 = new JLabel(CocaColaNueva);
        private JLabel JCocaCola3 = new JLabel(CocaColaNueva);
        private JLabel JCocaCola4 = new JLabel(CocaColaNueva);
    private JLabel JSprite = new JLabel(SpriteNueva);
        private JLabel JSprite1 = new JLabel(SpriteNueva);
        private JLabel JSprite2 = new JLabel(SpriteNueva);
        private JLabel JSprite3 = new JLabel(SpriteNueva);
        private JLabel JSprite4 = new JLabel(SpriteNueva);
    private JLabel JSuperOcho = new JLabel(Super8Nueva);
        private JLabel JSuperOcho1 = new JLabel(Super8Nueva);
        private JLabel JSuperOcho2 = new JLabel(Super8Nueva);
        private JLabel JSuperOcho3 = new JLabel(Super8Nueva);
        private JLabel JSuperOcho4 = new JLabel(Super8Nueva);
    private JLabel JSnikers = new JLabel(SnikersNueva);
        private JLabel JSnikers1 = new JLabel(SnikersNueva);
        private JLabel JSnikers2 = new JLabel(SnikersNueva);
        private JLabel JSnikers3 = new JLabel(SnikersNueva);
        private JLabel JSnikers4 = new JLabel(SnikersNueva);

    private FlowLayout layout = new FlowLayout(FlowLayout.LEFT,30,10);
    private Expendedor expendedor;
    public PanelExpendedor() {
        expendedor = new Expendedor(5);
        this.setBackground(new Color(131, 8, 8));
        this.setLayout(layout);
        this.setBorder(BordeExpendeodr);
            //Columna 0
            this.add(JFanta);
            this.add(JFanta1);
            this.add(JFanta2);
            this.add(JFanta3);
            this.add(JFanta4);
            //Columna 1
            this.add(JCocaCola);
            this.add(JCocaCola1);
            this.add(JCocaCola2);
            this.add(JCocaCola3);
            this.add(JCocaCola4);
            //Columna 2
            this.add(JSprite);
            this.add(JSprite1);
            this.add(JSprite2);
            this.add(JSprite3);
            this.add(JSprite4);
            //Columna 3
            this.add(JSuperOcho);
            this.add(JSuperOcho1);
            this.add(JSuperOcho2);
            this.add(JSuperOcho3);
            this.add(JSuperOcho4);
            //Columna 4
            this.add(JSnikers);
            this.add(JSnikers1);
            this.add(JSnikers2);
            this.add(JSnikers3);
            this.add(JSnikers4);
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

    public JLabel getJFanta() {
        return JFanta;
    }

    public JLabel getJFanta1() {
        return JFanta1;
    }

    public JLabel getJFanta2() {
        return JFanta2;
    }

    public JLabel getJFanta3() {
        return JFanta3;
    }

    public JLabel getJFanta4() {
        return JFanta4;
    }

    public JLabel getJCocaCola() {
        return JCocaCola;
    }

    public JLabel getJCocaCola1() {
        return JCocaCola1;
    }

    public JLabel getJCocaCola2() {
        return JCocaCola2;
    }

    public JLabel getJCocaCola3() {
        return JCocaCola3;
    }

    public JLabel getJCocaCola4() {
        return JCocaCola4;
    }

    public JLabel getJSprite() {
        return JSprite;
    }

    public JLabel getJSprite1() {
        return JSprite1;
    }

    public JLabel getJSprite2() {
        return JSprite2;
    }

    public JLabel getJSprite3() {
        return JSprite3;
    }

    public JLabel getJSprite4() {
        return JSprite4;
    }

    public JLabel getJSuperOcho() {
        return JSuperOcho;
    }

    public JLabel getJSuperOcho1() {
        return JSuperOcho1;
    }

    public JLabel getJSuperOcho2() {
        return JSuperOcho2;
    }

    public JLabel getJSuperOcho3() {
        return JSuperOcho3;
    }

    public JLabel getJSuperOcho4() {
        return JSuperOcho4;
    }

    public JLabel getJSnikers() {
        return JSnikers;
    }

    public JLabel getJSnikers1() {
        return JSnikers1;
    }

    public JLabel getJSnikers2() {
        return JSnikers2;
    }

    public JLabel getJSnikers3() {
        return JSnikers3;
    }

    public JLabel getJSnikers4() {
        return JSnikers4;
    }
}
