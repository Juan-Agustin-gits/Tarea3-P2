import codigo.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Test de la clase Deposito
 */
public class DepositoTest {
    /**
     * Tests que verifica el funcionamiento del metodo addProducto
     */
    @Test
    public void testAddProductoBebida() {
        //para hacer esta prueba usamos una bebida generica
        Bebida generica = new Bebida(1234) {
            @Override
            public int getPrecio() {
                return 0;
            }

            @Override
            public String getSabor() {
                return "generica";
            }
        };
        Deposito<Bebida> bebidaDeposito = new Deposito<>();
        bebidaDeposito.addProducto(generica);
        int cantidad = bebidaDeposito.size();
        Assertions.assertEquals(1,cantidad);
    }
    @Test
    public void testGetProductoBebida() throws NoHayProductoException {
        //para hacer esta prueba usamos una bebida generica
        Bebida generica = new Bebida(1234) {
            @Override
            public int getPrecio() {
                return 0;
            }

            @Override
            public String getSabor() {
                return "generica";
            }
        };
        Deposito<Bebida> bebidaDeposito = new Deposito<>();
        int cantidad = bebidaDeposito.size();
        bebidaDeposito.getProducto();
        Assertions.assertEquals(0, cantidad);
    }
    public void testAddProductoDulces(){
        Dulces generico = new Dulces(4321) {
            @Override
            public int getPrecio() {
                return 0;
            }

            @Override
            public String getSabor() {
                return "generico";
            }
        };
        Deposito<Dulces> dulcesDeposito = new Deposito<>();
        dulcesDeposito.addProducto(generico);
        int cantidad = dulcesDeposito.size();
        Assertions.assertEquals(1,cantidad);
    }
    @Test
    public void testAddProductoMonedas(){
        Monedas generica = new Monedas(10000) {
            @Override
            public int getValor() {
                return 10000;
            }
        };
        int cantidadTest = 100;
        Deposito<Monedas> monedasDeposito = new Deposito<>();
        for (int i = 0; i != cantidadTest; i++) {
            monedasDeposito.addProducto(generica);
        }
            int cantidad = monedasDeposito.size();
            Assertions.assertEquals(cantidadTest, cantidad);
    }
}
