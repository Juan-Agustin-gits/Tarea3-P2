
package codigo;

import java.util.Random;

/**
 * Clase abstracta que define con lo que se va a comprar a futuro un Producto
 */
public abstract class Monedas implements Comparable<Monedas>{
    private int valor;
    private Random random= new Random();
    private int nSerie = random.nextInt(9000) + 1000;
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

    public int getnSerie() {
        return nSerie;
    }
}
