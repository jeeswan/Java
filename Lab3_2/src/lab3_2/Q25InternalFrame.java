/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_2;

/**
 *
 * @author wildflower
 */
import javax.swing.*;

public class Q25InternalFrame extends JFrame {
    public Q25InternalFrame() {
        setTitle("Internal Frame Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Desktop pane
        JDesktopPane desktop = new JDesktopPane();
        add(desktop);

        // One internal frame
        JInternalFrame internal = new JInternalFrame("Internal Frame", true, true, true, true);
        internal.setSize(200, 150);
        internal.setVisible(true);

        // Add to desktop
        desktop.add(internal);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q25InternalFrame();
    }
}