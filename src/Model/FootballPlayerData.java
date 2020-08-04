/**
 COPYRIGHT (C) 2020 Conner Smith. All Rights Reserved.
 Class for decoding Football players from XML file
 IST 242 Assignment 05
 @author Conner Smith
 @version 1.00 2020-08-03
 */
package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData implements TableData, Displayable, Sortable {
    private ArrayList<TableMember> players;
    private int highlightedLine = 0;
    private int fistLineToDisplay = 0;
    private int lastLineToDisplay = 10;
    private int linesToBeDisplayed = 10;
    private int fieldToSort = 0;

    public FootballPlayerData() {
        players = new ArrayList<>();
        loadTable();
    }

    public void ReadPlayersFromXML() {
        try {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null) {
                try {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend) {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {
            xx.printStackTrace();
        }
    }


    //=====TableData Interface Methods=====

    @Override
    public void loadTable() {
        this.ReadPlayersFromXML();
    }

    @Override
    public ArrayList getTable() {
        return this.players;
    }

    @Override
    public ArrayList<String> getHeaders() {
        FootballPlayer fp = new FootballPlayer();
        return fp.getAttributeNames();
    }

    @Override
    public ArrayList<String> getLine(int line) {
        return players.get(line).getAttributes();
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> rArray = new ArrayList<ArrayList<String>>();
        for (int i = firstLine; i < lastLine; i++) {
            rArray.add(players.get(i).getAttributes());
        }
        return rArray;
    }




    //=====Displayable Interface Methods=====

    @Override
    public int getFirstLineToDisplay() {
        return fistLineToDisplay;
    }

    @Override
    public int getLineToHighlight() {
        return highlightedLine;
    }

    @Override
    public int getLastLineToDisplay() {
        return lastLineToDisplay;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return linesToBeDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
        fistLineToDisplay = firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        this.highlightedLine = highlightedLine;
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
        this.lastLineToDisplay = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesToBeDisplayed = numberOfLines;
    }


    //=====Sortable Interface Methods=====
    @Override
    public void sort() {
        TableSorter sorter = new TableSorter();
        players = sorter.sortPlayerByField(players, fieldToSort);
    }

    @Override
    public int getSortField() {
        return fieldToSort;
    }

    @Override
    public void setSortField(int sortField) {
        fieldToSort = sortField;
    }
}