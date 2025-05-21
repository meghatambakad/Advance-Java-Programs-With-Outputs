// 4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
// pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
// event handling mechanism with addActionListener( ).

package assignment;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// Class to demonstrate buttons with action handling in a Swing GUI
public class ButtonExample {
    
    JLabel l1; // Label to display the output when a button is pressed

    // Constructor
    ButtonExample() {
        // Creating a frame with a title
        JFrame f = new JFrame("Button Example");

        // Initializing the label
        l1 = new JLabel();
        l1.setBounds(50, 50, 700, 100); // Set position and size (x, y, width, height)
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 60)); // Set custom font

        // Creating buttons
        JButton b1 = new JButton(" India ");
        JButton b2 = new JButton(" Srilanka ");

        // Setting position and size of buttons
        b1.setBounds(100, 200, 100, 100);
        b2.setBounds(400, 200, 100, 100);

        // Adding action listener to button 1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("India is pressed");
            }
        });

        // Adding action listener to button 2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("SriLanka is pressed");
            }
        });

        // Adding components to the frame
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // Setting frame size and layout
        f.setSize(800, 400); // Increased width to fit long label text
        f.setLayout(null);   // Using no layout manager (absolute positioning)
        f.setVisible(true);  // Make frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on exit
    }

    // Main method to run the program
    public static void main(String[] args) {
        new ButtonExample(); // Create an instance of ButtonExample
    }
}
