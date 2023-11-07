package codigo;

/**
 * Clase que instancia multiples Depositos de diferentes Productos
 */
public class Expendedor {
    private int n;
    private int cantidadProductos;
    private Monedas pago;
    private Moneda100 moneda100;
    private String sabor;
    private int vuelto = 0;
    private Deposito<CocaCola> coca = new Deposito<>();
    private Deposito<Sprite> sprite = new Deposito<>();
    private Deposito<Fanta> fanta = new Deposito<>();
    private Deposito<Super8> super8 = new Deposito<>();
    private Deposito<Snikers> sniker = new Deposito<>();
    private Deposito<Monedas> monvu = new Deposito<>();

    /**
     *
     * @param cantidadProductos define el tamaño de cada Deposito instanciado
     */
    public Expendedor(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
        for (int n=0; n<cantidadProductos; n++){
            coca.addProducto(new CocaCola(n));
            sprite.addProducto(new Sprite(n));
            fanta.addProducto(new Fanta(n));
            super8.addProducto(new Super8(n));
            sniker.addProducto(new Snikers(n));
        }
    }

    /**
     *
     * @param n numero del cual dependera el producto a ser "comprado"
     * @param pago moneda con valor especifico que se comparará con el valor
     * del producto a seleccionar
     * @throws PagoIncorrectoException Exception para cuando se elija una moneda nula
     * @throws NoHayProductoException Excepction para cuando no haya productos del tipo
     * seleccionado en su respectivo array
     * @throws PagoInsuficienteException Exception para cuando el valor de la moneda
     * seleccionada sea menor al del producto elegido
     * @return Devuelve el Producto y el vuelto o la misma moneda si es que no es mayor
     * o igual al precio del Producto o si es que no quedan Productos en el deposito
     */
    public Productos comprarProducto(int n, Monedas pago) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        this.n=n;
        if (pago == null) {
            throw new PagoIncorrectoException("Por favor ingresa una moneda valida");
        }
        if (n == Eleccion.COCA.getSelec()){
            if(coca.size() !=0 && pago.getValor() >= coca.getProducto().getPrecio()){

                for(int i=pago.getValor()-coca.getProducto().getPrecio(); i>0; i=i-100 ){
                    monvu.addProducto(moneda100);
                    vuelto=vuelto+100;
                }
                sabor=coca.getProducto().getSabor();
                return coca.getProducto();
            }
            else if (coca.size() == 0) {
                monvu.addProducto(pago);
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            }
            else if (pago.getValor() < coca.getProducto().getPrecio()) {
                monvu.addProducto(pago);
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }
        }
        if (n == Eleccion.SPRITE.getSelec()){
            if( sprite.size() !=0 && pago.getValor() >= sprite.getProducto().getPrecio() ){

                for(int i= pago.getValor()-sprite.getProducto().getPrecio(); i>0; i=i-100 ){
                    monvu.addProducto(moneda100);
                    vuelto=vuelto+100;
                }
                sabor=sprite.getProducto().getSabor();
                return sprite.getProducto();
            }
            else if (sprite.size() == 0) {
                monvu.addProducto(pago);
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            }
            else if (pago.getValor() < sprite.getProducto().getPrecio()) {
                monvu.addProducto(pago);
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }
        }
        if (n == Eleccion.FANTA.getSelec()){
            if (fanta.size() !=0 && pago.getValor() >= fanta.getProducto().getPrecio()) {
                for(int i= pago.getValor()-fanta.getProducto().getPrecio(); i>0; i=i-100 ){
                    monvu.addProducto(moneda100);
                    vuelto=vuelto+100;
                }
                sabor=fanta.getProducto().getSabor();
                return fanta.getProducto();
            }
            else if (fanta.size() == 0) {
                monvu.addProducto(pago);
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            }
            else if (pago.getValor() < fanta.getProducto().getPrecio()) {
                monvu.addProducto(pago);
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }

        }
        if (n == Eleccion.SUPER.getSelec()){
            if( super8.size() !=0 && pago.getValor() >= super8.getProducto().getPrecio() ){


                for( int i= pago.getValor()-super8.getProducto().getPrecio(); i>0; i=i-100 ){
                    monvu.addProducto(moneda100);
                    vuelto=vuelto+100;
                }
                sabor=super8.getProducto().getSabor();
                return super8.getProducto();
            }
            else if ( super8.size() == 0 ) {
                monvu.addProducto(pago);
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            }
            else if (pago.getValor() < super8.getProducto().getPrecio()) {
                monvu.addProducto(pago);
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }

        }
        if (n == Eleccion.SNICKERS.getSelec()){
            if( sniker.size() != 0 && pago.getValor() >= sniker.getProducto().getPrecio() ){

                for(int i = pago.getValor()-sniker.getProducto().getPrecio(); i>0; i=i-100 ){
                    monvu.addProducto(moneda100);
                    vuelto=vuelto+100;
                }
                sabor=sniker.getProducto().getSabor();
                return sniker.getProducto();
            }
            else if (sniker.size() == 0) {
                monvu.addProducto(pago);
                throw new NoHayProductoException("No se puede comprar, no quedan productos");
            }
            else if (pago.getValor() < sniker.getProducto().getPrecio()) {
                monvu.addProducto(pago);
                throw new PagoInsuficienteException("La moneda NO alcanza");
            }
        }
        else if(n!=1&&n!=2&&n!=3&&n!=4&&n!=5){
                monvu.addProducto(pago);
                throw new NoHayProductoException("Elección inexistente");
            }
        return null;
    }
    public Monedas getVuelto() throws NoHayProductoException {
        return monvu.getProducto();
    }

    public String ultimacomida(){
        return sabor;
    }

    public int getVueltoTotal(){
        return vuelto;
    }
    public Deposito<Monedas> getMonvu(){
        return monvu;
    }

    public Deposito<CocaCola> getCoca() {
        return coca;
    }

    public Deposito<Sprite> getSprite() {
        return sprite;
    }

    public Deposito<Fanta> getFanta() {
        return fanta;
    }

    public Deposito<Super8> getSuper8() {
        return super8;
    }

    public Deposito<Snikers> getSniker() {
        return sniker;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }
}

