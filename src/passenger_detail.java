import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class passenger_detail {
    JFrame frame = new JFrame();
    JLabel titleLabel = new JLabel("Passenger Details");
    JLabel nameLabel = new JLabel("Name:");
    JLabel phoneLabel = new JLabel("Phone No:");
    JLabel genderLabel = new JLabel("Gender:");
    JLabel dobLabel = new JLabel("Date of Birth:");
    JLabel ageLabel = new JLabel("Age:");
    JLabel emailLabel = new JLabel("Email:");
    JLabel cardNumberLabel = new JLabel("Card Number:");
    JLabel expiryDateLabel = new JLabel("Expiry Date:");
    JLabel cvvLabel = new JLabel("CVV:");
    static JTextField nameField = new JTextField();
    JTextField phoneField = new JTextField();
    JComboBox<String> genderComboBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
    JTextField dobField = new JTextField();
    JTextField ageField = new JTextField();
    JTextField emailField = new JTextField();
    JTextField cardNumberField = new JTextField();
    JTextField expiryDateField = new JTextField();
    JTextField cvvField = new JTextField();
    JButton payButton = new JButton("Pay");
    JLabel statusLabel = new JLabel("");

    public passenger_detail(String flightName) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Passenger Details");
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

        nameLabel.setBounds(50, 70, 100, 30);
        background.add(nameLabel);

        phoneLabel.setBounds(50, 120, 100, 30);
        background.add(phoneLabel);

        genderLabel.setBounds(50, 170, 100, 30);
        background.add(genderLabel);

        dobLabel.setBounds(50, 220, 100, 30);
        background.add(dobLabel);

        ageLabel.setBounds(50, 270, 100, 30);
        background.add(ageLabel);

        emailLabel.setBounds(50, 320, 100, 30);
        background.add(emailLabel);

        cardNumberLabel.setBounds(50, 370, 100, 30);
        background.add(cardNumberLabel);

        expiryDateLabel.setBounds(50, 420, 100, 30);
        background.add(expiryDateLabel);

        cvvLabel.setBounds(50, 470, 100, 30);
        background.add(cvvLabel);

        nameField.setBounds(180, 70, 250, 30);
        background.add(nameField);

        phoneField.setBounds(180, 120, 250, 30);
        background.add(phoneField);

        genderComboBox.setBounds(180, 170, 250, 30);
        background.add(genderComboBox);

        dobField.setBounds(180, 220, 250, 30);
        background.add(dobField);

        ageField.setBounds(180, 270, 250, 30);
        background.add(ageField);

        emailField.setBounds(180, 320, 250, 30);
        background.add(emailField);

        cardNumberField.setBounds(180, 370, 250, 30);
        background.add(cardNumberField);

        expiryDateField.setBounds(180, 420, 250, 30);
        background.add(expiryDateField);

        cvvField.setBounds(180, 470, 250, 30);
        background.add(cvvField);

        payButton.setBounds(200, 520, 100, 30);
        background.add(payButton);

        statusLabel.setBounds(180, 550, 300, 30);
        background.add(statusLabel);

        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                String gender = genderComboBox.getSelectedItem().toString();
                String dob = dobField.getText();
                String age = ageField.getText();
                String email = emailField.getText();
                String cardNumber = cardNumberField.getText();
                String expiryDate = expiryDateField.getText();
                String cvv = cvvField.getText();

                if (name.isEmpty() || phone.isEmpty() || gender.isEmpty() || dob.isEmpty() ||
                        age.isEmpty() || email.isEmpty() || cardNumber.isEmpty() || expiryDate.isEmpty() || cvv.isEmpty()) {
                    statusLabel.setText("Please fill in all the fields.");
                } else {
                    // Perform transaction and book the ticket
                    // You can add your own implementation here
                    statusLabel.setText("Transaction Successful. Ticket Booked!");
                    frame.dispose();
                    // Open a new window named "Daniyal"
                    printticket p_t = new printticket();

                }
            }
        });
    }

    public static void main(String[] args) {
        new passenger_detail("Flight 1");
    }
}
