package View;

import javax.swing.*;
        import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal;

    public Ventana() {
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Mi Ventana");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1250, 700);

        // Usar la instancia de PanelPrincipal que creaste
        panelPrincipal = new PanelPrincipal();
        this.add(panelPrincipal, BorderLayout.CENTER);
        this.add(new DepositoMonedas());
        this.setVisible(true);
    }
}





