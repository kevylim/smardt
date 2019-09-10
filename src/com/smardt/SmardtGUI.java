package com.smardt;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SmardtGUI
{
    public JPanel panelMain;
    private JTextField insertText;
    private JButton button;
    private JTextField displayText;
    private JTextField x1Text;
    private JTextField x2Text;
    private JTextField y1Text;
    private JTextField y2Text;
    private JButton resetButton;

    public SmardtGUI()
    {
        resetButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                x1Text.setText("12.2");
                x2Text.setText("26");
                y1Text.setText("11");
                y2Text.setText("6");
            }
        });

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                double x1=Double.parseDouble(x1Text.getText()),
                        x2=Double.parseDouble(x2Text.getText()),
                        y1=Double.parseDouble(y1Text.getText()),
                        y2=Double.parseDouble(y2Text.getText());
                double DewPoint = Double.parseDouble(insertText.getText());
                double m = (y2-y1)/(x2-x1);
                if (DewPoint < x1)
                    DewPoint = x1;
                else if (DewPoint > x2)
                    DewPoint = x2;
                double SetPoint = m*(DewPoint-x1)+y1;
                displayText.setText(SetPoint + "°C");
            }
        });

        x1Text.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                super.keyTyped(e);
                char vChar = e.getKeyChar();
                if (Character.isLetter(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))
                    e.consume();
            }
        });

        x2Text.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                super.keyTyped(e);
                char vChar = e.getKeyChar();
                if (Character.isLetter(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))
                    e.consume();
            }
        });

        y1Text.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                super.keyTyped(e);
                char vChar = e.getKeyChar();
                if (Character.isLetter(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))
                    e.consume();
            }
        });

        y2Text.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                super.keyTyped(e);
                char vChar = e.getKeyChar();
                if (Character.isLetter(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))
                    e.consume();
            }
        });

        insertText.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                super.keyTyped(e);
                char vChar = e.getKeyChar();
                if (Character.isLetter(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))
                    e.consume();
            }
        });
    }
}
