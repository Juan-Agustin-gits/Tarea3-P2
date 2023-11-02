import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class ventanap extends JFrame {
    private JButton boton;
    private JTextArea area;
    private Image coca;
    public ventanap(){
        super();
        this.setTitle("esta Ventana");
        this.setLayout(null);
        area = new JTextArea();
        area.setSize(400,400);
        boton = new JButton("boton");
        boton.setBounds(800,100, 100, 100);
        this.add(boton);
        this.add(area);
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        oyente();
    }
    //esto va a servir para mostrar lo que se devuelve y tambien la interfaz interctiva
    private void oyente(){
        MouseListener oyeoye = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               area.append("a\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                area.append("b\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        boton.addMouseListener(oyeoye);
        //aqui hay que hacer que sea para 5 tipos diferentes de productos
    }
}
