import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JCheckBox;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private ImageIcon image1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	

	/**
	 * Create the frame.
	 */
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(32,32,32));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblUsername = new JLabel("Benutzername:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(24, 83, 107, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Passwort:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(24, 133, 107, 28);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(130, 87, 141, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 137, 141, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setBounds(157, 168, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel label = new JLabel("");
		label.setBounds(298, 83, 89, 130);
		contentPane.add(label);
		
		
		Image img = new ImageIcon(this.getClass().getResource("/logoMorph.png")).getImage();
	
		label.setIcon(new ImageIcon(img));
		
		Button button = new Button("Registrieren ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(157, 202, 89, 23);
		
		contentPane.add(button);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



	
}
