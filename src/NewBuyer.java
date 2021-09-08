

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import Project.ConnectionProvider;
import java.sql.*;

public class NewBuyer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBuyer frame = new NewBuyer();
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
	public NewBuyer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(NewBuyer.class.getResource("/img/New buyer ani.gif")));
		lblNewLabel.setBounds(141, 10, 288, 84);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(NewBuyer.class.getResource("/img/new buyer.png")));
		lblNewLabel_1.setBounds(37, 10, 94, 84);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 255, 0));
		separator.setBounds(10, 89, 571, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(114, 148, 100, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contact No");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(114, 178, 100, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(114, 208, 100, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(114, 238, 100, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(114, 277, 100, 20);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(246, 149, 202, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(246, 179, 202, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(246, 209, 202, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(246, 239, 202, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setBounds(246, 277, 202, 20);
		contentPane.add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 255, 0));
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(24, 341, 557, 14);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String contactNo=textField_1.getText();
				String email=textField_2.getText();
				String address=textField_3.getText();
				String gender=(String)comboBox.getSelectedItem();
				try {
					Connection con=ConnectionProvider.getcon();
					Statement st=con.createStatement();
					st.executeUpdate("insert into buyer values('"+name+"','"+contactNo+"','"+email+"','"+address+"','"+gender+"')");
					JOptionPane.showMessageDialog(null, "Successfully Updated");
					setVisible(false);
					new NewBuyer().setVisible(true);
				}
				catch(Exception ae) 
				{
					JOptionPane.showMessageDialog(null, "Mobile number is already exist");
				}
			}
		});
		
		btnNewButton.setIcon(new ImageIcon(NewBuyer.class.getResource("/img/save.png")));
		btnNewButton.setBounds(129, 365, 100, 20);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(NewBuyer.class.getResource("/img/Reset.png")));
		btnNewButton_1.setBounds(262, 365, 100, 20);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(NewBuyer.class.getResource("/img/close Jframe.png")));
		btnNewButton_2.setBounds(390, 365, 100, 20);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(NewBuyer.class.getResource("/img/all page background image.png")));
		lblNewLabel_7.setBounds(0, 0, 600, 450);
		contentPane.add(lblNewLabel_7);
	}
}
