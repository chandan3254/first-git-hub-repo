import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConverterGUI3 extends JFrame {
    private JComboBox<String> unitTypeDropdown;
    private JTextField inputField;
    private JLabel resultLabel;

    public UnitConverterGUI3() {
        setTitle("Unit Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Dropdown Menu
        String[] unitTypes = {"Temperature", "Length", "Weight"};
        unitTypeDropdown = new JComboBox<>(unitTypes);

        // Input Field
        inputField = new JTextField(10);

        // Convert Button
        JButton convertButton = new JButton("Convert");

        // Result Label
        resultLabel = new JLabel("Result: ");

        // Button Click Event
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertUnit();
            }
        });

        // Add Components to GUI
        add(unitTypeDropdown);
        add(inputField);
        add(convertButton);
        add(resultLabel);

        setVisible(true);
    }

    private void convertUnit() {
        String selectedUnit = (String) unitTypeDropdown.getSelectedItem();
        double value = Double.parseDouble(inputField.getText());

        if (selectedUnit.equals("Temperature")) {
            double fahrenheit = (value * 9/5) + 32;
            resultLabel.setText("Result: " + fahrenheit + " °F");
        } else if (selectedUnit.equals("Length")) {
            double meters = value * 1000;
            resultLabel.setText("Result: " + meters + " meters");
        } else if (selectedUnit.equals("Weight")) {
            double grams = value * 1000;
            resultLabel.setText("Result: " + grams + " grams");
        }
    }

    public static void main(String[] args) {
        new UnitConverterGUI3();
    }
}
