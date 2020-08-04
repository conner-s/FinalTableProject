/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Panel Class for Table GUI.
 IST 242 Assignment 05
 @author Conner Smith, fredfonseca
 @version 1.00 2020-07-14
 */
package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class NorthPanel extends JPanel {

    private ArrayList<JButton> headers;

    public NorthPanel() {
        super();
        headers = new ArrayList<>();
        GridLayout gr = new GridLayout(1,7);
        setLayout(gr);


    }

    public ArrayList<JButton> getHeaders() {
        return headers;
    }

    public void setB1(ArrayList<JButton> headers) {
        this.headers = headers;
    }
}
