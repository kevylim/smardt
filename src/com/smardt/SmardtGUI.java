package com.smardt;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SmardtGUI
{
    private JPanel panelMain;
    private JTextField insertText;
    private JButton button;
    private JTextField displayText;
    private JTextField x1Text;
    private JTextField x2Text;
    private JTextField y1Text;
    private JTextField y2Text;

    public SmardtGUI()
    {
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
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("SmardtGUI");
        frame.setContentPane(new SmardtGUI() .panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
