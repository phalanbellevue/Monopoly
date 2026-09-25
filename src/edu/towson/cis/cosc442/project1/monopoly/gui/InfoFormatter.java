package edu.towson.cis.cosc442.project1.monopoly.gui;

import java.util.Hashtable;

import edu.towson.cis.cosc442.project1.monopoly.*;

public class InfoFormatter {
    static Hashtable<Class<?>, CellInfoFormatter> cellInfoFormatters = null;
    
    static {
        if (cellInfoFormatters == null) {
            cellInfoFormatters = new Hashtable<Class<?>, CellInfoFormatter>();
            /**
             * Constructs a new info formatter instance.
             */
            addFormatters();
        }
    }
    
    /**
     * Adds the formatters.
     */
    private static void addFormatters() {
        cellInfoFormatters.put(
                PropertyCell.class, new PropertyCellInfoFormatter());
        cellInfoFormatters.put(
                GoCell.class, new GoCellInfoFormatter());
        cellInfoFormatters.put(
        		JailCell.class, new JailCellInfoFormatter());
        cellInfoFormatters.put(
        		GoToJailCell.class, new GotoJailCellInfoFormatter());
        cellInfoFormatters.put(
        		FreeParkingCell.class, new FreeParkingCellInfoFormatter());
        cellInfoFormatters.put(
                RailRoadCell.class, new RRCellInfoFormatter());
        cellInfoFormatters.put(
                UtilityCell.class, new UtilCellInfoFormatter());
        cellInfoFormatters.put(
                CardCell.class, new CCCellInfoFormatter());
    }

    /**
     * Cell infos.
     *
     * @param cell cell
     * @return the resulting string
     */
    public static String cellInfo(Cell cell) {
        CellInfoFormatter formatter =
                (CellInfoFormatter) cellInfoFormatters.get(cell.getClass());
        return formatter.format(cell);
    }

}
