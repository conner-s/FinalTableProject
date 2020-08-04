/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Controller Class.
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package Controller;

import Model.Model;
import View.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Controller {
    private View view;
    private Model model;

    //Empty Constructor
    public Controller() {
        this.view = null;
        this.model = null;
    }

    //Full Constructor
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

        view.TableInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size());
        view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),
                model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
        this.addListeners();
    }

    private void addListeners() {
        //Scrolling listener
        view.getInfr().getIp().getCp().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                //outOfBounds Check
                if (model.getFpData().getFirstLineToDisplay() + units >= 0 &&
                        model.getFpData().getLastLineToDisplay() + units <= model.getFpData().getTable().size() + 1) {

                    model.getFpData().setFirstLineToDisplay(model.getFpData().getFirstLineToDisplay() + units);
                    model.getFpData().setLastLineToDisplay(model.getFpData().getLastLineToDisplay() + units);
                } else {
                    //Scrolled too high
                    if (model.getFpData().getFirstLineToDisplay() + units < 0) {
                        model.getFpData().setFirstLineToDisplay(0);
                    }
                    //Scrolled too low
                    else if (model.getFpData().getLastLineToDisplay() + units > model.getFpData().getTable().size() - 1) {
                        model.getFpData().setLastLineToDisplay(model.getFpData().getTable().size());
                    }
                }
                //Update the screen after scrolling
                view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),
                        model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
            }
        });


        //Header Button Listeners with JButton imported
        for(JButton button : view.getInfr().getIp().getNp().getHeaders()) {
            button.addMouseListener(new MouseListener() {

                public void mouseClicked(MouseEvent e) {
                    for(JButton reset : view.getInfr().getIp().getNp().getHeaders()) {
                        if(e.getSource() == reset) {
                            reset.setBackground(Color.red);
                            //Setting the sort field based on the name of the button clicked
                            model.getFpData().setSortField(Integer.parseInt(reset.getName()));
                            model.getFpData().sort();
                            view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),
                                    model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());


                        } else {
                            reset.setBackground(Color.blue);
                        }
                    }
                    view.getInfr().getIp().getNp().repaint();
                    view.getInfr().getIp().getNp().updateUI();
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                }
                @Override
                public void mouseExited(MouseEvent e) {
                }
            });
        }




    }


    //Getters
    public View getView() {
        return view;
    }
    public Model getModel() {
        return model;
    }


    //Setters
    public void setView(View view) {
        this.view = view;
    }
    public void setModel(Model model) {
        this.model = model;
    }
}
