import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField numField1, numField2, resulField;
    private JButton addButton, subButton, multiplyButton, divideButton, valueButton;

    public SimpleCalculator() {
        // setup the user interface :
        setTitle("Simple Calculator");
        setLayout(new GridLayout(4, 4));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // set numFields for input of number and result printing
        numField1 = new JTextField();
        numField2 = new JTextField();
        resulField = new JTextField("Result");
        resulField.setEditable(false);

        // set buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        valueButton = new JButton("=");

        // add components to Frame
        add(new Label("First number : "));
        add(numField1);
        add(new Label("Second number : "));
        add(numField2);
        add(new Label("Result : "));
        add(resulField);
        add(addButton);
        add(subButton);
        add(multiplyButton);
        add(divideButton);
        add(valueButton);

        // add actionListener to the buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        // make the frame visible and set size
        setSize(400, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());
        double result = 0;

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            result = num1 / num2;
        } else if (e.getSource() == valueButton) {
            JOptionPane.showMessageDialog(this, "Welcome to the Java Simple Calculator");
        }
        resulField.setText(Double.toString(result));
    }

    public static void main(String args[]) {
        new SimpleCalculator();
    }

}