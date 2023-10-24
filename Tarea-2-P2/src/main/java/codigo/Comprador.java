package codigo;

/**
 *Clase que instancia un expendedor, el cual devolvera un Producto con sabor
 * y precio particular
 */
public class Comprador {
    private Monedas moneda;
    //aca debo cambiar el nimIdent
    private int nimIdent;
    private Expendedor expendedor;
    private String saborcito;
    private int vuelto;

    /**
     *
     * @param moneda Herencia de la clase padre Moneda con valor específico
     * @param nimIdent Número para seleccionar el tipo de Producto a comprar
     * @param expendedor Nuevo Expendedor en el cual habrá Depositos de Productos
     * @throws NoHayProductoException Excepction para cuando no haya productos del tipo
     * seleccionado en su respectivo array
     * @throws PagoInsuficienteException Exception para cuando el valor de la moneda
     * seleccionada sea menor al del producto elegido
     * @throws PagoIncorrectoException Exception para cuando se elija una moneda nula
     */
    public Comprador(Monedas moneda,int nimIdent , Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.moneda = moneda;
        this.nimIdent=nimIdent;
        this.expendedor = expendedor;
        saborcito = expendedor.ultimacomida();
        if(expendedor.comprarProducto(nimIdent, moneda).getPrecio() < moneda.getValor()) {
        while(expendedor.getVuelto() != null){
            Monedas monedaVuelto = expendedor.getVuelto();
            vuelto += monedaVuelto.getValor();
        }
        }
    }

    public Monedas getMoneda() {
        return moneda;
    }
    
    public int getNimIdent() {
        return nimIdent;
    }
    public Expendedor getExpendedor() {
        return expendedor;
    }
    public int getVuelto(){
        return vuelto;
    }
    public String QueSabor(){
        return saborcito;
    }
}
