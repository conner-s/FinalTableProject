/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Person class to contain data.
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package Model;

public class Person {
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;

    //Empty Constructor
    public Person() {
        this.name = "Mr. No Name";
        this.height = new Height();
        this.weight = 420;
        this.hometown = "Defaultburg";
        this.highSchool = "Defaultburg High";
    }

    //Full Constructor
    public Person(String name, Height height, int weight, String hometown, String highSchool) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height.toString() +
                ", weight=" + weight +
                ", hometown='" + hometown + '\'' +
                ", highSchool='" + highSchool + '\'' +
                '}';
    }

    //Getters
    public String getName() {
        return name;
    }

    public Height getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getHometown() {
        return hometown;
    }

    public String getHighSchool() {
        return highSchool;
    }


    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }



}
