package codigo;

/**

 * Hija de Productos que sirve para diferenciar de Bebida
 */
abstract public class Dulces extends Productos{
    public Dulces(int n) {
        super(n);
    }
    public abstract int getPrecio();
    public abstract String getSabor();
}
