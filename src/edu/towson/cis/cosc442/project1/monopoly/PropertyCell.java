package edu.towson.cis.cosc442.project1.monopoly;

public class PropertyCell extends Cell {
	private String colorGroup;
	private int housePrice;
	private int numHouses;
	private int rent;
	private int sellPrice;

	/**
	 * Returns the color group.
	 *
	 * @return the resulting string
	 */
	public String getColorGroup() {
		return colorGroup;
	}

	/**
	 * Returns the house price.
	 *
	 * @return the resulting numeric value
	 */
	public int getHousePrice() {
		return housePrice;
	}

	/**
	 * Returns the num houses.
	 *
	 * @return the resulting numeric value
	 */
	public int getNumHouses() {
		return numHouses;
	}
    
    /**
     * Returns the price.
     *
     * @return the resulting numeric value
     */
    public int getPrice() {
		return sellPrice;
	}

	/**
	 * Returns the rent.
	 *
	 * @return the resulting numeric value
	 */
	public int getRent() {
		int rentToCharge = rent;
		String [] monopolies = theOwner.getMonopolies();
		rentToCharge = calculateMonopoliesRent(rentToCharge, monopolies);
		return rentToCharge;
	}

	/**
	 * Calculates the monopolies rent.
	 *
	 * @param rentToCharge rent to charge
	 * @param monopolies monopolies
	 * @return the resulting numeric value
	 */
	private int calculateMonopoliesRent(int rentToCharge, String[] monopolies) {
		for(int i = 0; i < monopolies.length; i++) {
			if(monopolies[i].equals(colorGroup)) {
				rentToCharge = rent * 2;
			}
		}
		if(numHouses > 0) {
			rentToCharge = rent * (numHouses + 1);
		}
		return rentToCharge;
	}

	/**
	 * Play actions.
	 */
	public void playAction() {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(theOwner != currentPlayer) {
				currentPlayer.payRentTo(theOwner, getRent());
			}
		}
	}

	/**
	 * Sets the color group.
	 *
	 * @param colorGroup color group
	 */
	public void setColorGroup(String colorGroup) {
		this.colorGroup = colorGroup;
	}

	/**
	 * Sets the house price.
	 *
	 * @param housePrice price
	 */
	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

	/**
	 * Sets the num houses.
	 *
	 * @param numHouses num houses
	 */
	public void setNumHouses(int numHouses) {
		this.numHouses = numHouses;
	}

	/**
	 * Sets the price.
	 *
	 * @param sellPrice price
	 */
	public void setPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * Sets the rent.
	 *
	 * @param rent rent
	 */
	public void setRent(int rent) {
		this.rent = rent;
	}
}
