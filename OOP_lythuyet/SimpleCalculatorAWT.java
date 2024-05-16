import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorAWT extends Frame implements ActionListener {

    private TextField textFieldA;
    private TextField textFieldB;
    private TextField resultTextField;

    public SimpleCalculatorAWT() {
        super("CalculatorAWT");
        
        // thiết lập layout
        setLayout(new FlowLayout());

        Label labelA = new Label("Nhập số a:");
        add(labelA);

        textFieldA = new TextField(10);
        add(textFieldA);

        Label labelB = new Label("Nhập số b:");
        add(labelB);

        textFieldB = new TextField(10);
        add(textFieldB);

        // nút bấm
        Button calculateButton = new Button("Calculate");
        add(calculateButton);
        calculateButton.addActionListener(this);

        // réult
        Label resultLabel = new Label("Kết quả:");
        add(resultLabel);

        resultTextField = new TextField(10);
        resultTextField.setEditable(false);
        add(resultTextField);

        // kích thước và hiển thị Frame
        setSize(1000, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            try {
                double a = Double.parseDouble(textFieldA.getText());
                double b = Double.parseDouble(textFieldB.getText());
                double result = a + b;
                resultTextField.setText(Double.toString(result));
            } catch (NumberFormatException ex) {
                resultTextField.setText("Please enter valid numbers!");
            }
        }
    }

    public static void main(String[] args) {
        new SimpleCalculatorAWT();
    }
}
