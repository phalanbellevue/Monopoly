package edu.towson.cis.cosc442.project1.monopoly;

import java.util.ArrayList;
import java.util.Hashtable;

public class GameBoard {

	private ArrayList<Cell> cells = new ArrayList<Cell>();
    private ArrayList<Card> chanceCards = new ArrayList<Card>();
	//the key of colorGroups is the name of the color group.
	private Hashtable<String, Integer> colorGroups = new Hashtable<String, Integer>();
	private ArrayList<Card> communityChestCards = new ArrayList<Card>();
	/**
	 * Constructs a new game board instance.
	 */
	public GameBoard() {
		Cell go = new GoCell();
		addCell(go);
	}

    /**
     * Adds the card.
     *
     * @param card card
     */
    public void addCard(Card card) {
        if(card.getCardType() == Card.TYPE_CC) {
            communityChestCards.add(card);
        } else {
            chanceCards.add(card);
        }
    }
	
	/**
	 * Adds the cell.
	 *
	 * @param cell cell
	 */
	public void addCell(Cell cell) {
		cells.add(cell);
	}
	
	/**
	 * Adds the cell.
	 *
	 * @param cell cell
	 */
	public void addCell(PropertyCell cell) {
		String colorGroup = cell.getColorGroup();
		int propertyNumber = getPropertyNumberForColor(colorGroup); // previously cell.getColorGroup()
		colorGroups.put(cell.getColorGroup(), new Integer(propertyNumber + 1));
        cells.add(cell);
	}

    /**
     * Draw cc cards.
     *
     * @return the resulting card
     */
    public Card drawCCCard() {
        Card card = (Card)communityChestCards.get(0);
        communityChestCards.remove(0);
        addCard(card);
        return card;
    }

    /**
     * Draw chance cards.
     *
     * @return the resulting card
     */
    public Card drawChanceCard() {
        Card card = (Card)chanceCards.get(0);
        chanceCards.remove(0);
        addCard(card);
        return card;
    }

	/**
	 * Returns the cell.
	 *
	 * @param newIndex zero-based index
	 * @return the resulting cell
	 */
	public Cell getCell(int newIndex) {
		return (Cell)cells.get(newIndex);
	}
	
	/**
	 * Returns the cell number.
	 *
	 * @return the resulting numeric value
	 */
	public int getCellNumber() {
		return cells.size();
	}
	
	/**
	 * Returns the properties in monopoly.
	 *
	 * @param color color
	 * @return array of property cells
	 */
	public PropertyCell[] getPropertiesInMonopoly(String color) {
		PropertyCell[] monopolyCells = 
			new PropertyCell[getPropertyNumberForColor(color)];
		int counter = 0;
		populateMonopolyCells(color, monopolyCells, counter);
		return monopolyCells;
	}

	/**
	 * Populate monopoly cells.
	 *
	 * @param color color
	 * @param monopolyCells monopoly cells
	 * @param counter counter
	 */
	private void populateMonopolyCells(String color, PropertyCell[] monopolyCells, int counter) {
		for (int i = 0; i < getCellNumber(); i++) {
			Cell c = getCell(i);
			if(c instanceof PropertyCell) {
				PropertyCell pc = (PropertyCell)c;
				if(pc.getColorGroup().equals(color)) {
					monopolyCells[counter] = pc;
					counter++;
				}
			}
		}
	}
	
	/**
	 * Returns the property number for color.
	 *
	 * @param name name
	 * @return the resulting numeric value
	 */
	public int getPropertyNumberForColor(String name) {
		Integer number = (Integer)colorGroups.get(name);
		if(number != null) {
			return number.intValue();
		}
		return 0;
	}

	/**
	 * Query cells.
	 *
	 * @param string string
	 * @return the resulting cell
	 */
	public Cell queryCell(String string) {
		for(int i = 0; i < cells.size(); i++){
			Cell temp = (Cell)cells.get(i); 
			if(temp.getName().equals(string)) {
				return temp;
			}
		}
		return null;
	}
	
	/**
	 * Query cell indexs.
	 *
	 * @param string string
	 * @return the resulting numeric value
	 */
	public int queryCellIndex(String string){
		for(int i = 0; i < cells.size(); i++){
			Cell temp = (Cell)cells.get(i); 
			if(temp.getName().equals(string)) {
				return i;
			}
		}
		return -1;
	}

    /**
     * Removes the cards.
     */
    public void removeCards() {
        communityChestCards.clear();
    }
}
