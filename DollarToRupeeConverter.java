import javax.swing.*;
import java.awt.event.*;

public class DollarToRupeeConverter extends JFrame implements ActionListener {
    private JTextField dollarTextField, rupeeTextField;
    private JButton convertButton;

    public DollarToRupeeConverter() {
        super("Dollar to Rupee Converter");

        dollarTextField = new JTextField(10);
        rupeeTextField = new JTextField(10);
        convertButton = new JButton("Convert");

        convertButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Dollars: "));
        panel.add(dollarTextField);
        panel.add(new JLabel("Rupees: "));
        panel.add(rupeeTextField);
        panel.add(convertButton);

        add(panel);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double dollars = Double.parseDouble(dollarTextField.getText());
            double rupees = dollars * 82.77; // current conversion rate
            rupeeTextField.setText(Double.toString(rupees));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new DollarToRupeeConverter();
    }
}
