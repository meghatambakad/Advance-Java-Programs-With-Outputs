// 5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
// display the concerned color whenever the specific tab is selected in the Pan

package assignment;

import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane {
    public ColorTabbedPane() {
        JFrame frame = new JFrame("Tabbed CMY Colors");
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        frame.add(tabbedPane);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}


