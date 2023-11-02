package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    Border BordeExpendeodr = BorderFactory.createLineBorder(new Color(0,0,0),3);
    public PanelExpendedor() {
        this.setBackground(new Color(131, 8, 8));
        setBorder(BordeExpendeodr);
        this.setBounds(0,0,600,510);
    }
}
