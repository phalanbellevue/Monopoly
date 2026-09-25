package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.Cell;

public interface CellInfoFormatter {
    /**
     * Formats the cell info formatter.
     *
     * @param cell cell
     * @return the resulting string
     */
    public String format(Cell cell);
}
