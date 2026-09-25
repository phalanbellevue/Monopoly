package edu.towson.cis.cosc442.project1.monopoly;

public class MockRespondDialog implements RespondDialog {
    /**
     * Constructs a new mock respond dialog instance with the specified parameters.
     *
     * @param deal deal
     */
    public MockRespondDialog(TradeDeal deal) {
    }

    /**
     * Returns the response.
     *
     * @return true if successful, false otherwise
     */
    public boolean getResponse() {
        return true;
    }
}
