import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() 
	{

		
		setFont(new Font("Arial", Font.BOLD, 16));
		setResizable(false);
		setTitle("Shivam Traders Billing Software");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1376, 777);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/img/login ani.gif")));
		lblNewLabel_1.setBounds(986, 259, 280, 100);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(970, 370, 100, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3.setBounds(970, 420, 100, 25);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField("madhav");
		textField.setBounds(1100, 370, 150, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField("kapoor");
		passwordField.setBounds(1100, 420, 150, 25);
		contentPane.add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(970, 470, 200, 20);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				Connection con = null;
			    Statement stmt = null;
			    ResultSet rs = null;
			    // JButton1 Code starts from here
			    try {
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        con = DriverManager.getConnection(
			            "jdbc:mysql://localhost:3307/libraryManagement?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root",
			            "");
			        stmt = con.createStatement();
			        String uname = textField.getText();
			        String pass = passwordField.getText();

//			        String INSERT = "INSERT INTO loginData VALUES('"+uname+"','"+pass+"');";
			        String query = "select * from loginData where username=\"madhav\"";
			        rs=stmt.executeQuery(query);
			        while(rs.next())
			        {
			        	if(rs.getString("username")==textField.getText());
			        	{
			        		JOptionPane.showMessageDialog(
						            null, rs.getString(2));
			        		setVisible(false);
							new Home().setVisible(true);
			        	}
			        }
			        
			        
			    }
			    catch (Exception ex) {
			    	JOptionPane.showMessageDialog(null,ex); 
			    }
				
				/*
				 * if(textField.getText().equals("madhav") &&
				 * passwordField.getText().equals("kumar")) {
				 * 
				 * } else {
				 * JOptionPane.showMessageDialog(null,"Incorrect Username or Password"); }
				 */
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Login.class.getResource("/img/login.png")));
		btnNewButton_1.setBounds(970, 520, 130, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do You Want To Close","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setIcon(new ImageIcon(Login.class.getResource("/img/close Jframe.png")));
		btnNewButton_2.setBounds(1120, 520, 130, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Login.class.getResource("/img/login background.PNG")));
		lblNewLabel_4.setBounds(0, 0, 1366, 767);
		contentPane.add(lblNewLabel_4);
		
		
	}
}
