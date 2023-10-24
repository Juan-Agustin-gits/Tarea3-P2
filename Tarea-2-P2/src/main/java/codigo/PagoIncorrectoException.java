package codigo;

/**
 * Exception para cuando se elija una moneda nula
 */
public class PagoIncorrectoException extends Exception{
    /**
     * @param mensaje
     */
    public PagoIncorrectoException(String mensaje){
        super(mensaje);
    }
}
