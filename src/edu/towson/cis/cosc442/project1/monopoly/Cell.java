package edu.towson.cis.cosc442.project1.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	/**
	 * Returns the name.
	 *
	 * @return the resulting string
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the the owner.
	 *
	 * @return the resulting player
	 */
	public Player getTheOwner() {
		return theOwner;
	}
	
	/**
	 * Returns the price.
	 *
	 * @return the resulting numeric value
	 */
	public int getPrice() {
		return 0;
	}

	/**
	 * Checks whether the available.
	 *
	 * @return true if the condition holds, false otherwise
	 */
	public boolean isAvailable() {
		return available;
	}
	
	/**
	 * Play actions.
	 */
	public abstract void playAction();

	/**
	 * Sets the available.
	 *
	 * @param available flag indicating whether available
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name name
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the the owner.
	 *
	 * @param owner owner
	 */
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /**
     * To strings.
     *
     * @return the resulting string
     */
    public String toString() {
        return name;
    }
}
