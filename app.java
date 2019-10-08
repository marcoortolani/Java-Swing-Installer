import javax.swing.*;
public class app {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Installer");
        JButton button = new JButton("Install");
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}