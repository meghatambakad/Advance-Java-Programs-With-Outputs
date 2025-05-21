// 5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
// display the concerned color whenever the specific tab is selected in the Pan.

package assignment;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneExample {
    public TabbedPaneExample() {
        JFrame frame = new JFrame("Tabbed Color Panel");
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        tabbedPane.addTab("Red", redPanel);
        tabbedPane.addTab("Blue", bluePanel);
        tabbedPane.addTab("Green", greenPanel);

        frame.add(tabbedPane);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}
