package edu.towson.cis.cosc442.project1.monopoly;

import junit.framework.TestCase;

public class MovePlayerCardTest extends TestCase {
    GameMaster gameMaster;
    Card movePlayerCard;
    
    /**
     * Set up.
     */
    protected void setUp() {
		gameMaster = GameMaster.instance();
		gameMaster.setGameBoard(new GameBoardCCMovePlayer());
		gameMaster.setNumberOfPlayers(1);
		gameMaster.reset();
		gameMaster.setGUI(new MockGUI());
		movePlayerCard = new MovePlayerCard("Blue 1", Card.TYPE_CC);
		gameMaster.getGameBoard().addCard(movePlayerCard);
    }
    
    /**
     * Test jail card labels.
     */
    public void testJailCardLabel() {
        assertEquals("Go to Blue 1", movePlayerCard.getLabel());
    }
    
    /**
     * Test move player card actions.
     */
    public void testMovePlayerCardAction() {
		Card card = gameMaster.drawCCCard();
		assertEquals(movePlayerCard, card);
		card.applyAction();
		Cell cell = gameMaster.getCurrentPlayer().getPosition();
		assertEquals(gameMaster.getGameBoard().queryCell("Blue 1"), cell);
    }
    
    /**
     * Test move player card uis.
     */
    public void testMovePlayerCardUI() {
        gameMaster.movePlayer(0, 2);
        assertTrue(gameMaster.getGUI().isDrawCardButtonEnabled());
        assertFalse(gameMaster.getGUI().isEndTurnButtonEnabled());
        gameMaster.btnDrawCardClicked();
        assertFalse(gameMaster.getGUI().isDrawCardButtonEnabled());
		Cell cell = gameMaster.getCurrentPlayer().getPosition();
		assertEquals(gameMaster.getGameBoard().queryCell("Blue 1"), cell);
		assertTrue(gameMaster.getGUI().isEndTurnButtonEnabled());
		assertEquals(1700, gameMaster.getCurrentPlayer().getMoney());
    }
}
