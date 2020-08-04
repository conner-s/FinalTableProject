/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Interface for extracting data from a Table.
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package Model;

import java.util.ArrayList;

public interface TableData {
    public void loadTable();

    public ArrayList<TableMember> getTable();

    public ArrayList<String> getHeaders();

    public ArrayList<String> getLine(int line);

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);
}
