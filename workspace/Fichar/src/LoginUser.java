import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class LoginUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label;


	/**
	 * Create the frame.
	 */
	public LoginUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("DNI");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblUsuario.setBounds(122, 118, 105, 28);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textField.setBounds(250, 119, 201, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				User u= new User();
				u.setVisible(true);
				LoginUser.this.dispose();
				
			}
		});
		btnAceptar.setBounds(150, 267, 288, 23);
		contentPane.add(btnAceptar);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(LoginUser.class.getResource("/Imagen/degradado.jpg")));
		label.setBounds(0, 0, 584, 361);
		contentPane.add(label);
	}

}
