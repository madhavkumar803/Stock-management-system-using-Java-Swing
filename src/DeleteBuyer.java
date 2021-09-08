import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.sql.*;
import Project.ConnectionProvider;

public class DeleteBuyer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteBuyer frame = new DeleteBuyer();
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
	public DeleteBuyer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DeleteBuyer.class.getResource("/img/Delete buyer ani.gif")));
		lblNewLabel.setBounds(107, 10, 221, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DeleteBuyer.class.getResource("/img/delete buyer.png")));
		lblNewLabel_1.setBounds(10, 10, 68, 65);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 85, 406, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Contact No");
		lblNewLabel_2.setBounds(10, 97, 68, 13);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(75, 97, 218, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contactNo=JTextField.getText();
				try
				{
					Connection con=ConnectionProvider.getcon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from buyer");
					if(rs.next())
					{
						textField_1.setText(rs.getString(1));
						textField_2.setText(rs.getString(2));
						textField_3.setText(rs.getString(3));
						textField_4.setText(rs.getString(4));
						textField_5.setText(rs.getString(5));
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Contact No does't exist");
					}
				}
				catch(Exception e)
				{
					
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(DeleteBuyer.class.getResource("/img/search.png")));
		btnNewButton.setBounds(303, 97, 105, 21);
		contentPane.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 138, 416, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setBounds(10, 150, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contact No");
		lblNewLabel_4.setBounds(10, 223, 68, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(10, 292, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setBounds(10, 334, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		lblNewLabel_7.setBounds(10, 362, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 150, 185, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(82, 220, 192, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 289, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(93, 331, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(93, 359, 96, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 397, 445, 2);
		contentPane.add(separator_2);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you want to delete","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					try
					{
						Connection con=ConnectionProvider.getcon();
						Statement st=con.createStatement();
						st.executeUpdate("delete * fron buyer");
						setVisible(false);
						new DeleteBuyer().setVisible(true);
					}
					catch(exception e)
					{
						
					}
							
							
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(DeleteBuyer.class.getResource("/img/delete.png")));
		btnNewButton_1.setBounds(31, 450, 119, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new DeleteBuyer().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(DeleteBuyer.class.getResource("/img/Reset.png")));
		btnNewButton_2.setBounds(174, 450, 119, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(DeleteBuyer.class.getResource("/img/close Jframe.png")));
		btnNewButton_3.setBounds(323, 450, 103, 21);
		contentPane.add(btnNewButton_3);
	}
}
