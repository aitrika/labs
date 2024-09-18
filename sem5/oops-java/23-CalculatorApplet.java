import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// <applet code="CalculatorApplet" width="300" height="300"></applet>
public class CalculatorApplet extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button add, subtract, multiply, divide;

    @Override
    public void init() {
        // Create text fields
        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false);

        // Create buttons
        add = new Button("Add");
        subtract = new Button("Subtract");
        multiply = new Button("Multiply");
        divide = new Button("Divide");

        // Add action listeners
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        // Layout components
        setLayout(new FlowLayout());
        add(new Label("Number 1:"));
        add(num1);
        add(new Label("Number 2:"));
        add(num2);
        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(new Label("Result:"));
        add(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double number1 = Double.parseDouble(num1.getText());
        double number2 = Double.parseDouble(num2.getText());
        double res = 0;

        // Perform calculations based on the button pressed
        if (e.getSource() == add) {
            res = number1 + number2;
        } else if (e.getSource() == subtract) {
            res = number1 - number2;
        } else if (e.getSource() == multiply) {
            res = number1 * number2;
        } else if (e.getSource() == divide) {
            if (number2 != 0) {
                res = number1 / number2;
            } else {
                result.setText("Error: Div/0");
                return;
            }
        }

        result.setText(String.valueOf(res));
    }
}
