
package codigo;

/**
 * Clase abstracta que define con lo que se va a comprar a futuro un Producto
 */
public abstract class Monedas implements Comparable<Monedas>{
    private int valor;
    public Monedas(int valor) {
        this.valor = valor;
    }
    public Monedas(){
    }
    public abstract int getValor();
    /**
     * @param otra ( de tipo Moneda ), Objeto a comparar .
     * @return retorna 1 si this.getValor() >  otra.getValor();
     *         retorna -1 si this.getValor() <  otra.getValor();
     *         retorna 0 si son iguales.
     */
    public int compareTo(Monedas otra){
        return Integer.compare(this.getValor(), otra.getValor());
        // retorna 1 si this.getValor() >  otra.getValor();
        // retorna -1 si this.getValor() <  otra.getValor();
        // retorna 0 si son iguales
    }
}
