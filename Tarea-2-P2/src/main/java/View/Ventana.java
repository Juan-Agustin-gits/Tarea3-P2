package View;
import codigo.Comprador;
import javax.swing.*;
import java.awt.*;

/**
 * Ventana que contiene a Panel Principal
 */
public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal;
    private DepositoMonedas depositoMonedas;
    private Comprador comprador;
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Mi Ventana");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1250, 700);

        // Usar la instancia de PanelPrincipal que creaste
        panelPrincipal = new PanelPrincipal();
        this.add(panelPrincipal, BorderLayout.CENTER);
        this.setVisible(true);
    }
    public PanelPrincipal getPanelPrincipal() {
        return panelPrincipal;
    }
}





