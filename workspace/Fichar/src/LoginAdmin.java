import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;

public class LoginAdmin extends JFrame {

	private JPanel contentPane;
	public static JTextField username;
	private JLabel label;
	public  static JPasswordField pass;	

	/**
	 * Create the frame.
	 */
	public LoginAdmin() {
		setTitle("LoginAdmin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(127, 80, 126, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(127, 134, 149, 28);
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(319, 95, 163, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(319, 142, 163, 20);
		contentPane.add(pass);
		
		final DatosLogin d= new DatosLogin();
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(d.probarpass()==1){
					
					Admin a= new Admin();
					a.setVisible(true);
				    LoginAdmin.this.dispose();
				}
				else{JOptionPane.showMessageDialog(null, "Te estás equivocando..");}
				
			}
		});
		btnAceptar.setBounds(189, 221, 220, 23);
		contentPane.add(btnAceptar);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(LoginAdmin.class.getResource("/Imagen/degradado.jpg")));
		label.setBounds(0, 0, 584, 361);
		contentPane.add(label);
		
		
		

	}}
