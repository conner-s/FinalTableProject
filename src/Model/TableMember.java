/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Interface for Objects to be displayed in a Table.
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package Model;

import java.util.ArrayList;

public interface TableMember {
    public String getAttribute(int n);

    public ArrayList<String> getAttributes();

    public String getAttributeName(int n);

    public ArrayList<String> getAttributeNames();
}
