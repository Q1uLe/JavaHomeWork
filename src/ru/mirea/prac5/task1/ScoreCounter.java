package ru.mirea.prac5.task1;

import javax.swing.*;
import java.awt.*;

public class ScoreCounter extends JFrame {
    private int milanCount = 0;
    private int realCount = 0;

    private final CustomLabel result;
    private final CustomLabel lastScorer;
    private final CustomLabel winner;

    public ScoreCounter(){
        setTitle("Soccer game");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        Color milanButtonColor = new Color(214, 33, 48);
        Color realButtonColor = new Color(188, 184, 24);
        Color labelsPanelColor = new Color(255, 255, 255);
        Color buttonsPanelColor = new Color(255, 255, 255);
        Color resultLabelColor = new Color(0, 0, 0);
        Color lastScorerLabelColor = new Color(0, 0, 0);
        Color winnerLabelColor = new Color(0, 0, 0);


        CustomButton milanButton = new CustomButton("AC Milan", milanButtonColor);
        CustomButton realButton = new CustomButton("Real Madrid", realButtonColor);


        result = new CustomLabel("Result: 0 X 0", resultLabelColor);
        lastScorer = new CustomLabel("Last scorer: N/A", lastScorerLabelColor);
        winner = new CustomLabel("Winner: DRAW", winnerLabelColor);

        JPanel labelsPanel = new JPanel();
        labelsPanel.setPreferredSize(new Dimension(700  , 600));
        labelsPanel.setBackground(labelsPanelColor);
//        labelsPanel.setLayout(new GridLayout(3, 1));
        labelsPanel.setLayout(new BoxLayout(labelsPanel, BoxLayout.PAGE_AXIS));
        labelsPanel.setAlignmentX(0.5f);
//        labelsPanel.setAlignmentY();

        labelsPanel.add(result);
        labelsPanel.add(Box.createVerticalGlue());
        labelsPanel.add(lastScorer);
        labelsPanel.add(Box.createVerticalGlue());
        labelsPanel.add(winner);
        labelsPanel.add(Box.createVerticalGlue());

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setPreferredSize(new Dimension(700, 300));
        buttonsPanel.setBackground(buttonsPanelColor);
        buttonsPanel.setLayout(new GridLayout(1, 3));

        buttonsPanel.add(milanButton);
        buttonsPanel.add(realButton);


        add(labelsPanel);
        add(buttonsPanel);

        milanButton.addActionListener(_->updateCount(Teams.AC_MILAN));
        realButton.addActionListener(_->updateCount(Teams.REAL_MADRID));


        setVisible(true);
    }

    private void updateLastScorer(String lastScorerName){
        lastScorer.setText("Last scorer: " + lastScorerName);
    }

    private void updateWinner(){
        if (milanCount > realCount) {
            winner.setText("Winner: AC Milan");
        } else if (milanCount < realCount) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }


    private void updateCount(Teams team){
        switch (team) {
            case AC_MILAN -> {
                milanCount++;
                updateLastScorer(Teams.AC_MILAN.toString());
                break;
            }

            case REAL_MADRID -> {
                realCount++;
                updateLastScorer(Teams.REAL_MADRID.toString());
                break;
            }
        }
        result.setText("Result: " + milanCount + 'X' + realCount);
        updateWinner();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ScoreCounter::new);
    }
}
