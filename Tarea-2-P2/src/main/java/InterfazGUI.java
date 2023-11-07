import View.Ventana;

public class InterfazGUI {
    public static void main(String[] args){
        Ventana ventana = new Ventana();
        int prueba1 = ventana.getPanelPrincipal().getPanelExpendedor().getExpendedor().getCoca().size();
        int prueba2 = ventana.getPanelPrincipal().getPanelExpendedor().getExpendedor().getFanta().size();
        int prueba3 = ventana.getPanelPrincipal().getPanelExpendedor().getExpendedor().getSprite().size();
        int prueba4 = ventana.getPanelPrincipal().getPanelExpendedor().getExpendedor().getSuper8().size();
        int prueba5 = ventana.getPanelPrincipal().getPanelExpendedor().getExpendedor().getSniker().size();
        System.out.println(prueba1);
        System.out.println(prueba2);
        System.out.println(prueba3);
        System.out.println(prueba4);
        System.out.println(prueba5);
    }
}
