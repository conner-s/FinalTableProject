/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Container Frame for Table GUI.
 IST 242 Assignment 05
 @author Conner Smith, fredfonseca
 @version 1.00 2020-07-14
 */
package View;

import javax.swing.*;
import java.awt.*;

public class InitialFrame extends JFrame {

    private InitialPanel ip;

    public InitialFrame() {
        super("242 L04");
        LayoutSetupMAC();

        ip = new InitialPanel();
        add(ip);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.yellow);
        this.setSize(1000, 700);
        this.setVisible(true);
    }

    public InitialPanel getIp() {
        return ip;
    }

    public void setIp(InitialPanel ip) {
        this.ip = ip;
    }

    void LayoutSetupMAC() {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }
}
