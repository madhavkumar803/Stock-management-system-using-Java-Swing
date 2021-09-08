import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import Project.ConnectionProvider;

public class UpdateProduct extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProduct frame = new UpdateProduct();
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
	public UpdateProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UpdateProduct.class.getResource("/img/update product.png")));
		lblNewLabel.setBounds(34, 10, 68, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(UpdateProduct.class.getResource("/img/update product ani.gif")));
		lblNewLabel_1.setBounds(123, 10, 296, 51);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 89, 443, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 118, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(108, 115, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pId=textField.getText();
				try
				{
					Connection con=ConnectionProvider.getcon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from product");
					
					if(rs.next())
					{
						textField_1.setText(rs.getString(1));
						textField_2.setText(rs.getString(2));
						textField_3.setText(rs.getString(3));
						textField_4.setText(rs.getString(4));
						textField.setEditable(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Product Id does't exist");
					}
				}
				catch(Exception e1)
				{
					
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(UpdateProduct.class.getResource("/img/search.png")));
		btnNewButton.setBounds(283, 114, 118, 21);
		contentPane.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 154, 443, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Produvt Name");
		lblNewLabel_3.setBounds(10, 189, 92, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 186, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Rate");
		lblNewLabel_4.setBounds(10, 231, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 225, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Description");
		lblNewLabel_5.setBounds(10, 282, 92, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(123, 279, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Activate");
		lblNewLabel_6.setBounds(10, 332, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(131, 329, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 375, 443, 2);
		contentPane.add(separator_2);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pId=textField.getText();
				String pName=textField_1.getText();
				String rate=textField_2.getText();
				String description=textField_3.getText();
				String activate=textField_4.getText();
				try
				{
					Connection con=ConnectionProvider.getcon();
					Statement st=con.createStatement();
					st.executeUpdate("update product set pName='"+pName+"',rate='"+rate+"',description='"+description+"',activate='"+activate+"'");
					JOptionPane.showMessageDialog(null, "Successfully Updated");
					setVisible(false);
					new UpdateProduct().setVisible(true);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(UpdateProduct.class.getResource("/img/save.png")));
		btnNewButton_1.setBounds(32, 417, 101, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new UpdateProduct().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(UpdateProduct.class.getResource("/img/Reset.png")));
		btnNewButton_2.setBounds(178, 417, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(UpdateProduct.class.getResource("/img/close Jframe.png")));
		btnNewButton_3.setBounds(316, 417, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(UpdateProduct.class.getResource("/img/all page background image.png")));
		lblNewLabel_7.setBounds(0, 0, 463, 461);
		contentPane.add(lblNewLabel_7);
	}
}
