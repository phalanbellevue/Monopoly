package edu.towson.cis.cosc442.project1.monopoly;

public class MockTradeDialog implements TradeDialog {

    /**
     * Returns the trade deal.
     *
     * @return the resulting trade deal
     */
    public TradeDeal getTradeDeal() {
        TradeDeal deal = new TradeDeal();
        deal.setAmount(200);
        deal.setSellerIndex(0);
        deal.setPropertyName(GameMaster.instance().getGameBoard().getCell(1).toString());
        return deal;
    }
}
