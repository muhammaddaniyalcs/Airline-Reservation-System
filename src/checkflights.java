import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class checkflights implements ActionListener {
    JFrame f = new JFrame();
    JTextArea textArea = new JTextArea();
    JButton b_r = new JButton("Return to home page");

    checkflights() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(650, 620);

        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setTitle("Check_Flights");
        f.setLocationRelativeTo(null);

        // Set the bounds for the JTextArea
        textArea.setBounds(15, 10, 600, 490);
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(new Color(4, 118, 208));
        f.add(textArea);

        b_r.setBounds(350, 520, 250, 50);
        //b_r.setFont(fo);
        b_r.setOpaque(false);
        b_r.setForeground(Color.BLACK);
        b_r.setFocusable(false);
        b_r.addActionListener(this);
        f.add(b_r);


        // Read the content of the text file
        try {
            File file = new File("src\\file.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            br.close();

            // Set the content of the JTextArea to the text read from the file
            textArea.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b_r) {
            f.dispose();
            LaunchPage L_P = new LaunchPage();
        }

    }

    public static void main(String[] args) {
        new checkflights();
    }
}
