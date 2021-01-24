package com.javagui.simplecalculator;

import javax.swing.*;

public class MainActivity {
    private JPanel jPanel;
    private JTextField displayPanel;

    private JButton clearBtn;

    private JButton oneBtn, twoBtn, threeBtn;
    private JButton fourBtn, fiveBtn, sixBtn;
    private JButton sevenBtn, eightBtn, nineBtn;

    private JButton zeroBtn, decimalBtn;

    private JButton addBtn, subtractBtn;
    private JButton multiplyBtn, divisionBtn;

    private JButton resultBtn;

    private double operand1, operand2, result;

    private boolean[] operations = {
            false, // Addition
            false, // Subtraction
            false, // Multiply
            false // Division
    };

    public MainActivity() {
        clearBtn.addActionListener(actionEvent -> displayPanel.setText(null));

        oneBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "1"));
        twoBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "2"));
        threeBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "3"));

        fourBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "4"));
        fiveBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "5"));
        sixBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "8"));

        sevenBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "7"));
        eightBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "8"));
        nineBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "9"));

        zeroBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "0"));
        decimalBtn.addActionListener(actionEvent -> displayPanel.setText(displayPanel.getText() + "."));

        addBtn.addActionListener(actionEvent -> {
            if (!displayPanel.getText().isBlank()) {
                operand1 = Float.parseFloat(displayPanel.getText() + "");
                operations[0] = true;
            }
            displayPanel.setText(null);
        });
        subtractBtn.addActionListener(actionEvent -> {
            if (!displayPanel.getText().isBlank()) {
                operand1 = Float.parseFloat(displayPanel.getText() + "");
                operations[1] = true;
            }
            displayPanel.setText(null);
        });
        multiplyBtn.addActionListener(actionEvent -> {
            if (!displayPanel.getText().isBlank()) {
                operand1 = Float.parseFloat(displayPanel.getText() + "");
                operations[2] = true;
            }
            displayPanel.setText(null);
        });
        divisionBtn.addActionListener(actionEvent -> {
            if (!displayPanel.getText().isBlank()) {
                operand1 = Float.parseFloat(displayPanel.getText() + "");
                operations[3] = true;
            }
            displayPanel.setText(null);
        });

        resultBtn.addActionListener(actionEvent -> {
            operand2 = Float.parseFloat(displayPanel.getText() + "");
            if(operations[0]) {
                result = operand1 + operand2;
                displayPanel.setText(result + "");
                operations[0] = false;
            } else if(operations[1]) {
                result = operand1 - operand2;
                displayPanel.setText(result + "");
                operations[1] = false;
            } else if(operations[2]) {
                result = operand1 * operand2;
                displayPanel.setText(result + "");
                operations[2] = false;
            } else if(operations[3]) {
                result = operand1 / operand2;
                displayPanel.setText(result + "");
                operations[3] = false;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainActivity");
        frame.setContentPane(new MainActivity().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
