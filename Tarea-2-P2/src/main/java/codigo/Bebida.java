package codigo;
/**
 * Hija de Productos que sirve para diferenciar de Dulces
 */
public abstract class Bebida extends Productos{
    public Bebida(int n) {
        super(n);
    }

    public abstract int getPrecio();

    public abstract String getSabor();
}
