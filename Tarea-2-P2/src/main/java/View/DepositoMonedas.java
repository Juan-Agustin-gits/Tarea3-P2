package View;

import codigo.*;

import javax.management.timer.Timer;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.TimerTask;

/**
 * Deposito de monedas es un panel que alamacena y genera los distintos tipos de monedas
 */
// hay que pasarlo a un JPanel para poder organizar las monedas como un JLabel
public class DepositoMonedas extends JPanel {

    /**
     * @param foto
     * @return newFoto, la cual es una varible de tipo ImageIco, que fue modificada a un tamaño de 50px x 50px
     */
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
        private ArrayList<Integer> numSerie100 = new ArrayList<>();
    private JPanel panelMonedas500;
        private ArrayList<Integer> numSerie500 = new ArrayList<>();
    private JPanel panelMonedas1000;
        private ArrayList<Integer> numSerie1000 = new ArrayList<>();
    private JPanel panelMonedas1500;
        private ArrayList<Integer> numSerie1500 = new ArrayList<>();
    private Deposito<Monedas>  Monedero= new Deposito<>();
    private Deposito<Monedas>  MonederoDeAyuda= new Deposito<>();
    private Deposito<Monedas>  MonederoDeAyuda2= new Deposito<>();
    //este puede ser el monedero de vuelto

    /**
     * Constructor de Deposito de Monedas, ene cual se crea un panel para cada tipo de moneda
     * y un panel patra cada boton que agrega monedas el deposito y un ArrayList llamado monedero
     * el cual nos ayuda a administrar las monedas
     */
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
                    /**
                     * @param e the event to be processed
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count1++;
                        agregar100(count1,"Tarea-2-P2/src/main/java/View/Imagenes/Moneda100SinFondo.png");
                        //agregar100(count1,"C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Moneda100SinFondo.png");
                    }
                });
            panelBotones.add(add500);
                add500.addActionListener(new ActionListener() {
                    /**
                     * @param e the event to be processed
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count2++;
                        agregar500(count2,"Tarea-2-P2/src/main/java/View/Imagenes/Moneda500SinFondo.png");
                        //agregar500(count2,"C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Moneda500SinFondo.png");
                    }
                });
            panelBotones.add(add1000);
                add1000.addActionListener(new ActionListener() {
                    /**
                     * @param e the event to be processed
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count3++;
                        agregar1000(count3,"Tarea-2-P2/src/main/java/View/Imagenes/Moneda1000SinFondo.png");
                        //agregar1000(count3,"C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Moneda1000SinFondo.png");
                    }
                });
            panelBotones.add(add1500);
                add1500.addActionListener(new ActionListener() {
                    /**
                     * @param e the event to be processed
                     */
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count4++;
                        agregar1500(count4,"Tarea-2-P2/src/main/java/View/Imagenes/Moneda1500SinFondo.png");
                        //agregar1500(count4,"C:\\Users\\drago\\OneDrive\\Escritorio\\Tarea3-P2\\Tarea-2-P2\\src\\main\\java\\View\\Imagenes\\Moneda1500SinFondo.png");
                    }
                });
            //panelMonedas.setIcon(Moneda100);
    }

    /**
     * @param count  numero de monedas a agregar
     * @param ruta   Imagen de la moneda
     */
    public void agregar100(int count,String ruta){
        panelMonedas100.removeAll();
        codigo.Moneda100 moneda100 = new Moneda100();
        numSerie100.add(moneda100.getnSerie());
        Monedero.addProducto(moneda100);
        for (int i = 0; i < count; i++) {
            ImageIcon imagen = new ImageIcon(ruta);
            JLabel labelImagen = new JLabel(imagen);
            panelMonedas100.add(labelImagen);
            int serie = numSerie100.get(i);
                labelImagen.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        imprimirNserie(labelImagen,serie,true);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        super.mouseExited(e);
                        imprimirNserie(labelImagen,serie,false);
                    }
                });
        }
        revalidate();
    }

    /**
     * @param count numero de monedas a agregar
     * @param ruta  Imagen de la moneda
     */
    public void agregar500(int count,String ruta){
        panelMonedas500.removeAll();
        codigo.Moneda500 moneda500 = new Moneda500();
        numSerie500.add(moneda500.getnSerie());
        Monedero.addProducto(moneda500);
        for (int i = 0; i < count; i++) {
            ImageIcon imagen = new ImageIcon(ruta);
            JLabel labelImagen = new JLabel(imagen);
            panelMonedas500.add(labelImagen);
            int serie = numSerie500.get(i);
                labelImagen.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        imprimirNserie(labelImagen,serie,true);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        super.mouseExited(e);
                        imprimirNserie(labelImagen,serie,false);
                    }
                });
        }
        revalidate();
    }

    /**
     * @param count numero de monedas a agregar
     * @param ruta  Imagen de la moneda
     */
    public void agregar1000(int count,String ruta){
        panelMonedas1000.removeAll();
        codigo.Moneda1000 moneda1000 = new Moneda1000();
        numSerie1000.add(moneda1000.getnSerie());
        Monedero.addProducto(moneda1000);
        for (int i = 0; i < count; i++) {
            ImageIcon imagen = new ImageIcon(ruta);
            JLabel labelImagen = new JLabel(imagen);
            panelMonedas1000.add(labelImagen);
            int serie = numSerie1000.get(i);
                labelImagen.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        imprimirNserie(labelImagen,serie,true);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        super.mouseExited(e);
                        imprimirNserie(labelImagen,serie,false);
                    }
                });
        }
        revalidate();
    }

    /**
     * @param count numero de monedas a agregar
     * @param ruta  Imagen de la moneda
     */
    public void agregar1500(int count,String ruta){
        panelMonedas1500.removeAll();
        codigo.Moneda1500 moneda1500 = new Moneda1500();
        numSerie1500.add(moneda1500.getnSerie());
        Monedero.addProducto(moneda1500);
        for (int i = 0; i < count; i++) {
            ImageIcon imagen = new ImageIcon(ruta);
            JLabel labelImagen = new JLabel(imagen);
            panelMonedas1500.add(labelImagen);
            int serie = numSerie1500.get(i);
            labelImagen.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    imprimirNserie(labelImagen,serie,true);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    imprimirNserie(labelImagen,serie,false);
                }
            });
        }
        revalidate();
    }

    /**
     * @param label de la imagen que representa a la moneda, y al cual se le esta agregando un Mouse Listener.
     * @param numeroDeSerie numero de serie unico para cada moneda y el cual se imprime en el JLabel.
     * @param bandera que toma el valor de "true" si el cursor esta encima del JLabel, entro caso su valor es "false"
     */
    public void imprimirNserie(JLabel label,int numeroDeSerie,boolean bandera){
        if(bandera){
            String num = String.valueOf(numeroDeSerie);
            label.setText(num);
        }else {
            label.setText("");
        }
    }


    //con el siguiente metodo, se seleccionan las monedas en monedero y se comparan con los precios,
    //se toma desde la última moneda metida al monedero hasta el primero
    private int total=0;

    /**
     * @param n
     * @return true si es posible comprar el producto seleccionado, con las monedas que tienes en deposito de monedas
     * @throws NoHayProductoException
     */
    public boolean compararprecio(int n) throws NoHayProductoException {
        //MonederoDeAyuda2 = Monedero.copy();
        if(Monedero.size()==0){
            noalcanza();
            return false;
        }
        //este if no se toca
        while(total<n){
            total = total + Monedero.getalgo(Monedero.size() - 1).getValor();
            MonederoDeAyuda.addProducto(Monedero.getProducto());
            //System.out.print(MonederoDeAyuda.getProducto());
                    if (Monedero.size() == 0 && total < n) {
                        noalcanza();
                        Monedero.vaciar();
                        MonederoDeAyuda.vaciar();
                        total=0;
                        return false;
                        /*si se pone menos del precio necesario el array de monedero se va a 0
                        pero se quedan guardadas en un historial las monedas ocupadas
                         */
                    }
                    else if (total >= n) {
                        if(total>n){
                            for(int j=0; j<total-n;j=j+100){
                                MonederoDeAyuda2.addProducto(new Moneda100());
                            }
                        }
                        total=0;
                        //aqui debo poner el array MONEDERODEAYUDA que se va a graficar en expendedor
                        return true ;
                    }
            }
        return false;
}

    /**
     * @return Deposito de tipo monedas que sirve para administrarlas
     */
    public Deposito<Monedas> getMonederoDeAyuda2() {
        return MonederoDeAyuda2;
    }

    /**
     * Metodo que genera una ventana con el texto " No tienes suficiente dinero "
     */
    public void noalcanza(){
        JFrame frami = new JFrame("No puedes comprar");
        frami.setSize(300, 200);
        JPanel panel = new JPanel();
        JTextField textField = new JTextField("No tienes el dinero suficiente");
        textField.setEditable(false);
        panel.add(textField);
        frami.add(panel);
        frami.setVisible(true);
    }

    /**
     * @param g the <code>Graphics</code> context in which to paint
     */
    public void paint( Graphics g ){
        super.paint(g);
    }

}
