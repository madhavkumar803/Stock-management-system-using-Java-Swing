

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Home extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,btnNewButton_10,btnNewButton_11,btnNewButton_12;
	JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7,lblNewLabel_8,lblNewLabel_9,lblNewLabel_10,lblNewLabel_11,lblNewLabel_12;
	
	private JPanel contentPane;
	private int z=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		/*btnNewButton.setVisible(false);
		btnNewButton_1.setVisible(false);
		btnNewButton_2.setVisible(false);
		btnNewButton_3.setVisible(false);
		btnNewButton_4.setVisible(false);
		btnNewButton_5.setVisible(false);
		btnNewButton_6.setVisible(false);
		btnNewButton_7.setVisible(false);
		btnNewButton_8.setVisible(false);
		btnNewButton_9.setVisible(false);
		btnNewButton_10.setVisible(false);
		btnNewButton_11.setVisible(false);
		
		lblNewLabel.setVisible(false);
		lblNewLabel_1.setVisible(false);
		lblNewLabel_2.setVisible(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_7.setVisible(false);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_9.setVisible(false);
		lblNewLabel_10.setVisible(false);
		lblNewLabel_11.setVisible(false);*/
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1376, 777);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//--------------------------------------------------------------------------Button Start---------------------------------------------------------------------------//
		
		btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 10, 90, 100);
		btnNewButton.setIcon(new ImageIcon(Home.class.getResource("/img/control hide and show.png")));
		contentPane.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(z==0) 
				{
					try {
						Thread.sleep(250);
						btnNewButton.setVisible(true);
					}
					catch(Exception e1) {
				
					}
				}
				else {
					
				}
				
			}});
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NewBuyer().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(110, 10, 100, 100);
		btnNewButton_1.setIcon(new ImageIcon(Home.class.getResource("/img/new buyer.png")));
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
			}
		});
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UpdateBuyer().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(220, 10, 100, 100);
		btnNewButton_2.setIcon(new ImageIcon(Home.class.getResource("/img/Update buyer.png")));
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BuyerDetails().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(330, 10, 100, 100);
		btnNewButton_3.setIcon(new ImageIcon(Home.class.getResource("/img/buyer Details.png")));
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteBuyer().setVisible(true);
			}
		});
		btnNewButton_4.setBounds(440, 10, 100, 100);
		btnNewButton_4.setIcon(new ImageIcon(Home.class.getResource("/img/delete buyer.png")));
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				new Home();
			}
		});
		btnNewButton_5.setBounds(660, 10, 100, 100);
		btnNewButton_5.setIcon(new ImageIcon(Home.class.getResource("/img/update product.png")));
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NewProduct().setVisible(true);
			}
		});
		btnNewButton_6.setBounds(550, 10, 100, 100);
		btnNewButton_6.setIcon(new ImageIcon(Home.class.getResource("/img/new product.png")));
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setBounds(905, 10, 100, 100);
		btnNewButton_7.setIcon(new ImageIcon(Home.class.getResource("/img/delete product.png")));
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setBounds(1125, 10, 100, 100);
		btnNewButton_8.setIcon(new ImageIcon(Home.class.getResource("/img/logout.png")));
		contentPane.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you want to Logout","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					setVisible(false);
					new Login().setVisible(true);
				}
			}
		});
		
		btnNewButton_9 = new JButton("");
		btnNewButton_9.setBounds(1235, 10, 100, 100);
		btnNewButton_9.setIcon(new ImageIcon(Home.class.getResource("/img/Close.png")));
		contentPane.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you want to Close Application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					System.exit(0);
				}
			}
		});
		
		btnNewButton_10 = new JButton("");
		btnNewButton_10.setBounds(1015, 10, 100, 100);
		btnNewButton_10.setIcon(new ImageIcon(Home.class.getResource("/img/billing.png")));
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("");
		btnNewButton_11.setBounds(785, 10, 100, 100);
		btnNewButton_11.setIcon(new ImageIcon(Home.class.getResource("/img/details product.png")));
		contentPane.add(btnNewButton_11);
		
//--------------------------------------------------------------------------Button Close---------------------------------------------------------------------------//
		
//--------------------------------------------------------------------------label Start----------------------------------------------------------------------------//
		
		lblNewLabel = new JLabel("New Buyer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(110, 120, 100, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Update Buyer");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(220, 120, 100, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Buyer Details");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(330, 120, 100, 20);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Delete Buyer");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(440, 120, 100, 20);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New Product");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(550, 120, 100, 20);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Update Product");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(660, 120, 115, 20);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Product Details");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(785, 120, 110, 20);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Delete Product");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(905, 120, 110, 20);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Billing");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(1015, 120, 100, 20);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Logout");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(1125, 120, 100, 20);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Close Application");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(1235, 120, 125, 20);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Home.class.getResource("/img/home.PNG")));
		lblNewLabel_11.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel_11);
	
//--------------------------------------------------------------------------label Close---------------------------------------------------------------------------//
	}

}
