package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	
	Double valor1, valor2;
	String sinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 405); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResultado.setText(txtResultado.getText()+"7");
			}
		});
		btnNewButton.setBounds(10, 131, 59, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"8");
			}
		});
		btnNewButton_1.setBounds(79, 131, 59, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"9");
			}
		});
		btnNewButton_2.setBounds(148, 131, 59, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
			}
		});
		btnNewButton_3.setBounds(217, 131, 59, 42);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "soma";
				
			}
		});
		btnNewButton_4.setBounds(286, 131, 59, 42);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"4");
			}
		});
		btnNewButton_5.setBounds(10, 184, 59, 42);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"5");
			}
		});
		btnNewButton_1_1.setBounds(79, 184, 59, 42);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"6");
			}
		});
		btnNewButton_2_1.setBounds(148, 184, 59, 42);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("C");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = null;
				valor2 = null;
				txtResultado.setText("");
			}
		});
		btnNewButton_3_1.setBounds(217, 184, 59, 42);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("-");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "menos";
			}
		});
		btnNewButton_4_1.setBounds(286, 184, 59, 42);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"1");
			}
		});
		btnNewButton_6.setBounds(10, 237, 59, 42);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"2");
			}
		});
		btnNewButton_1_2.setBounds(79, 237, 59, 42);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"3");
			}
		});
		btnNewButton_2_2.setBounds(148, 237, 59, 42);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("=");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtResultado.getText());
				if(sinal == "soma") {
					txtResultado.setText(String.valueOf(valor1+valor2));	
				} else if(sinal == "menos") {
						txtResultado.setText(String.valueOf(valor1 - valor2));
				}else if(sinal == "multiplica") {
							txtResultado.setText(String.valueOf(valor1*valor2));
						
				} else if(sinal == "divide") {
					txtResultado.setText(String.valueOf(valor1/valor2));
			}}
		});
		btnNewButton_3_2.setBounds(217, 237, 59, 95);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton("*");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "multiplica";
			}
		});
		btnNewButton_4_2.setBounds(286, 237, 59, 42);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"0");
			}
		});
		btnNewButton_7.setBounds(10, 290, 128, 42);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_1_3 = new JButton(".");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+".");
			}
		});
		btnNewButton_1_3.setBounds(148, 290, 59, 42);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_4_3 = new JButton("/");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "divide";
			}
		});
		btnNewButton_4_3.setBounds(286, 290, 59, 42);
		contentPane.add(btnNewButton_4_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(10, 11, 340, 71);
		contentPane.add(panel);
		panel.setLayout(new MigLayout("", "[340px]", "[71px]"));
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		panel.add(lblNewLabel, "cell 0 0,alignx center,growy");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.WHITE);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(10, 100, 335, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}
}
