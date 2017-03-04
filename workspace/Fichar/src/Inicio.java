import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;



public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Inicio() {
		setTitle("FICHAPP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				LoginUser lg= new LoginUser();
				lg.setVisible(true);
				Inicio.this.dispose();
			}
		});
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				LoginAdmin lg= new LoginAdmin();
				lg.setVisible(true);
				Inicio.this.dispose();
			}
		});
		btnAdmin.setBounds(126, 113, 322, 31);
		contentPane.add(btnAdmin);
		
		
		btnUser.setBounds(126, 178, 322, 31);
		contentPane.add(btnUser);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(246, 235, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Inicio.class.getResource("/Imagen/degradado.jpg")));
		label.setBounds(0, -18, 600, 379);
		contentPane.add(label);
	}
}
