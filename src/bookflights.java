import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bookflights implements ActionListener {
    JFrame f = new JFrame();
    JTextArea textArea = new JTextArea();
    JButton b_r = new JButton("Return to home page");
    Font fo = new Font("arial", Font.BOLD, 20);
    static JTextField l2 = new JTextField("From Where?");
    static JTextField l3 = new JTextField("To Where?");
    static JTextField l4 = new JTextField("Depart Date(14/4/23)");
    static JTextField l5 = new JTextField("Arrival Date(24/4/23)");
    JButton l6 = new JButton("Search");

    bookflights() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1302, 629);

        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setTitle("bookflights");
        f.setLocationRelativeTo(null);

        b_r.setBounds(1002, 520, 250, 50);
        b_r.setOpaque(false);
        b_r.setForeground(Color.BLACK);
        b_r.setFocusable(false);
        b_r.addActionListener(this);
        f.add(b_r);

        ImageIcon backgroundImage = new ImageIcon("src\\book1.jpg");
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1302, 629);
        f.getContentPane().setLayout(null);
        f.getContentPane().add(background);
        f.setVisible(true);

        l2.setBounds(110, 170, 200, 50);
        l2.setFont(fo);
        l2.setOpaque(false);
        l2.setForeground(new Color(4, 118, 208));
        l2.setBackground(new Color(0, 0, 0, 0));
        l2.addActionListener(this);
        background.add(l2);

        l3.setBounds(330, 170, 200, 50);
        l3.setFont(fo);
        l3.setOpaque(false);
        l3.setForeground(new Color(4, 118, 208));
        l3.setBackground(new Color(0, 0, 0, 0));
        l3.addActionListener(this);
        background.add(l3);

        l4.setBounds(550, 170, 200, 50);
        l4.setFont(fo);
        l4.setOpaque(false);
        l4.setForeground(new Color(4, 118, 208));
        l4.setBackground(new Color(0, 0, 0, 0));
        l4.addActionListener(this);
        background.add(l4);

        l5.setBounds(770, 170, 200, 50);
        l5.setFont(fo);
        l5.setOpaque(false);
        l5.setForeground(new Color(4, 118, 208));
        l5.setBackground(new Color(0, 0, 0, 0));
        l5.addActionListener(this);
        background.add(l5);

        l6.setBounds(990, 170, 200, 50);
        l6.setFont(fo);
        l6.setForeground(Color.WHITE);
        l6.setBackground(Color.ORANGE);
        l6.setFocusable(false);
        l6.addActionListener(this);
        background.add(l6);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b_r) {
            f.dispose();
            LaunchPage ch_fl = new LaunchPage();
        } else if (e.getSource() == l2) {
            l2.setText("");
        } else if (e.getSource() == l3) {
            l3.setText("");
        } else if (e.getSource() == l4) {
            l4.setText("");
        } else if (e.getSource() == l5) {
            l5.setText("");
        }
        else if (e.getSource() == l6) {
            f.dispose();
            select_flight select_fl = new select_flight();
        }



    }

    public static void main(String[] args) {
        new bookflights();
    }
}
