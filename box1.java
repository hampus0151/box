import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class box1 {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public box1() {
        gui();
    }

    public void gui() {
        frame = new JFrame("java");

        frame.setSize(1960, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        button = new JButton("press");

        button.setBounds(50, 100, 95, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Welcome to Javatpoint.");
            }
        });

        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.red);

        panel.add(button);

        label = new JLabel("this is the lable");
        panel.add(label);

        String filename = "C:/code/java/box/i.png";
        panel.add(new JLabel(new ImageIcon(filename)));
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // public void actionPreformed (ActionEvent e)
    public static void main(String[] args) {
        new box1();
    }
}