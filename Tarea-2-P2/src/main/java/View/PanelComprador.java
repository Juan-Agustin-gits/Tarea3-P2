package View;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import codigo.*;

public class PanelComprador extends JPanel {
    /*private ImageIcon super8;*/
    private JButton boton0;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    Border borde = BorderFactory.createLineBorder(new Color(255, 128, 0), 5);

    public PanelComprador() {
        /*super8 = new ImageIcon("src/main/java/view/SUPER-8.png");
        Image image = super8.getImage();
        Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        super8.setImage(scaledImage);*/
        this.setBackground(new Color(50, 24, 134));
        setBorder(borde);
        this.setLayout(null);
        this.setBounds(600, 0, 635, 510);
        boton0 = new JButton("0");
        boton0.setBounds(50, 5, 50, 50);
        boton1 = new JButton("1");
        boton1.setBounds(50, 55, 50, 50);
        boton2 = new JButton("2");
        boton2.setBounds(50, 105, 50, 50);
        boton3 = new JButton("3");
        boton3.setBounds(50, 155, 50, 50);
        boton4 = new JButton("4");
        boton4.setBounds(50, 205, 50, 50);
        this.add(boton0);
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        cboton0();
        cboton1();
        cboton2();
        cboton3();
        cboton4();
    }

    private void cboton0() {
        MouseListener list = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

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
        boton0.addMouseListener(list);
    }

    private void cboton1() {
        MouseListener list = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

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
        boton1.addMouseListener(list);
    }

    private void cboton2() {
        MouseListener list = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

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
        boton2.addMouseListener(list);
    }

    private void cboton3() {
        MouseListener list = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

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
        boton3.addMouseListener(list);
    }

    private void cboton4() {
        MouseListener list = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

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
        boton4.addMouseListener(list);
    }

    //hay que lograr hacer que lo siguiente pase cuando se presione algun boton
    /*public void paint(Graphics g) {
        super.paint(g);
        if (super8 != null) {
            super8.paintIcon(this, g, 200, 10);
        }
    } */
}

