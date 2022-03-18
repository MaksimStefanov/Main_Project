package selfControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main2 extends JFrame {

    public void start() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 600, 120);

        JPanel panel = new JPanel(new FlowLayout());
        JTextField textField = new JTextField(4);
        JTextField textField1 = new JTextField(4);
        JTextField textField2 = new JTextField(4);
        JTextField textField3 = new JTextField(4);
        JTextField textField4 = new JTextField(4);

        JLabel label = new JLabel("Свет");
        JLabel label1 = new JLabel("Газ");
        JLabel label2 = new JLabel("Газ(поставка)");
        JLabel label3 = new JLabel("Вода");
        JLabel label4 = new JLabel("Вода");

        JButton button = new JButton("Шо по чем?");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double el = 0;
                double g = 0;
                double gp = 0;
                double w1 = 0;
                double w2 = 0;
                try {
                    el = Double.parseDouble(textField.getText());
                    g = Double.parseDouble(textField1.getText());
                    gp = Double.parseDouble(textField2.getText());
                    w1 = Double.parseDouble(textField3.getText());
                    w2 = Double.parseDouble(textField4.getText());
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(panel, "Вводить только цифры!");
                }
                double sum = el + g + gp + w1 + w2;
                double maks = el / 4 + g / 4 + gp / 4 + w1 / 4 + w2 / 2;
                double artem = el / 4 + g / 4 + gp / 4;
                double julia = el / 4 + g / 4 + gp / 4 + w1 / 8 * 5 + w2 / 4;
                double vitya = el / 4 + g / 4 + gp / 4 + w1 / 8 + w2 / 4;
                JOptionPane.showMessageDialog(panel, "Общая сумма: " + sum + " гривень\n Максим: " + maks +
                        " гривень\n Артем: " + artem + " гривень\n Юля: " + julia + " гривень\n Витя: " + vitya+" гривень\n");
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(label4);
        panel.add(textField4);
        panel.add(button);
        add(panel);
        setVisible(true);
    }


}
