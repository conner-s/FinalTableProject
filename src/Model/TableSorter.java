/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 TableSorter Class to house comparators.
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TableSorter {


    protected TableSorter() {
    }


    //Gets Comparator based on field number passed
    public Comparator<TableMember> getComparator(int sortField) {

        Comparator<TableMember> returnComp = null;

        switch (sortField) {
            case 0:
                returnComp = new Comparator<TableMember>() {
                    @Override
                    public int compare(TableMember o1, TableMember o2) {
                        if (Integer.parseInt(o1.getAttribute(0)) < Integer.parseInt(o2.getAttribute(0))){
                            return -1;
                        } else if (Integer.parseInt(o1.getAttribute(0)) == Integer.parseInt(o2.getAttribute(0))){
                            return 0;
                        } else {
                            return 1;
                        }
                    }
                };
                break;

            //Player Position
            case 1:
                returnComp = new Comparator<TableMember>() {
                    @Override
                    public int compare(TableMember o1, TableMember o2) {
                        return o1.getAttribute(1).compareTo(o2.getAttribute(1));
                    }
                };
                break;

            //Player Name
            case 2:
                returnComp = new Comparator<TableMember>() {
                    @Override
                    public int compare(TableMember o1, TableMember o2) {
                        return o1.getAttribute(2).compareTo(o2.getAttribute(2));
                    }
                };
                break;

            //Player Height
            case 3:
                returnComp = new Comparator<TableMember>() {
                    @Override
                    public int compare(TableMember o1, TableMember o2) {
                        return o1.getAttribute(3).compareTo(o2.getAttribute(3));
                    }
                };
                break;

            //Player Weight
            case 4:
                returnComp = new Comparator<TableMember>() {
                    @Override
                    public int compare(TableMember o1, TableMember o2) {
                        return o1.getAttribute(4).compareTo(o2.getAttribute(4));
                    }
                };
                break;

            //Player Hometown
            //NOTE: Leaving String comparison in due to there being no single/double digit weights and String comparison works
            case 5:
                returnComp = new Comparator<TableMember>() {
                    @Override
                    public int compare(TableMember o1, TableMember o2) {
                        return o1.getAttribute(5).compareTo(o2.getAttribute(5));
                    }
                };
                break;

            //Player Highschool
            case 6:
                returnComp = new Comparator<TableMember>() {
                    @Override
                    public int compare(TableMember o1, TableMember o2) {
                        return o1.getAttribute(6).compareTo(o2.getAttribute(6));
                    }
                };
                break;
        }

        return returnComp;
    }

    //Get comparator by number, Collections.sort that comparator with the list and return it
    public ArrayList<TableMember> sortPlayerByField(ArrayList<TableMember> players, int sortField) {
        Collections.sort(players, getComparator(sortField));
        return players;
    }
}
