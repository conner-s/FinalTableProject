/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 View class to start UI setup.
 IST 242 Assignment 05
 @author Conner Smith, fredfonseca
 @version 1.00 2020-07-14
 */
package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class View {
    
    private InitialFrame infr;
    
    public InitialFrame getInfr() {
        return infr;
    }
    
    public void DisplayNorthButton(String s, int buttonNumber) {
        infr.getIp().getNp().getHeaders().get(buttonNumber).setText(s);
    }
    
    public void DisplayCenterButton(String s, int row, int col) {
        infr.getIp().getCp().displayBts(s, row, col);
    }
    
    public void setInfr(InitialFrame infr) {
        this.infr = infr;
    }
    
    public View() {
        infr = new InitialFrame();
    }
    
    public void display(String text) {
        System.out.println(text);
    }


    public void TableInitialSetup(int linesBeingDisplayed, int numbersOfHeaders) {
        //Fills in buttons for Table data
        for (int i = 0; i < linesBeingDisplayed; i++) {
            ArrayList<JButton> jbRow = new ArrayList<>();
            for (int n = 0; n < numbersOfHeaders; n++) {
                JButton b1 = new JButton(" " + n);
                b1.setFont(new Font("Courier", Font.PLAIN, 14));
                b1.setBackground(Color.gray);
                b1.setForeground(Color.white);
                jbRow.add(b1);//add the button to the row of buttons
                infr.getIp().getCp().add(b1); //add the button to the screen
            }
            infr.getIp().getCp().getCpJbs().add(jbRow); // Add that row to the 2D array
        }
        infr.getIp().getCp().repaint();
        infr.getIp().getCp().updateUI();

        //Fills in buttons for Table headers
        for (int i = 0; i < numbersOfHeaders; i++) {
            JButton b1 = new JButton(" " + i);
            b1.setFont(new Font("Courier", Font.PLAIN, 14));
            b1.setBackground(Color.blue);
            b1.setForeground(Color.white);
            //Assigning name to button for sorting
            b1.setName(""+i);
            infr.getIp().getNp().getHeaders().add(b1);
            infr.getIp().getNp().add(b1);
        }
        //Repaint and update so header cells are the intended size
        infr.getIp().getNp().repaint();
        infr.getIp().getNp().updateUI();
    }


    public void CenterUpdate(ArrayList<ArrayList<String>> lineData, ArrayList<String> headerData) {
        for (int head = 0; head < headerData.size(); head++) {
            infr.getIp().getNp().getHeaders().get(head).setText(headerData.get(head));
        }
        for (int row = 0; row < lineData.size(); row++) {
            for (int col = 0; col < lineData.get(row).size(); col++) {
                infr.getIp().getCp().getCpJbs().get(row).get(col).setText(lineData.get(row).get(col));
            }
        }
    }
}
