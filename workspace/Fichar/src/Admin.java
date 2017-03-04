import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Admin() {
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Registro r= new Registro();
				r.setVisible(true);
				Admin.this.dispose();
			}
		});
		
		
		
		
		btnRegistro.setBounds(161, 85, 254, 39);
		contentPane.add(btnRegistro);
		
		JButton btnHistorial = new JButton("Historial");
		btnHistorial.setBounds(161, 154, 254, 39);
		contentPane.add(btnHistorial);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inicio i=new Inicio();
				i.setVisible(true);
				Admin.this.dispose();
				
			}
		});
		btnVolver.setIcon(new ImageIcon(Admin.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnVolver.setBounds(230, 237, 110, 32);
		contentPane.add(btnVolver);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Admin.class.getResource("/Imagen/degradado.jpg")));
		label.setBounds(0, 0, 584, 361);
		contentPane.add(label);
	}
}
