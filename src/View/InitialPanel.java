/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Container Panel for Table GUI.
 IST 242 Assignment 05
 @author Conner Smith, fredfonseca
 @version 1.00 2020-07-14
 */
package View;

import javax.swing.*;
import java.awt.*;

public class InitialPanel extends JPanel {

    private NorthPanel np;
    private CenterPanel cp;

    public InitialPanel() {
        super();
        np = new NorthPanel();
        cp = new CenterPanel();
        this.setLayout(new BorderLayout(20, 20));
        this.setBackground(Color.DARK_GRAY);

        add(np, BorderLayout.NORTH);
        add(cp, BorderLayout.CENTER);
    }

    public NorthPanel getNp() {
        return np;
    }

    public void setNp(NorthPanel np) {
        this.np = np;
    }

    public CenterPanel getCp() {
        return cp;
    }

    public void setCp(CenterPanel cp) {
        this.cp = cp;
    }

}
