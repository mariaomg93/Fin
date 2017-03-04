import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;



	/**
	 * Create the frame.
	 */
	public Registro() {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNombre.setBounds(66, 60, 188, 28);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido 1");
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblApellido.setBounds(66, 99, 188, 36);
		contentPane.add(lblApellido);
		
		JLabel lblApellido_1 = new JLabel("Apellido 2");
		lblApellido_1.setForeground(Color.WHITE);
		lblApellido_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblApellido_1.setBounds(66, 146, 153, 38);
		contentPane.add(lblApellido_1);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblDni.setBounds(67, 201, 94, 21);
		contentPane.add(lblDni);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin a= new Admin();
				a.setVisible(true);
				Registro.this.dispose();
				
			}
		});
		btnGuardar.setBounds(108, 267, 335, 23);
		contentPane.add(btnGuardar);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textField.setBounds(302, 68, 173, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textField_1.setBounds(302, 111, 173, 37);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textField_2.setBounds(302, 159, 173, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textField_3.setBounds(302, 202, 173, 36);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Registro.class.getResource("/Imagen/degradado.jpg")));
		label.setBounds(0, 0, 584, 361);
		contentPane.add(label);
	}
}
