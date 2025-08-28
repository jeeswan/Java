package lab3_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q24FileColorChooser extends JFrame implements ActionListener {
    JButton fileBtn, colorBtn;

    public Q24FileColorChooser() {
        setTitle("File & Color Chooser");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        fileBtn = new JButton("File Chooser");
        colorBtn = new JButton("Color Chooser");

        fileBtn.addActionListener(this);
        colorBtn.addActionListener(this);

        add(fileBtn);
        add(colorBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fileBtn) {
            JFileChooser fc = new JFileChooser();
            if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(this,
                        "Selected: " + fc.getSelectedFile().getAbsolutePath());
            }
        } else if (e.getSource() == colorBtn) {
            Color c = JColorChooser.showDialog(this, "Pick a Color", getBackground());
            if (c != null) setBackground(c);
        }
    }

    public static void main(String[] args) {
        new Q24FileColorChooser();
    }
}
