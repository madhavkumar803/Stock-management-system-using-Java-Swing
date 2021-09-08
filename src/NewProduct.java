import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.sql.*;
import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewProduct extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
					NewProduct frame = new NewProduct();
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
	public NewProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(NewProduct.class.getResource("/img/New Product ani.gif")));
		lblNewLabel.setBounds(118, 10, 280, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(NewProduct.class.getResource("/img/new product.png")));
		lblNewLabel_1.setBounds(35, 0, 73, 75);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 85, 423, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Product Id");
		lblNewLabel_2.setBounds(35, 110, 88, 13);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 136, 423, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Product Name");
		lblNewLabel_3.setBounds(35, 148, 102, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 148, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Rate");
		lblNewLabel_4.setBounds(35, 197, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(147, 192, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Description");
		lblNewLabel_5.setBounds(35, 250, 50, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(147, 247, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Activate");
		lblNewLabel_6.setBounds(35, 288, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("100");
		lblNewLabel_7.setBounds(147, 110, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		comboBox.setBounds(147, 284, 96, 21);
		contentPane.add(comboBox);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 329, 423, 13);
		contentPane.add(separator_2);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pId=lblNewLabel_7.getText();
				String pName=lblNewLabel_7.getText();
				String rate=lblNewLabel_7.getText();
				String description=lblNewLabel_7.getText();
				String activate=(String)comboBox.getSelectedItem();
			try
			{
				Connection con=ConnectionProvider.getcon();
				Statement st=con.createStatement();
				st.executeUpdate("insert into product values('"+pId+"','"+pName+"','"+rate+"','"+description+"','"+activate+"')");
				JOptionPane.showMessageDialog(null,"successfully updated");
				setVisible(false);
				new NewProduct().setVisible(true);
			}
			catch (Exception e1)
			{
				JOptionPane.showMessageDialog(null,e);
			}
		}});
		btnNewButton.setIcon(new ImageIcon(NewProduct.class.getResource("/img/save.png")));
		btnNewButton.setBounds(23, 387, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new NewProduct().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(NewProduct.class.getResource("/img/Reset.png")));
		btnNewButton_1.setBounds(158, 387, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.setIcon(new ImageIcon(NewProduct.class.getResource("/img/close Jframe.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(296, 387, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(NewProduct.class.getResource("/img/all page background image.png")));
		lblNewLabel_8.setBounds(0, 0, 443, 450);
		contentPane.add(lblNewLabel_8);
	}
}
