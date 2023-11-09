package View;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import codigo.*;

public class PanelComprador extends JPanel {
    /*private ImageIcon super8;*/
    private PanelExpendedor expri;
    JButton boton0;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    Border borde = BorderFactory.createLineBorder(new Color(255, 128, 0), 0);
    /* private JTextField cuadroDeTexto; */

    public PanelComprador() {
        expri = new PanelExpendedor();
        this.setBackground(new Color(50, 24, 134));
        setBorder(borde);
        this.setLayout(null);
        this.setBounds(600, 0, 635, 400);
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
        this.setVisible(true);
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expri.sacarcoca();
            }
        });
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expri.sacarfanta();
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expri.sacarsprite();
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expri.sacarsuper8();
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expri.sacarsnickers();
            }
        });
        /*cuadroDeTexto = new JTextField();
        cuadroDeTexto.setBounds(10, 50, 200, 30);
        cuadroDeTexto.setVisible(false);
        this.add(cuadroDeTexto);*/
    }
}

