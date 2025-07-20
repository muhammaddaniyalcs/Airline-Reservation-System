import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener{

    JFrame f = new JFrame();

    Font f1 = new Font("Montserrat",Font.BOLD,30);
    Font fo = new Font("arial",Font.BOLD,20);
    JButton l2 = new JButton("To check flights: ");
    JButton l3 = new JButton("To book flight: ");
    JButton l4 = new JButton("To print ticket ");


    LaunchPage(){


        f.setVisible(true);
        f.setSize(1240, 601);
        f.setResizable(false);
        f.setTitle("Project");
        f.setLocationRelativeTo(null); // Center the frame on the screen
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        ImageIcon backgroundImage = new ImageIcon("src\\ticket1.jpg");
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1240, 601);
        f.getContentPane().setLayout(null);
        f.getContentPane().add(background);
        f.setVisible(true);






        l2.setBounds(110,220,300,50);
        l2.setFont(fo);
        l2.setOpaque(false);
        l2.setForeground(Color.BLACK);
        l2.setBackground(new Color(0,0,0,0));
        l2.setFocusable(false);
        l2.addActionListener(this);
        background.add(l2);


        l3.setForeground(Color.BLACK);
        l3.setBounds(110,310,300,50);
        l3.setFont(fo);
        l3.setOpaque(false);
        l3.setBackground(new Color(0,0,0,0));
        l3.setFocusable(false);
        l3.addActionListener(this);
        background.add(l3);


        l4.setBounds(110,400,300,50);
        l4.setFont(fo);
        l4.setOpaque(false);
        l4.setForeground(Color.BLACK);
        l4.setBackground(new Color(0,0,0,0));
        l4.setFocusable(false);
        l4.addActionListener(this);
        background.add(l4);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==l2) {
            f.dispose();
            checkflights ch_fl = new checkflights();
        }
        if(e.getSource()==l3) {
            f.dispose();
            bookflights bo_fl = new bookflights();
        }
        if(e.getSource()==l4) {
            f.dispose();
            printticket pr_ti = new printticket();
        }

    }
}