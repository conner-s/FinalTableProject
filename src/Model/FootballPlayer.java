/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Football player that contains additional data on top of extending Person.
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package Model;

import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember {
    private int number;
    private String position;


    //Empty Constructor
    public FootballPlayer() {
        super();
        this.number = 42;
        this.position = "Generic Position";
    }

    //Full Constructor
    public FootballPlayer(String name, Height height, int weight, String hometown, String highSchool, int number, String position) {
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " FootballPlayer{" +
                "number=" + number +
                ", position='" + position + '\'' +
                '}';
    }

    //Getters
    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    //Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    //Interface Implementation
    @Override
    public String getAttribute(int n) {
        String rString = "";
        switch(n){
            case 0:
                rString = "" + this.getNumber();
                break;
            case 1:
                rString = this.position;
                break;
            case 2:
                rString = this.getName();
                break;
            case 3:
                rString = this.getHeight().toString();
                break;
            case 4:
                rString = "" + this.getWeight();
                break;
            case 5:
                rString = this.getHometown();
                break;
            case 6:
                rString = this.getHighSchool();
                break;

        }
        return rString;
    }

    @Override
    public ArrayList<String> getAttributes() {
        ArrayList<String> rArrayList = new ArrayList<>();
        for(int i = 0; i < 7; i++){
            rArrayList.add(getAttribute(i));
        }
        return rArrayList;
    }

    @Override
    public String getAttributeName(int n) {
        String rString = "";
        switch(n){
            case 0:
                rString = "number";
                break;
            case 1:
                rString = "position";
                break;
            case 2:
                rString = "name";
                break;
            case 3:
                rString = "height";
                break;
            case 4:
                rString = "weight";
                break;
            case 5:
                rString = "hometown";
                break;
            case 6:
                rString = "highSchool";
                break;
        }
        return rString;
    }

    @Override
    public ArrayList<String> getAttributeNames() {
        ArrayList<String> rArrayList = new ArrayList<String>();
        for(int i = 0; i < 7; i++){
            rArrayList.add(getAttributeName(i));
        }
        return rArrayList;
    }
}

