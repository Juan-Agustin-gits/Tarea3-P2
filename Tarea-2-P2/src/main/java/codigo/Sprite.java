package codigo;

/**
 * Herencia de Bebida con sabor "sprite"
 */
public class Sprite extends Bebida{
    public Sprite(int n) {
        super(n);
    }
    public int getPrecio(){
        return Eleccion.SPRITE.getPrecio();
    }
    @Override
    public String getSabor() {
        return "sprite";
    }


}
