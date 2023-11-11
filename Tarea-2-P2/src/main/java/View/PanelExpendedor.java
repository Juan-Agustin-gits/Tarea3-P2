package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private int NewSize= 80;
    private FlowLayout layout = new FlowLayout(FlowLayout.LEFT,30,10);
    public PanelExpendedor() {

    }
    public void paint( Graphics g ){
        super.paint(g);
        g.create(50,50,200,200);
    }
}
