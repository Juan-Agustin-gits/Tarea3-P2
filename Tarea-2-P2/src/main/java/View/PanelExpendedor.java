package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private int NewSize= 80;
    private ImageIcon FantaIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/FantaLata.png");
        private Image FantaOriginal = FantaIcon.getImage();
        private Image FantaSize = FantaOriginal.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon FantaNueva = new ImageIcon(FantaSize);
    //Fanta de tamaño 100px x 100px
    private ImageIcon CocaColaIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/CocaColaLata.png");
        private Image CocacolaOriginal = CocaColaIcon.getImage();
        private Image CocaColaSize = CocacolaOriginal.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon CocaColaNueva = new ImageIcon(CocaColaSize);
    //CocaCola de tamaño 100px x 100px

    private ImageIcon SpriteIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/SpriteLata.png");
        private Image SpriteOriginal = SpriteIcon.getImage();
        private Image SpriteSize = SpriteOriginal.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon SpriteNueva = new ImageIcon(SpriteSize);
    //Sprite Tamaño 100px x 100px

        private ImageIcon Super8Icon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/SuperOcho.png");
        private Image Super8Origial = Super8Icon.getImage();
        private Image Super8Size = Super8Origial.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon Super8Nueva = new ImageIcon(Super8Size);
    //Super8 de tamaño 100px x 10
        private ImageIcon SnikersIcon = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/Snikers.png");
        private Image SnikersOriginal = SnikersIcon.getImage();
        private Image SnikersSize = SnikersOriginal.getScaledInstance(NewSize,NewSize,Image.SCALE_SMOOTH);
        private ImageIcon SnikersNueva = new ImageIcon(SnikersSize);
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
    public PanelExpendedor() {
        this.setBackground(new Color(131, 8, 8));
        this.setLayout(layout);
        this.setBorder(BordeExpendeodr);
            //Columna 0
            this.add(JFanta);
            this.add(JCocaCola);
            this.add(JSprite);
            this.add(JSuperOcho);
            this.add(JSnikers);
            //Columna 1
            this.add(JFanta1);
            this.add(JCocaCola1);
            this.add(JSprite1);
            this.add(JSuperOcho1);
            this.add(JSnikers1);
            //Columna 2
            this.add(JFanta2);
            this.add(JCocaCola2);
            this.add(JSprite2);
            this.add(JSuperOcho2);
            this.add(JSnikers2);
            //Columna 3
            this.add(JFanta3);
            this.add(JCocaCola3);
            this.add(JSprite3);
            this.add(JSuperOcho3);
            this.add(JSnikers3);
            //Columna 4
            this.add(JFanta4);
            this.add(JCocaCola4);
            this.add(JSprite4);
            this.add(JSuperOcho4);
            this.add(JSnikers4);
        this.setBounds(0,0,600,510);
    }
    public void paint( Graphics g ){
        super.paint(g);
        g.create(50,50,200,200);
    }
}
