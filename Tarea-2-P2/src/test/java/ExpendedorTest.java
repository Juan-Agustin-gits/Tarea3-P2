import codigo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExpendedorTest {
    Moneda1000 moneda1000Test = new Moneda1000();
    Moneda1500 moneda1500Test = new Moneda1500();
    Expendedor expendedorTest = new Expendedor(10);
    Comprador compradorTest;

    @Test
    public void getVueltoTotalTest() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        compradorTest = new Comprador(moneda1500Test,4,expendedorTest);
        expendedorTest.comprarProducto(4,moneda1500Test);
        int vuelto = expendedorTest.getVueltoTotal();
        Assertions.assertEquals(1000,vuelto);
    }
    @Test
    public void getVueltoBebidaNoDisponible() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        try {
            compradorTest = new Comprador(moneda1500Test,6,expendedorTest);
            expendedorTest.comprarProducto(6, moneda1500Test);
            int ayuda = expendedorTest.getVuelto().getValor();
            Assertions.assertEquals(ayuda, moneda1500Test.getValor());
        }
        catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e){
            Assertions.assertTrue(e instanceof NoHayProductoException);
        }
    }
    @Test
    public void getVueltoBebidaCara() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        try {
            compradorTest = new Comprador(moneda1000Test, 3, expendedorTest);
            expendedorTest.comprarProducto(3, moneda1000Test);
            int ayuda = expendedorTest.getVuelto().getValor();
            Assertions.assertEquals(ayuda, moneda1000Test.getValor());
        }
        catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e){
            Assertions.assertTrue(e instanceof PagoInsuficienteException);
        }
    }
    @Test
    public void getArraySinBebidas() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        try{
            compradorTest = new Comprador(moneda1500Test,1, expendedorTest);
            for(int i=0; i<11; i++){
                expendedorTest.comprarProducto(1,moneda1500Test);
            }
            int ayuda = expendedorTest.getVuelto().getValor();
            Assertions.assertEquals(ayuda,moneda1500Test.getValor());
        }
        catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e){
            Assertions.assertTrue(e instanceof NoHayProductoException);
        }

    }
    @Test
    public void getNull() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        try{
            compradorTest = new Comprador(null,1, expendedorTest);
            expendedorTest.comprarProducto(1,null);
        }
        catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e){
            Assertions.assertTrue(e instanceof PagoIncorrectoException);
        }
    }
}
