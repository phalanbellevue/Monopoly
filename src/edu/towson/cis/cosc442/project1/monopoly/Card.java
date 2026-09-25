package edu.towson.cis.cosc442.project1.monopoly;

public abstract class Card {

    public static int TYPE_CHANCE = 1;
    public static int TYPE_CC = 2;

    /**
     * Returns the label.
     *
     * @return the resulting string
     */
    public abstract String getLabel();
    /**
     * Applies the action.
     */
    public abstract void applyAction();
    /**
     * Returns the card type.
     *
     * @return the resulting numeric value
     */
    public abstract int getCardType();
}
