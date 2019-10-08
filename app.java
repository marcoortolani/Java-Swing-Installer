import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class app {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Installer");
        JButton button = new JButton("Install");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProcessBuilder pb = new ProcessBuilder("bash","install.bash");
                try {
                    Process p = pb.start();
                    try {
						p.waitFor();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(frame,"Done!");
                } catch (IOException ee) {
                    ee.printStackTrace();
                }
            }
        });
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}