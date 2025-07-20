import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class select_flight {

    JFrame f = new JFrame();
    JButton b_r = new JButton("Return to Book Flight page");
    Font fo = new Font("arial", Font.BOLD, 20);

    select_flight() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1302, 629);

        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setTitle("select_flight");
        f.setLocationRelativeTo(null);

        ImageIcon backgroundImage = new ImageIcon("src\\book1.jpg");
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1302, 629);
        f.getContentPane().setLayout(null);
        f.getContentPane().add(background);
        f.setVisible(true);

        b_r.setBounds(1002, 520, 250, 50);
        b_r.setOpaque(false);
        b_r.setForeground(Color.BLACK);
        b_r.setFocusable(false);
        b_r.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                bookflights bf = new bookflights();
            }
        });
        background.add(b_r);

        JLabel label1 = new JLabel("Flight Found");
        label1.setBounds(550, 30, 400, 50);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        background.add(label1);

        JLabel label2 = new JLabel("From: " + bookflights.l2.getText());
        JLabel label3 = new JLabel("To: " + bookflights.l3.getText());
        JLabel label4 = new JLabel("Departure Date: " + bookflights.l4.getText());
        JLabel label5 = new JLabel("Arrival Date: " + bookflights.l5.getText());

        label2.setBounds(100, 130, 400, 30);
        label2.setFont(fo);
        background.add(label2);

        label3.setBounds(320, 130, 400, 30);
        label3.setFont(fo);
        background.add(label3);

        label4.setBounds(500, 130, 400, 30);
        label4.setFont(fo);
        background.add(label4);

        label5.setBounds(900, 130, 400, 30);
        label5.setFont(fo);
        background.add(label5);

        JButton select1 = new JButton("Select");
        select1.setBounds(100, 200, 100, 30);
        select1.setBackground(Color.YELLOW);
        select1.setFocusable(false);
        select1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                passenger_detail pd = new passenger_detail("Flight 1");
            }
        });
        background.add(select1);

        JLabel flight1 = new JLabel("Flight 1");
        flight1.setBounds(250, 200, 400, 30);
        flight1.setFont(fo);
        background.add(flight1);

        JLabel airline1 = new JLabel("Airline: PIA Airways");
        airline1.setBounds(250, 250, 400, 30);
        airline1.setFont(fo);
        background.add(airline1);

        JLabel departureTime1 = new JLabel("Departure Time: 10:00 AM");
        departureTime1.setBounds(250, 300, 400, 30);
        departureTime1.setFont(fo);
        background.add(departureTime1);

        JLabel arrivalTime1 = new JLabel("Arrival Time: 12:00 PM");
        arrivalTime1.setBounds(250, 350, 400, 30);
        arrivalTime1.setFont(fo);
        background.add(arrivalTime1);

        JLabel price1 = new JLabel("Price: 5000 RS");
        price1.setBounds(250, 400, 400, 30);
        price1.setFont(fo);
        background.add(price1);

        JButton select2 = new JButton("Select");
        select2.setBounds(700, 200, 100, 30);
        select2.setBackground(Color.YELLOW);
        select2.setFocusable(false);
        select2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                passenger_detail pd = new passenger_detail("Flight 2");
            }
        });
        background.add(select2);

        JLabel flight2 = new JLabel("Flight 2");
        flight2.setBounds(850, 200, 400, 30);
        flight2.setFont(fo);
        background.add(flight2);

        JLabel airline2 = new JLabel("Airline: Serene Airline");
        airline2.setBounds(850, 250, 400, 30);
        airline2.setFont(fo);
        background.add(airline2);

        JLabel departureTime2 = new JLabel("Departure Time: 2:30 PM");
        departureTime2.setBounds(850, 300, 400, 30);
        departureTime2.setFont(fo);
        background.add(departureTime2);

        JLabel arrivalTime2 = new JLabel("Arrival Time: 5:00 PM");
        arrivalTime2.setBounds(850, 350, 400, 30);
        arrivalTime2.setFont(fo);
        background.add(arrivalTime2);

        JLabel price2 = new JLabel("Price: 4500 RS");
        price2.setBounds(850, 400, 400, 30);
        price2.setFont(fo);
        background.add(price2);

        // Add more flights as needed
    }

    public static void main(String[] args) {
        new select_flight();
    }
}
