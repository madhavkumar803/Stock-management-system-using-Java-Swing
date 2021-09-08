import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Project.ConnectionProvider;

public class Billing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private final JSeparator separator_2 = new JSeparator();
	private JTable table;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Billing.class.getResource("/img/billing frame.png")));
		lblNewLabel.setBounds(10, 10, 65, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Billing.class.getResource("/img/Billing ani.gif")));
		lblNewLabel_1.setBounds(87, 10, 153, 71);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 101, 416, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(326, 10, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(381, 10, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(326, 66, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(381, 66, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Buyer Details:");
		lblNewLabel_6.setBounds(21, 156, 65, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Name");
		lblNewLabel_7.setBounds(10, 197, 36, 13);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=ConnectionProvider.getcon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from buyer");
					if(rs.next())
					{
						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
					}
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		textField.setBounds(59, 194, 30, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Contact No");
		lblNewLabel_8.setBounds(99, 197, 45, 13);
		contentPane.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 194, 45, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Email");
		lblNewLabel_9.setBounds(209, 197, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		textField_2 = new JTextField();
		textField_2.setBounds(253, 194, 36, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Address");
		lblNewLabel_10.setBounds(299, 197, 45, 13);
		contentPane.add(lblNewLabel_10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(342, 194, 65, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 228, 416, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_11 = new JLabel("Product Details:");
		lblNewLabel_11.setBounds(10, 241, 107, 13);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Product ID");
		lblNewLabel_12.setBounds(10, 265, 65, 13);
		contentPane.add(lblNewLabel_12);
		
		textField_4 = new JTextField();
		textField_4.setBounds(66, 264, 22, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Product Name");
		lblNewLabel_13.setBounds(99, 265, 45, 13);
		contentPane.add(lblNewLabel_13);
		
		textField_5 = new JTextField();
		textField_5.setBounds(154, 262, 30, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Rate");
		lblNewLabel_14.setBounds(194, 265, 45, 13);
		contentPane.add(lblNewLabel_14);
		
		textField_6 = new JTextField();
		textField_6.setBounds(217, 262, 36, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Quantity");
		lblNewLabel_15.setBounds(264, 265, 45, 13);
		contentPane.add(lblNewLabel_15);
		
		textField_7 = new JTextField();
		textField_7.setBounds(305, 262, 36, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Description");
		lblNewLabel_16.setBounds(346, 265, 45, 13);
		contentPane.add(lblNewLabel_16);
		
		textField_8 = new JTextField();
		textField_8.setBounds(404, 262, 22, 19);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setIcon(new ImageIcon(Billing.class.getResource("/img/add.png")));
		btnNewButton.setBounds(346, 303, 85, 21);
		contentPane.add(btnNewButton);
		separator_2.setBounds(10, 334, 426, 2);
		contentPane.add(separator_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Name", "Description", "Rate", "Quantity", "Total"
			}
		));
		table.setBounds(3, 346, 243, 235);
		contentPane.add(table);
		
		JLabel lblNewLabel_17 = new JLabel("Calculated Details:");
		lblNewLabel_17.setBounds(253, 359, 45, 13);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Total");
		lblNewLabel_18.setBounds(253, 389, 45, 13);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Paid Amount");
		lblNewLabel_19.setBounds(253, 412, 45, 13);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("return Amount");
		lblNewLabel_20.setBounds(253, 444, 45, 13);
		contentPane.add(lblNewLabel_20);
		
		textField_9 = new JTextField();
		textField_9.setBounds(295, 386, 50, 19);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(299, 412, 45, 19);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(299, 435, 45, 19);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setIcon(new ImageIcon(Billing.class.getResource("/img/save.png")));
		btnNewButton_1.setBounds(376, 385, 50, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setIcon(new ImageIcon(Billing.class.getResource("/img/Reset.png")));
		btnNewButton_2.setBounds(376, 408, 50, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.setIcon(new ImageIcon(Billing.class.getResource("/img/close Jframe.png")));
		btnNewButton_3.setBounds(381, 440, 45, 21);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(Billing.class.getResource("/img/billing background.png")));
		lblNewLabel_21.setBounds(3, 0, 433, 516);
		contentPane.add(lblNewLabel_21);
	}

}
