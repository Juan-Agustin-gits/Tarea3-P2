package codigo;

/**
 * Herencia de Dulces con sabor "snikers"
 * */
public class Snikers extends Dulces{
    public Snikers(int n) {
        super(n);
    }
    public int getPrecio(){
        return Eleccion.SNICKERS.getPrecio();
    }
    @Override
    public String getSabor() {
        return "snikers";
    }

}
