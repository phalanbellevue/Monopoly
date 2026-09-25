package edu.towson.cis.cosc442.project1.monopoly.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.OverlayLayout;
import javax.swing.border.BevelBorder;

import edu.towson.cis.cosc442.project1.monopoly.*;

public class PlayerPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnBuyHouse;
    private JButton btnDrawCard;
    private JButton btnEndTurn;
    private JButton btnGetOutOfJail;
    private JButton btnPurchaseProperty;
    private JButton btnRollDice;
    private JButton btnTrade;
    
    private JLabel lblMoney;
    private JLabel lblName;
    
    private Player player;
    
    private JTextArea txtProperty;

    /**
     * Constructs a new player panel instance with the specified parameters.
     *
     * @param player player
     */
    public PlayerPanel(Player player) {
        JPanel pnlAction = new JPanel();
        JPanel pnlInfo = new JPanel();
        btnRollDice = new JButton("Roll Dice");
        btnPurchaseProperty = new JButton("Purchase Property");
        btnEndTurn = new JButton("End Turn");
        btnBuyHouse = new JButton("Buy House");
        btnGetOutOfJail = new JButton("Get Out of Jail");
        btnDrawCard = new JButton("Draw Card");
        btnTrade = new JButton("Trade");
        this.player = player;
        lblName = new JLabel();
        lblMoney = new JLabel();
        txtProperty = new JTextArea(30, 70);

        txtProperty.setEnabled(false);

        JPanel pnlName = new JPanel();
        JPanel pnlProperties = new JPanel();

        pnlInfo.setLayout(new BorderLayout());
        pnlInfo.add(pnlName, BorderLayout.NORTH);
        pnlInfo.add(pnlProperties, BorderLayout.CENTER);

        pnlProperties.setLayout(new OverlayLayout(pnlProperties));

        pnlName.add(lblName);
        pnlName.add(lblMoney);
        pnlProperties.add(txtProperty);

        pnlAction.setLayout(new GridLayout(3, 3));
        pnlAction.add(btnBuyHouse);
        pnlAction.add(btnRollDice);
        pnlAction.add(btnPurchaseProperty);
        pnlAction.add(btnGetOutOfJail);
        pnlAction.add(btnEndTurn);
        pnlAction.add(btnDrawCard);
        pnlAction.add(btnTrade);

        pnlAction.doLayout();
        pnlInfo.doLayout();
        pnlName.doLayout();
        pnlProperties.doLayout();
        this.doLayout();

        setLayout(new BorderLayout());
        add(pnlInfo, BorderLayout.CENTER);
        add(pnlAction, BorderLayout.SOUTH);

        btnRollDice.setEnabled(false);
        btnPurchaseProperty.setEnabled(false);
        btnEndTurn.setEnabled(false);
        btnBuyHouse.setEnabled(false);
        btnGetOutOfJail.setEnabled(false);
        btnDrawCard.setEnabled(false);
        btnTrade.setEnabled(false);

        setBorder(new BevelBorder(BevelBorder.RAISED));

        btnRollDice.addActionListener(new ActionListener() {
            /**
             * Action performeds.
             *
             * @param e the e parameter
             */
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnRollDiceClicked();
            }
        });

        btnEndTurn.addActionListener(new ActionListener() {
            /**
             * Action performeds.
             *
             * @param e the e parameter
             */
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnEndTurnClicked();
            }
        });

        btnPurchaseProperty.addActionListener(new ActionListener() {
            /**
             * Action performeds.
             *
             * @param e the e parameter
             */
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnPurchasePropertyClicked();
            }
        });

        btnBuyHouse.addActionListener(new ActionListener() {
            /**
             * Action performeds.
             *
             * @param e the e parameter
             */
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnBuyHouseClicked();
            }
        });

        btnGetOutOfJail.addActionListener(new ActionListener() {
            /**
             * Action performeds.
             *
             * @param e the e parameter
             */
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnGetOutOfJailClicked();
            }
        });

        btnDrawCard.addActionListener(new ActionListener() {
            /**
             * Action performeds.
             *
             * @param e the e parameter
             */
            public void actionPerformed(ActionEvent e) {
                Card card = GameMaster.instance().btnDrawCardClicked();
                JOptionPane
                        .showMessageDialog(PlayerPanel.this, card.getLabel());
                displayInfo();
            }
        });

        btnTrade.addActionListener(new ActionListener() {
            /**
             * Action performeds.
             *
             * @param e the e parameter
             */
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnTradeClicked();
            }
        });
    }

    /**
     * Display infos.
     */
    public void displayInfo() {
        lblName.setText(player.getName());
        lblMoney.setText("$ " + player.getMoney());
        StringBuffer buf = new StringBuffer();
        Cell[] cells = player.getAllProperties();
        for (int i = 0; i < cells.length; i++) {
            buf.append(cells[i] + "\n");
        }
        txtProperty.setText(buf.toString());
    }
    
    /**
     * Checks whether the buy house button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isBuyHouseButtonEnabled() {
        return btnBuyHouse.isEnabled();
    }

    /**
     * Checks whether the draw card button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isDrawCardButtonEnabled() {
        return btnDrawCard.isEnabled();
    }

    /**
     * Checks whether the end turn button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isEndTurnButtonEnabled() {
        return btnEndTurn.isEnabled();
    }
    
    /**
     * Checks whether the get out of jail button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isGetOutOfJailButtonEnabled() {
        return btnGetOutOfJail.isEnabled();
    }
    
    /**
     * Checks whether the purchase property button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isPurchasePropertyButtonEnabled() {
        return btnPurchaseProperty.isEnabled();
    }
    
    /**
     * Checks whether the roll dice button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isRollDiceButtonEnabled() {
        return btnRollDice.isEnabled();
    }

    /**
     * Checks whether the trade button enabled.
     *
     * @return true if the condition holds, false otherwise
     */
    public boolean isTradeButtonEnabled() {
        return btnTrade.isEnabled();
    }

    /**
     * Sets the buy house enabled.
     *
     * @param b flag indicating whether b
     */
    public void setBuyHouseEnabled(boolean b) {
        btnBuyHouse.setEnabled(b);
    }

    /**
     * Sets the draw card enabled.
     *
     * @param b flag indicating whether b
     */
    public void setDrawCardEnabled(boolean b) {
        btnDrawCard.setEnabled(b);
    }

    /**
     * Sets the end turn enabled.
     *
     * @param enabled flag indicating whether the feature is enabled
     */
    public void setEndTurnEnabled(boolean enabled) {
        btnEndTurn.setEnabled(enabled);
    }

    /**
     * Sets the get out of jail enabled.
     *
     * @param b flag indicating whether b
     */
    public void setGetOutOfJailEnabled(boolean b) {
        btnGetOutOfJail.setEnabled(b);
    }

    /**
     * Sets the purchase property enabled.
     *
     * @param enabled flag indicating whether the feature is enabled
     */
    public void setPurchasePropertyEnabled(boolean enabled) {
        btnPurchaseProperty.setEnabled(enabled);
    }

    /**
     * Sets the roll dice enabled.
     *
     * @param enabled flag indicating whether the feature is enabled
     */
    public void setRollDiceEnabled(boolean enabled) {
        btnRollDice.setEnabled(enabled);
    }

    /**
     * Sets the trade enabled.
     *
     * @param b flag indicating whether b
     */
    public void setTradeEnabled(boolean b) {
        btnTrade.setEnabled(b);
    }
}