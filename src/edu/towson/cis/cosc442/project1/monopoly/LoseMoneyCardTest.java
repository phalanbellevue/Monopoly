package edu.towson.cis.cosc442.project1.monopoly;

import junit.framework.TestCase;

public class LoseMoneyCardTest extends TestCase {
    GameMaster gameMaster;
    Card loseMoneyCard;

    /**
     * Set up.
     */
    protected void setUp() {
		gameMaster = GameMaster.instance();
		gameMaster.setGameBoard(new GameBoardCCLoseMoney());
		gameMaster.setNumberOfPlayers(1);
		gameMaster.reset();
		gameMaster.setGUI(new MockGUI());
		loseMoneyCard = new MoneyCard("Pay 20 dollars", -20, Card.TYPE_CC);
		gameMaster.getGameBoard().addCard(loseMoneyCard);
    }
    
    /**
     * Test lose money card actions.
     */
    public void testLoseMoneyCardAction() {
        int origMoney = gameMaster.getCurrentPlayer().getMoney();
		Card card = gameMaster.drawCCCard();
		assertEquals(loseMoneyCard, card);
		card.applyAction();
		assertEquals(origMoney - 20, gameMaster.getCurrentPlayer().getMoney());
    }
    
    /**
     * Test lose money card uis.
     */
    public void testLoseMoneyCardUI() {
        gameMaster.movePlayer(0, 1);
        assertTrue(gameMaster.getGUI().isDrawCardButtonEnabled());
        assertFalse(gameMaster.getGUI().isEndTurnButtonEnabled());
        gameMaster.btnDrawCardClicked();
        assertFalse(gameMaster.getGUI().isDrawCardButtonEnabled());
		assertTrue(gameMaster.getGUI().isEndTurnButtonEnabled());
    }
}
