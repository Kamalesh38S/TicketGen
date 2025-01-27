package BusTicket;

import java.awt.*;
import javax.swing.*;

interface BusRoute {
    public void busWay();
}

class Man implements BusRoute {
    private JFrame frame;
    private JPanel panel;

    public Man() {
        frame = new JFrame("Bus Ticket Generator");
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }

    public void busWay() {
        // Collecting user inputs using JOptionPane for GUI interaction
        String dateInput = JOptionPane.showInputDialog("Enter the date (DD):");
        String timeInput = JOptionPane.showInputDialog("Enter the time (HHMM):");

        int velam = 20;
        int ranipet = 10;
        int ammoor = 13;

        String busNum = "TN23N2386";
        String busNum2 = "T3B";
        String sno = "T No- 023174";
        String cash = "CASH";

        String[] options = {"Velam", "Ammoor", "Ranipet"};
        int number = JOptionPane.showOptionDialog(null, "Choose your route:", "Route Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        // Dynamic content based on the user's selection
        String route = "";
        int cost = 0;

        switch (number) {
            case 0:
                route = "VELAM to ARCOT";
                cost = velam;
                break;
            case 1:
                route = "AMMOOR to ARCOT";
                cost = ammoor;
                break;
            case 2:
                route = "RANIPET to ARCOT";
                cost = ranipet;
                break;
            default:
                JOptionPane.showMessageDialog(frame, "Invalid selection. Please restart.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        // Adding components to the panel
        panel.add(new JLabel("GOVERNMENT BUS", SwingConstants.CENTER));
        panel.add(new JLabel("Sholingar DEPOT", SwingConstants.CENTER));
        panel.add(new JLabel("Date: " + dateInput + "-12-2024"));
        panel.add(new JLabel("Time: " + timeInput));
        panel.add(new JLabel("Bus Number: " + busNum));
        panel.add(new JLabel("Bus Number 2: " + busNum2));
        panel.add(new JLabel("Serial No: " + sno));
        panel.add(new JLabel("Cash: " + cash));
        panel.add(new JLabel("Route: " + route));
        panel.add(new JLabel("Cost: RS " + cost));
        panel.add(new JLabel("**HAVE A GREAT RIDE**"));

        // Finalizing the frame
        frame.add(panel);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class Bus {
    public static void main(String[] args) {
        Man myMan = new Man();
        myMan.busWay();
    }
}
