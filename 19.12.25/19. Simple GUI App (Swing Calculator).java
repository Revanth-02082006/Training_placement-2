import javax.swing.*;
import java.awt.event.*;

public class SwingCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField result = new JTextField();
        JButton addBtn = new JButton("Add");

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(50, 100, 100, 30);
        addBtn.setBounds(50, 150, 100, 30);
        result.setBounds(50, 200, 200, 30);

        frame.add(t1);
        frame.add(t2);
        frame.add(addBtn);
        frame.add(result);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                result.setText("Sum = " + (a + b));
            }
        });

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
