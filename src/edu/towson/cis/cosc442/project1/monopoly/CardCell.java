package edu.towson.cis.cosc442.project1.monopoly;

public class CardCell extends Cell {
    private int type;
    
    /**
     * Constructs a new card cell instance with the specified parameters.
     *
     * @param type type
     * @param name name
     */
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    /**
     * Play actions.
     */
    public void playAction() {
    }
    
    /**
     * Returns the type.
     *
     * @return the resulting numeric value
     */
    public int getType() {
        return type;
    }
}
