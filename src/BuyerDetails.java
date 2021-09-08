import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuyerDetails extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyerDetails frame = new BuyerDetails();
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
	public BuyerDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(BuyerDetails.class.getResource("/img/buyer Details.png")));
		lblNewLabel_1.setBounds(95, 10, 68, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(BuyerDetails.class.getResource("/img/Buyers Details ani.gif")));
		lblNewLabel_2.setBounds(190, 4, 263, 64);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 76, 452, 2);
		contentPane.add(separator);
		
		table = new JTable();
		table.setBounds(21, 98, 441, 183);
		contentPane.add(table);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 291, 432, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					JTable.print(JTable.PrintMode.NORMAL);
				}
				catch(exception e)
				{
					
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(BuyerDetails.class.getResource("/img/print.png")));
		btnNewButton.setBounds(29, 318, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(BuyerDetails.class.getResource("/img/close Jframe.png")));
		btnNewButton_1.setBounds(204, 318, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(BuyerDetails.class.getResource("/img/all page background image.png")));
		lblNewLabel.setBounds(0, 0, 529, 363);
		contentPane.add(lblNewLabel);
	}
}
