// Se debe entregar con un método main que incluya código con las pruebas que demuestren el
//funcionamiento: creas un Expendedor, Monedas, y Comprador e interrogas al comprador con cada producto,
//como pruebas las excepciones deben ser levantada y capturada también (en este caso se muestra un
//mensaje)

import codigo.*;

public class main {
    public static void main(String[] args){
        //Falta hacer las pruebas aqui y hacer los test correspondientes
        Expendedor expendedor = new Expendedor(10);
        Moneda1500 moneda1500 = new Moneda1500();
        try {
            Comprador comprador = new Comprador(moneda1500,3,expendedor);
        } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
