package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.Cell;

public class GotoJailCellInfoFormatter implements CellInfoFormatter {

    public static final String GOTO_JAIL_LABEL = "<html><b>Go to Jail</b></html>";

    /**
     * Formats the goto jail cell info formatter.
     *
     * @param cell cell
     * @return the resulting string
     */
    public String format(Cell cell) {
    	return GOTO_JAIL_LABEL;
	}
}
