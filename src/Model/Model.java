/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Model Class.
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package Model;

public class Model {

    private FootballPlayerData fpData;
    public Model(){
        fpData = new FootballPlayerData();
    }
    public FootballPlayerData getFpData(){
        return fpData;
    }
    public void setFpData(FootballPlayerData fpd){
        this.fpData = fpd;
    }
}
