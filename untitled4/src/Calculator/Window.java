package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends JFrame implements WindowListener, ActionListener {

    private final TextField f = new TextField();
    private final JButton b0 = new JButton("0");
    private final JButton b1 = new JButton("1");
    private final JButton b2 = new JButton("2");
    private final JButton b3 = new JButton("3");
    private final JButton b4 = new JButton("4");
    private final JButton b5 = new JButton("5");
    private final JButton b6 = new JButton("6");
    private final JButton b7 = new JButton("7");
    private final JButton b8 = new JButton("8");
    private final JButton b9 = new JButton("9");
    private final JButton del = new JButton("C");
    private JButton cancel = new JButton("CE");
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton multiply = new JButton("*");
    private JButton division = new JButton("/");
    private JButton result = new JButton("=");
    private JButton changePlusToMinus = new JButton("+/-");
    private JButton sqrt = new JButton("sqrt");
    private JButton decimal = new JButton("1/x");

    private String text = "";
    private int a = 0;
    private int b = 0;
    private char z;

    public Window() {
        Font ex = new Font("Impact", Font.BOLD, 40);
        setLayout(null);
        setSize(400, 600);
        setVisible(true);
        setLocation(1000, 150);
        f.setFont(ex);
        f.setSize(330, 60);
        f.setLocation(25, 25);
        f.setVisible(true);
        add(f);

        b0.setFont(ex);
        b0.setSize(60, 60);
        b0.setLocation(105, 465);
        b0.setVisible(true);
        add(b0);
        b0.addActionListener(this);

        b1.setFont(ex);
        b1.setSize(60, 60);
        b1.setLocation(25, 385);
        b1.setVisible(true);
        add(b1);
        b1.addActionListener(this);

        b2.setFont(ex);
        b2.setSize(60, 60);
        b2.setLocation(105, 385);
        b2.setVisible(true);
        add(b2);
        b2.addActionListener(this);

        b3.setFont(ex);
        b3.setSize(60, 60);
        b3.setLocation(185, 385);
        b3.setVisible(true);
        add(b3);
        b3.addActionListener(this);

        b4.setFont(ex);
        b4.setSize(60, 60);
        b4.setLocation(25, 305);
        b4.setVisible(true);
        add(b4);
        b4.addActionListener(this);

        b5.setFont(ex);
        b5.setSize(60, 60);
        b5.setLocation(105, 305);
        b5.setVisible(true);
        add(b5);
        b5.addActionListener(this);

        b6.setFont(ex);
        b6.setSize(60, 60);
        b6.setLocation(185, 305);
        b6.setVisible(true);
        add(b6);
        b6.addActionListener(this);

        b7.setFont(ex);
        b7.setSize(60, 60);
        b7.setLocation(25, 225);
        b7.setVisible(true);
        add(b7);
        b7.addActionListener(this);

        b8.setFont(ex);
        b8.setSize(60, 60);
        b8.setLocation(105, 225);
        b8.setVisible(true);
        add(b8);
        b8.addActionListener(this);

        b9.setFont(ex);
        b9.setSize(60, 60);
        b9.setLocation(185, 225);
        b9.setVisible(true);
        add(b9);
        b9.addActionListener(this);

        del.setFont(ex);
        del.setSize(60, 60);
        del.setLocation(265, 225);
        del.setVisible(true);
        add(del);
        del.addActionListener(this);

        //cancel.setFont(ex);
        cancel.setSize(60, 60);
        cancel.setLocation(265, 305);
        cancel.setVisible(true);
        add(cancel);
        cancel.addActionListener(this);

        plus.setFont(ex);
        plus.setSize(60, 60);
        plus.setLocation(25, 145);
        plus.setVisible(true);
        add(plus);
        plus.addActionListener(this);

        minus.setFont(ex);
        minus.setSize(60, 60);
        minus.setLocation(105, 145);
        minus.setVisible(true);
        add(minus);
        minus.addActionListener(this);

        multiply.setFont(ex);
        multiply.setSize(60, 60);
        multiply.setLocation(185, 145);
        multiply.setVisible(true);
        add(multiply);
        multiply.addActionListener(this);

        division.setFont(ex);
        division.setSize(60, 60);
        division.setLocation(265, 145);
        division.setVisible(true);
        add(division);
        division.addActionListener(this);

        result.setFont(ex);
        result.setSize(60, 140);
        result.setLocation(265, 385);
        result.setVisible(true);
        add(result);
        result.addActionListener(this);

        //changePlusToMinus.setFont(ex);
        changePlusToMinus.setSize(60, 60);
        changePlusToMinus.setLocation(25, 465);
        changePlusToMinus.setVisible(true);
        add(changePlusToMinus);
        changePlusToMinus.addActionListener(this);

        //sqrt.setFont(ex);
        sqrt.setSize(60, 30);
        sqrt.setLocation(25, 95);
        sqrt.setVisible(true);
        add(sqrt);
        sqrt.addActionListener(this);

        //sqrt.setFont(ex);
        decimal.setSize(60, 30);
        decimal.setLocation(105, 95);
        decimal.setVisible(true);
        add(decimal);
        decimal.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            text += b0.getText();
            f.setText(text);
        }
        if (e.getSource() == b1) {
            text += b1.getText();
            f.setText(text);
        }
        if (e.getSource() == b2) {
            text += b2.getText();
            f.setText(text);
        }
        if (e.getSource() == b3) {
            text += b3.getText();
            f.setText(text);
        }
        if (e.getSource() == b4) {
            text += b4.getText();
            f.setText(text);
        }
        if (e.getSource() == b5) {
            text += b5.getText();
            f.setText(text);
        }
        if (e.getSource() == b6) {
            text += b6.getText();
            f.setText(text);
        }
        if (e.getSource() == b7) {
            text += b7.getText();
            f.setText(text);
        }
        if (e.getSource() == b8) {
            text += b8.getText();
            f.setText(text);
        }
        if (e.getSource() == b9) {
            text += b9.getText();
            f.setText(text);
        }
        if (e.getSource() == plus) {
            a = Integer.parseInt(text);
            f.setText(text + plus.getText());
            text = "";
            z = '+';
        }
        if (e.getSource() == minus) {
            a = Integer.parseInt(text);
            f.setText(text + minus.getText());
            text = "";
            z = '-';
        }
        if (e.getSource() == multiply) {
            a = Integer.parseInt(text);
            f.setText(text + multiply.getText());
            text = "";
            z = '*';
        }
        if (e.getSource() == division) {
            a = Integer.parseInt(text);
            f.setText(text + division.getText());
            text = "";
            z = '/';
        }
        if (e.getSource() == sqrt) {
            float c = Integer.parseInt(f.getText());
            c = (float) Math.sqrt(c);
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if (e.getSource() == decimal) {
            double c = Integer.parseInt(text);
            f.setText(String.valueOf(1/c));
            text = String.valueOf(c);

        }
        if (e.getSource() == del) {
            text = "";
            f.setText(text);
        }
        if (e.getSource() == cancel) {
            int c = Integer.parseInt(f.getText());
            c = c / 10;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if (e.getSource() == changePlusToMinus) {
            int c = Integer.parseInt(f.getText());
            c = c * -1;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if (e.getSource() == result) {
            if (z == '+') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a + b));
            }
            if (z == '-') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a - b));
            }
            if (z == '*') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a * b));
            }
            if (z == '/') {
                if (b != 0) {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a / b));
                } else {
                    f.setText("Деление на ноль");
                }
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
