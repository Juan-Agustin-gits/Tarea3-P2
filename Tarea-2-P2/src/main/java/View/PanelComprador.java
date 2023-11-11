package View;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import codigo.*;

/**
 * Es el JPanel del comprador, el cual cuenta con los metodos para poder realizar compras en el Expendedor
 * cuenta con Botones,un JPanel para las monedas de vuelto y distintos metodos internos.
 */
public class PanelComprador extends JPanel {
    /*private ImageIcon super8;*/
    private ImageIcon monedaVuelto = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/Moneda100SinFondo.png");
        private Image imagen = monedaVuelto.getImage();
            private Image Resize = imagen.getScaledInstance(20,20,Image.SCALE_SMOOTH);
                private ImageIcon MonedaResize = new ImageIcon(Resize);
    private PanelExpendedor expri;
    JButton boton0;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    private DepositoMonedas depositito;
    private JPanel panelvuelto;
    //private JLabel vueltito;
    Border borde = BorderFactory.createLineBorder(new Color(255, 128, 0), 0);
    /* private JTextField cuadroDeTexto; */
    private int count = 0;

    /**
     * Constructor de la clase, que agrega a cada uno de los botones un Action Listener
     */
    public PanelComprador() {
        //vueltito = new JLabel();
        /*for(int j=0; j<depositito.getMonederoDeAyuda2().size();j++){
        }*/
        panelvuelto = new JPanel();
        panelvuelto.setLayout(new FlowLayout());
        panelvuelto.setBounds(430,10,200,100);
        panelvuelto.setBackground(new Color(0,0,0));
        this.add(panelvuelto);
        depositito = new DepositoMonedas();

        this.add(depositito);

        expri = new PanelExpendedor();

        this.setBackground(new Color(50, 24, 134));

        setBorder(borde);

        this.setLayout(null);

        this.setBounds(600, 0, 635, 700);

        boton0 = new JButton("Coca(1500)");
            boton0.setBounds(50, 5, 150, 50);

        boton1 = new JButton("Fanta(1500)");
            boton1.setBounds(50, 55, 150, 50);

        boton2 = new JButton("Sprite(1500)");
            boton2.setBounds(50, 105, 150, 50);

        boton3 = new JButton("Super8(700)");
            boton3.setBounds(50, 155, 150, 50);

        boton4 = new JButton("Snickers(700)");
            boton4.setBounds(50, 205, 150, 50);
        this.add(boton0);
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.setVisible(true);
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("funciona1");
                try {
                    if(depositito.compararprecio(1500)==true) {
                        panelvuelto.removeAll();
                        expri.sacarcoca();
                        for(int g=0; g<depositito.getMonederoDeAyuda2().size();g++){
                            JLabel monediti = new JLabel(MonedaResize);
                            monediti.setVisible(true);
                            panelvuelto.add(monediti);
                        }
                        //System.out.print(depositito.getMonederoDeAyuda2().size());
                    }
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(depositito.compararprecio(1500)==true) {
                        panelvuelto.removeAll();
                        expri.sacarfanta();
                        for(int g=0; g<depositito.getMonederoDeAyuda2().size();g++){
                            JLabel monediti = new JLabel(MonedaResize);
                            monediti.setVisible(true);
                            panelvuelto.add(monediti);
                        }
                    }
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(depositito.compararprecio(1500)==true) {
                        panelvuelto.removeAll();
                        expri.sacarsprite();
                        for(int g=0; g<depositito.getMonederoDeAyuda2().size();g++){
                            JLabel monediti = new JLabel(MonedaResize);
                            monediti.setVisible(true);
                            panelvuelto.add(monediti);
                        }
                    }
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(depositito.compararprecio(800)==true) {
                        panelvuelto.removeAll();
                        expri.sacarsuper8();
                        for(int g=0; g<depositito.getMonederoDeAyuda2().size();g++){
                            JLabel monediti = new JLabel(MonedaResize);
                            monediti.setVisible(true);
                            panelvuelto.add(monediti);
                        }
                    }
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(depositito.compararprecio(800)==true) {
                        panelvuelto.removeAll();
                        expri.sacarsnickers();
                        for(int g=0; g<depositito.getMonederoDeAyuda2().size();g++){
                            JLabel monediti = new JLabel(MonedaResize);
                            monediti.setVisible(true);
                            panelvuelto.add(monediti);
                        }
                    }
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        /*cuadroDeTexto = new JTextField();
        cuadroDeTexto.setBounds(10, 50, 200, 30);
        cuadroDeTexto.setVisible(false);
        this.add(cuadroDeTexto);*/
    }

    /**
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }
}

