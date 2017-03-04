import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class User extends JFrame {

	private JPanel contentPane;	
	
	
	public User() {
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblFecha.setBounds(113, 37, 137, 45);
		contentPane.add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblHora.setBounds(113, 93, 110, 31);
		contentPane.add(lblHora);
		
		
		Calendar cal=Calendar.getInstance();
		
		String fecha=cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
		JLabel label = new JLabel("00/00/00");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.BOLD, 24));
		label.setBounds(233, 44, 259, 31);
		label.setText(fecha);
		contentPane.add(label);
		
		
		String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE);
		JLabel label_1 = new JLabel("00:00:00");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		label_1.setBounds(233, 93, 273, 31);
		label_1.setText(hora);
		contentPane.add(label_1);	
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton.setBounds(123, 194, 357, 31);
		contentPane.add(btnNewButton);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(User.class.getResource("/Imagen/degradado.jpg")));
		label_2.setBounds(0, 0, 584, 361);
		contentPane.add(label_2);
		
	}
}
