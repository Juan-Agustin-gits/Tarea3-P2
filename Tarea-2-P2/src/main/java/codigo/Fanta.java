package codigo;
/**
 * Herencia de Bebida con sabor "fanta"
 */
public class Fanta extends Bebida{
    public Fanta(int n){
        super(n);
    }
    public int getPrecio(){
        return Eleccion.FANTA.getPrecio();
    }
    @Override
    public String getSabor() {
        return "fanta";
    }
}
