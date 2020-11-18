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

        Comparator<TableMember> returnComp;
        //Comparator for the number field
        if (sortField == 0) {
            returnComp = (o1, o2) -> {
                if (Integer.parseInt(o1.getAttribute(0)) < Integer.parseInt(o2.getAttribute(0))){
                    return -1;
                } else if (Integer.parseInt(o1.getAttribute(0)) == Integer.parseInt(o2.getAttribute(0))){
                    return 0;
                } else {
                    return 1;
                }
            };
        //Comparator for everything else, works for weight as well since all weights are 3 digits
        } else {
            returnComp = Comparator.comparing(o -> o.getAttribute(sortField));

        }

        return returnComp;
    }

    //Get comparator by number, Collections.sort that comparator with the list and return it
    public ArrayList<TableMember> sortPlayerByField(ArrayList<TableMember> players, int sortField) {
        Collections.sort(players, getComparator(sortField));
        return players;
    }
}
