/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Height Class for Person Attribute.
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package Model;

public class Height {
    private int feet;
    private int inches;


    //Empty Constructor
    public Height() {
        this.feet = 6;
        this.inches = 0;
    }

    public Height(int feet) {
        this.feet = feet;
        this.inches = 0;
    }

    //Full Constructor
    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }


    @Override
    public String toString() {
        return this.feet + "\'" + this.inches + "\"";
    }

    //Getters
    public int getFeet() {
        return feet;
    }
    public int getInches() {
        return inches;
    }

    //Setters
    public void setFeet(int feet) {
        this.feet = feet;
    }
    public void setInches(int inches) {
        this.inches = inches;
    }
}
