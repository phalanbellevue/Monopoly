package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.Cell;

public class CCCellInfoFormatter implements CellInfoFormatter {
    /**
     * Formats the cc cell info formatter.
     *
     * @param cell cell
     * @return the resulting string
     */
    public String format(Cell cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }
}
