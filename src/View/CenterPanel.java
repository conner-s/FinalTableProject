/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 DefaultPackage.Main Panel for Table GUI.
 IST 242 Assignment 05
 @author Conner Smith, fredfonseca
 @version 1.00 2020-07-14
 */
package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CenterPanel extends JPanel {

    private ArrayList<ArrayList<JButton>> jbs;
    private int lines;

    public CenterPanel() {
        super();
        jbs = new ArrayList<>();
        lines = 10;
        GridLayout gr = new GridLayout(lines, 7);
        setLayout(gr);
        this.setBackground(Color.DARK_GRAY);




    }

    public void displayBts(String s, int row, int col) {
       jbs.get(row).get(col).setText(s);
    }

//Getters
    public ArrayList<ArrayList<JButton>> getCpJbs() {
        return jbs;
    }


    public int getCpLines() {
        return lines;
    }
}
