
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class view extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSN;
	private JTextField txtDirectory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
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
	public view() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSN = new JTextField();
		txtSN.setBounds(10, 44, 86, 20);
		contentPane.add(txtSN);
		txtSN.setColumns(10);
		txtSN.setDocument(new limitador());
		
		JLabel lblNewLabel = new JLabel("SN:");
		lblNewLabel.setBounds(10, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Gerar");
		btnNewButton.setBounds(103, 44, 72, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				generate.realiza(txtDirectory.getText(),txtSN.getText()); //select Directory and the SN
				JOptionPane.showMessageDialog(null, "Conversão realizada com sucesso!"); 
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Gerador de n\u00FAmero de s\u00E9rie");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 0, 197, 20);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setForeground(Color.BLUE);
		panel.setBounds(0, 0, 317, 20);
		contentPane.add(panel);
		
		JButton directory = new JButton("Abrir");
		directory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); 
				fileChooser.setDialogTitle("Selecionar diretório"); //message in window
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // only accept directory 
				int retorno = fileChooser.showOpenDialog(directory); // check file
				
				if(retorno == JFileChooser.APPROVE_OPTION) { // if is OK in file, set message in Field Text
					
					File file = fileChooser.getSelectedFile(); 
					txtDirectory.setText(file.getPath()); //set in the field
					
				}
				
				
			}
		});
		directory.setBounds(217, 100, 65, 23);
		contentPane.add(directory);
		
		txtDirectory = new JTextField();
		txtDirectory.setBounds(10, 101, 197, 20);
		contentPane.add(txtDirectory);
		txtDirectory.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Caminho:");
		lblNewLabel_2.setBounds(10, 85, 58, 14);
		contentPane.add(lblNewLabel_2);
	}
}
