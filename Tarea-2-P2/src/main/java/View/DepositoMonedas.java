package View;

import codigo.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// hay que pasarlo a un JPanel para poder organizar las monedas como un JLabel
public class DepositoMonedas extends JPanel {
    public ImageIcon ReSize(ImageIcon foto){
        Image imagen = foto.getImage();
        int ancho = 50;
        int alto = 50;
        Image Resizedfoto = imagen.getScaledInstance(ancho,alto,Image.SCALE_SMOOTH);
        ImageIcon newFoto = new ImageIcon(Resizedfoto);
        return newFoto;
    }
     //   private ImageIcon Moneda100new = ReSize(Moneda100);
    private ImageIcon Moneda500 = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/Moneda500SinFondo.png");
        private ImageIcon Moneda500new = ReSize(Moneda500);
    private ImageIcon Moneda1000 = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/Moneda1000SinFondo.png");
        private ImageIcon Moneda1000new = ReSize(Moneda1000);
    private ImageIcon Moneda1500 = new ImageIcon("Tarea-2-P2/src/main/java/View/Imagenes/Moneda1500SinFondo.png");
        private ImageIcon Moneda1500new = ReSize(Moneda1500);
    private JButton add100 = new JButton("100");
    private JButton add500 = new JButton("500");
    private JButton add1000 = new JButton("1000");
    private JButton add1500 = new JButton("1500");
    private Border borde = BorderFactory.createLineBorder(new Color(245, 245, 2, 200),5);
    private JPanel panelBotones;
        private int count1 = 0;
        private int count2 = 0;
        private int count3 = 0;
        private int count4 = 0;

    private JPanel panelMonedas100;
    private JPanel panelMonedas500;
    private JPanel panelMonedas1000;
    private JPanel panelMonedas1500;
    private Deposito<Monedas> Monedero = new Deposito<>();
    // dejar esto en un panel distinto
    public DepositoMonedas(){

        this.add(panelMonedas100 = new JPanel());
            panelMonedas100.setBackground(new Color(0,0,0));
            panelMonedas100.setLayout(new FlowLayout());

        this.add(panelMonedas500 = new JPanel());
            panelMonedas500.setBackground(new Color(0,0,0));
            panelMonedas500.setLayout(new FlowLayout());

        this.add(panelMonedas1000 = new JPanel());
            panelMonedas1000.setBackground(new Color(0,0,0));
            panelMonedas1000.setLayout(new FlowLayout());

        this.add(panelMonedas1500 = new JPanel());
            panelMonedas1500.setBackground(new Color(0,0,0));
            panelMonedas1500.setLayout(new FlowLayout());
        this.add(panelBotones = new JPanel());
            panelBotones.setLayout(new GridLayout(2,2));
        this.setLayout(new GridLayout(1,5));
        this.setBackground(new Color(1,1,1, 234));
        this.setVisible(true);
        this.setBounds(0,310,635,350);
        this.setBorder(borde);
            panelBotones.add(add100);
                add100.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count1++;
                        agregar100(count1,"C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Moneda100SinFondo.png");
                    }
                });
            panelBotones.add(add500);
                add500.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count2++;
                        agregar500(count2,"C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Moneda500SinFondo.png");
                    }
                });
            panelBotones.add(add1000);
                add1000.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count3++;
                        agregar1000(count3,"C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Moneda1000SinFondo.png");
                    }
                });
            panelBotones.add(add1500);
                add1500.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count4++;
                        agregar1500(count4,"C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Moneda1500SinFondo.png");
                    }
                });
            //panelMonedas.setIcon(Moneda100);
    }
    public void agregar100(int count,String ruta){
        panelMonedas100.removeAll();
        codigo.Moneda100 moneda100 = new Moneda100();
        Monedero.addProducto(moneda100);
        for (int i = 0; i < count; i++) {
            ImageIcon imagen = new ImageIcon(ruta);
            JLabel labelImagen = new JLabel(imagen);
            panelMonedas100.add(labelImagen);
        }
        revalidate();
    }
    public void agregar500(int count,String ruta){
        panelMonedas500.removeAll();
        codigo.Moneda500 moneda500 = new Moneda500();
        Monedero.addProducto(moneda500);
        for (int i = 0; i < count; i++) {
            ImageIcon imagen = new ImageIcon(ruta);
            JLabel labelImagen = new JLabel(imagen);
            panelMonedas500.add(labelImagen);
        }
        revalidate();
    }
    public void agregar1000(int count,String ruta){
        panelMonedas1000.removeAll();
        codigo.Moneda1000 moneda1000 = new Moneda1000();
        Monedero.addProducto(moneda1000);
        for (int i = 0; i < count; i++) {
            ImageIcon imagen = new ImageIcon(ruta);
            JLabel labelImagen = new JLabel(imagen);
            panelMonedas1000.add(labelImagen);
        }
        revalidate();
    }
    public void agregar1500(int count,String ruta){
        panelMonedas1500.removeAll();
        codigo.Moneda1500 moneda1500 = new Moneda1500();
        Monedero.addProducto(moneda1500);
        for (int i = 0; i < count; i++) {
            ImageIcon imagen = new ImageIcon(ruta);
            JLabel labelImagen = new JLabel(imagen);
            panelMonedas1500.add(labelImagen);
        }
        revalidate();
    }
    public boolean compararprecio(int n) throws NoHayProductoException {
        int total = 0;
        while(total<n){
            total = total + Monedero.getalgo(Monedero.size()-1).getValor();
            Monedero.getProducto();
            if(Monedero.size()==0 && total<n){
                throw new NoHayProductoException("no hay monedas de valor suficiente");
            }
            else if (total>=n){
                return true;
            }
        }
        return false;
    }
    public void paint( Graphics g ){
        super.paint(g);
    }
}
