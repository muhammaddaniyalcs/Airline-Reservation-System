import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class printticket implements ActionListener {
    JFrame frame = new JFrame();
    JButton b_r = new JButton("Return to home page");
    JLabel titleLabel = new JLabel("Ticket");
    JLabel pnrLabel = new JLabel("PNR No:");
    JLabel seatLabel = new JLabel("Seat No:");
    JLabel nameLabel = new JLabel("Name:");
    JLabel departDateLabel = new JLabel("Departure Date:");

    int pnr =14874;
    int seatNo= 32;

    public printticket() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Ticket");
        frame.setLocationRelativeTo(null);

        ImageIcon backgroundImage = new ImageIcon("src\\pay.jpg");
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 485, 600);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(background);
        frame.setVisible(true);

        titleLabel.setBounds(180, 20, 200, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        background.add(titleLabel);

        pnrLabel.setBounds(50, 70, 400, 30);
        pnrLabel.setText("PNR No: " + pnr);
        background.add(pnrLabel);

        seatLabel.setBounds(50, 120, 400, 30);
        seatLabel.setText("Seat No: " + seatNo);
        background.add(seatLabel);

        nameLabel.setBounds(50, 170, 400, 30);
        nameLabel.setText("Name: " + passenger_detail.nameField.getText());
        background.add(nameLabel);

        departDateLabel.setBounds(50, 220, 400, 30);
        departDateLabel.setText("Departure Date: " + bookflights.l4.getText());
        background.add(departDateLabel);

        b_r.setBounds(310, 320, 170, 30);
        //b_r.setFont(fo);
        b_r.setOpaque(false);
        b_r.setForeground(Color.BLACK);
        b_r.setFocusable(false);
        b_r.addActionListener(this);
        background.add(b_r);


    }

    public static void main(String[] args) {
        new printticket();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b_r) {
            frame.dispose();
            LaunchPage L_P = new LaunchPage();
        }
    }
}
