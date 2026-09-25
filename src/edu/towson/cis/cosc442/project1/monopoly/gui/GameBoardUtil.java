package edu.towson.cis.cosc442.project1.monopoly.gui;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import edu.towson.cis.cosc442.project1.monopoly.Cell;
import edu.towson.cis.cosc442.project1.monopoly.GameBoard;

public class GameBoardUtil {
    
	/**
	 * Calculates the dimension.
	 *
	 * @param i the i parameter
	 * @return the resulting dimension
	 */
	public static Dimension calculateDimension(int i) {
		i = i - 4;
		int shortSide = i / 4;
		int longSide = (i - (shortSide * 2)) / 2;
		return new Dimension(longSide, shortSide);
	}
	
	/**
	 * Returns the east cells.
	 *
	 * @param board board
	 * @return list containing cells
	 */
	public static List<Cell> getEastCells(GameBoard board) {
		Dimension d = calculateDimension(board.getCellNumber());
		int shortSide = d.height;
		List<Cell> cells = new ArrayList<Cell>();
		for(int i = board.getCellNumber() - shortSide; i <= board.getCellNumber() - 1; i++) {
			cells.add(board.getCell(i));
		}
		return cells;
	}
	
	/**
	 * Returns the north cells.
	 *
	 * @param board board
	 * @return list containing cells
	 */
	public static List<Cell> getNorthCells(GameBoard board) {
		Dimension d = calculateDimension(board.getCellNumber());
		int longSide = d.width;
		int shortSide = d.height;
		List<Cell> cells = new ArrayList<Cell>();
		for(int i = longSide + 2 + shortSide; i <= longSide + 2 + shortSide + longSide + 1; i++) {
			cells.add(board.getCell(i));
		}
		return cells;
	}
	
	/**
	 * Returns the south cells.
	 *
	 * @param board board
	 * @return list containing cells
	 */
	public static List<Cell> getSouthCells(GameBoard board) {
		Dimension d = calculateDimension(board.getCellNumber());
		int longSide = d.width;
		List<Cell> cells = new ArrayList<Cell>();
		for(int i = longSide + 1; i >= 0; i--) {
			cells.add(board.getCell(i));
		}
		return cells;
	}
	
	/**
	 * Returns the west cells.
	 *
	 * @param board board
	 * @return list containing cells
	 */
	public static List<Cell> getWestCells(GameBoard board) {
		Dimension d = calculateDimension(board.getCellNumber());
		int longSide = d.width;
		int shortSide = d.height;
		List<Cell> cells = new ArrayList<Cell>();
		for(int i = longSide + 1 + shortSide; i > longSide + 1; i--) {
			cells.add(board.getCell(i));
		}
		return cells;
	}
}
