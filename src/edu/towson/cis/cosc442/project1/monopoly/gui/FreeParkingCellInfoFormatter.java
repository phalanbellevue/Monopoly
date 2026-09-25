package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.Cell;

public class FreeParkingCellInfoFormatter implements CellInfoFormatter {
    
    public static final String FP_CELL_LABEL = "<html><b>Free Parking</b></html>";
    
    /**
     * Formats the free parking cell info formatter.
     *
     * @param cell cell
     * @return the resulting string
     */
    public String format(Cell cell) {
        return FP_CELL_LABEL;
    }
}
