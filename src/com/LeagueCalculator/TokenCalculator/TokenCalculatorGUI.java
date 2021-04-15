package com.LeagueCalculator.TokenCalculator;

import org.apache.poi.ss.formula.functions.T;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TokenCalculatorGUI {
    private JTextField tokensNeededTF;
    private JTextField currentTokensTF;
    private JTextField daysLeftTF;
    private JTextField winrateTF;
    private JTextField calculationsTF;
    private JTextArea tokenCalculatorTextArea;
    private JButton calculateButton;

    public TokenCalculatorGUI() {
        try {
            calculateButton.addActionListener(new calculate(Integer.parseInt(tokensNeededTF.getText()), Integer.parseInt(currentTokensTF.getText()), Integer.parseInt(daysLeftTF.getText()), Float.parseFloat(winrateTF.getText()), Integer.parseInt(calculationsTF.getText())));
        } catch (NullPointerException e) {

        }
    }

    private class calculate implements ActionListener {
        int needed;
        int current;
        int days;
        float wr;
        int calc;

        public calculate(int needed, int current, int days, float wr, int calc) {
            this.needed = needed;
            this.current = current;
            this.days = days;
            this.wr = wr;
            this.calc = calc;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            TokenCalculator tc = new TokenCalculator(needed, current, days, wr, calc);
        }
    }
}
