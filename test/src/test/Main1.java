package test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Main1 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btnVerify;
	JLabel verify;
	JPanel verification;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
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
	public Main1() {
		verification = new JPanel();
		verification.setBackground(new Color(170, 170, 210));
		verification.setBorder(null);
		verification.setBounds(380,240,435,309);
		getContentPane().add(verification);
		verification.setLayout(null);
		getContentPane().setLayout(null);

		verify = new JLabel("Please verify your account!");
		verify.setForeground(new Color(255, 255, 255));
		verify.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 18));
		verify.setBounds(111, 11, 237, 41);
		verification.add(verify);

		btnVerify = new JButton();
		btnVerify.addActionListener(this);
		btnVerify.setIcon(new ImageIcon(Main1.class.getResource("/img/fingerprint.gif")));
		btnVerify.setBorder(null);
		btnVerify.setBounds(150, 94, 150, 150);
		verification.add(btnVerify);
		
		JLabel image= new JLabel(new ImageIcon("D:\\test\\res\\img\\f6.jpg"));
		// TO-DO
		image.setBounds(0,0,1280,720);
		getContentPane().add(image);

		setSize(1280, 720);
	}

//	public static void main1(String[] args) {
//		
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVerify) {
			JOptionPane.showMessageDialog(null, "Verification successful");
			new Menu();
			dispose();
		}

	}
}

class Menu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton CheckBalance;
	JButton Transfer;
	JButton Cancel;
	JButton Withdraw;
	JButton Cardless;
	JButton Mini;
	JButton Statement;
	JPanel menu;

	public Menu() {
		
		menu = new JPanel();
		menu.setBackground(new Color(205, 205, 205));
		menu.setBounds(200, 180, 770, 439);
		getContentPane().add(menu);
		menu.setLayout(null);
		menu.setBorder(null);
		getContentPane().setLayout(null);

		Cancel = new JButton("Exit");
		Cancel.setBackground(new Color(255,50,50));
		Cancel.setForeground(Color.white);
		Cancel.setBounds(638, 300, 101, 34);
		Cancel.addActionListener(this);
		Cancel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Cancel.setBorder(null);
		menu.add(Cancel);

		CheckBalance = new JButton("Check Balance");
		CheckBalance.setForeground(new Color(255, 255, 255));
		CheckBalance.setBackground(new Color(30, 144, 255));
		CheckBalance.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		CheckBalance.setBounds(40, 63, 152, 34);
		CheckBalance.setBorder(null);
		menu.add(CheckBalance);
		CheckBalance.addActionListener(this);

		Withdraw = new JButton("Withdraw");
		Withdraw.setForeground(new Color(255, 255, 255));
		Withdraw.setBackground(new Color(30, 144, 255));
		Withdraw.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Withdraw.setBounds(40, 126, 152, 36);
		Withdraw.setBorder(null);
		menu.add(Withdraw);
		Withdraw.addActionListener(this);

		Transfer = new JButton("Transfer");
		Transfer.setBorder(null);
		Transfer.setForeground(new Color(255, 255, 255));
		Transfer.setBackground(new Color(30, 144, 255));
		Transfer.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Transfer.setBounds(40, 196, 152, 38);
		menu.add(Transfer);
		Transfer.addActionListener(this);

		Cardless = new JButton("Cardless Withdrawal");
		Cardless.setBorder(null);
		Cardless.setForeground(new Color(255, 255, 255));
		Cardless.setBackground(new Color(30, 144, 255));
		Cardless.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Cardless.setBounds(542, 197, 197, 36);
		menu.add(Cardless);
		Cardless.addActionListener(this);

		Mini = new JButton("Mini Statement");
		Mini.setBorder(null);
		Mini.setForeground(new Color(255, 255, 255));
		Mini.setBackground(new Color(30, 144, 255));
		Mini.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Mini.setBounds(581, 63, 158, 34);
		menu.add(Mini);
		Mini.addActionListener(this);

		Statement = new JButton("Statement");
		Statement.setBorder(null);
		Statement.setForeground(new Color(255, 255, 255));
		Statement.setBackground(new Color(30, 144, 255));
		Statement.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Statement.setBounds(581, 126, 158, 36);
		menu.add(Statement);
		Statement.addActionListener(this);
		
		JLabel image= new JLabel(new ImageIcon("D:\\test\\res\\img\\img2.jpg"));
		// TO-DO
		image.setBounds(0,0,1280,720);
		getContentPane().add(image);

		setSize(1280, 720);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(new Color(220, 220, 220));

		setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == CheckBalance) {
			new CheckBalance();
			dispose();
		}

		else if (e.getSource() == Transfer) {
			new Transfer();
			dispose();
		}

		else if (e.getSource() == Withdraw) {
			new Withdraw();
			dispose();
		}

		else if (e.getSource() == Mini) {
			new Mini();
			dispose();
		} else if (e.getSource() == Statement) {
			new Statement();
			dispose();
		} else if (e.getSource() == Cardless) {;
			JOptionPane.showMessageDialog(null, "Cardless withdrawal is unvailable!");
		} else if (e.getSource() == Cancel) {
			new Main1();
			dispose();
		}

	}

}

class CheckBalance extends JFrame implements ActionListener {

	private static final long serialVersionUID = -5011298391952596955L;

	JButton Current_Account;
	JButton Back;
	JButton Fixed_Deposit;
	JButton Saving_Account;
//	 JButton Current_Balance;
	JPanel panel;

	public CheckBalance() {
		
		panel = new JPanel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(350, 220, 619, 344);
		getContentPane().add(panel);
		panel.setLayout(null);
		getContentPane().setLayout(null);
		
		Current_Account = new JButton("Current Account");
		Current_Account.setForeground(Color.WHITE);
		Current_Account.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Current_Account.setBackground(new Color(47, 79, 79));
		Current_Account.setBounds(31, 39, 176, 34);
		Current_Account.addActionListener(this);
		Current_Account.setBorder(null);
		panel.add(Current_Account);
		
		Back = new JButton("Back");
		Back.setBorder(null);
		Back.setForeground(Color.WHITE);
		Back.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Back.setBackground(Color.BLUE);
		Back.setBounds(482, 195, 101, 34);
		Back.addActionListener(this);
		panel.add(Back);
		
		Saving_Account = new JButton("Savings Account");
		Saving_Account.setBorder(null);
		Saving_Account.setBounds(31, 104, 176, 34);
		Saving_Account.setForeground(Color.white);
		Saving_Account.setBackground(new Color(47, 79, 79));
		Saving_Account.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Saving_Account.addActionListener(this);
		panel.add(Saving_Account);
		
		Fixed_Deposit = new JButton("Fixed Deposit");
		Fixed_Deposit.setBorder(null);
		Fixed_Deposit.setForeground(Color.WHITE);
		Fixed_Deposit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Fixed_Deposit.setBackground(new Color(47, 79, 79));
		Fixed_Deposit.setBounds(402, 39, 207, 34);
		Fixed_Deposit.addActionListener(this);
		panel.add(Fixed_Deposit);
		
		JLabel image= new JLabel(new ImageIcon("D:\\test\\res\\img\\img3.jpg"));
		// TO-DO
		image.setBounds(0,0,1280,720);
		getContentPane().add(image);
		
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(new Color(220, 220, 220));

		setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double amount = 720;

		if (e.getSource() == Saving_Account) {
			JOptionPane.showMessageDialog(null, "Your Savings account balance is GH¢" + amount);
		} else if (e.getSource() == Fixed_Deposit) {
			double amt = 4100;
			JOptionPane.showMessageDialog(null, "Your Fixed Deposit account balance is GH¢" + amt);
		} else if (e.getSource() == Current_Account) {
			double amt = 250;
			JOptionPane.showMessageDialog(null, "Your Current account balance is GH¢" + amt);
		} else if (e.getSource() == Back) {
			new Menu();
			dispose();
		}

	}

}

class Mini extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8145073001561542640L;
	JButton Back;
	JPanel panel;
	JTable table;

	public Mini() {
		
		panel = new JPanel();
		panel.setBackground(getBackground());
		panel.setBounds(250, 50, 780, 450);
		getContentPane().add(panel);
		panel.setLayout(null);
		getContentPane().setLayout(null);

		Back = new JButton("Back");
		Back.setForeground(Color.WHITE);
		Back.setBorder(null);
		Back.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Back.setBackground(new Color(119, 136, 153));
		Back.setBounds(350, 400, 100, 34);
		Back.addActionListener(this);
		panel.add(Back);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Transaction Type", "Amount", "Fee Charged", "Descritption", "Date"},
				{"Credit", "500", "0.00", "From Mobile account", "20-12-22"},
				{"Credit", "120", "0.00", "From external address", "16-02-22"},
				{"Credit", "744", "0.00", "Deposit ", "18-05-22"},
				{"Debit", "650", "0.31", "Withdrawal ATM Savings acc.", "21-06-22"},
				{"Debit", "20.50", "2.50", "Transfer from savings to mobile acc.", "12-05-22"},
				{"Credit", "3600", "0.00", "Transfer from savings to mobile", "06-08-22"},
				{"Debit", "4100", "41.00", "Transfer from mobile account", "12-05-22"},
			
			},
			new String[] {
				"Transactions Type", "Amount", "Fee Charged", "Description", "Date"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, String.class, Object.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(93);
		table.getColumnModel().getColumn(2).setPreferredWidth(118);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(188);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.setCellSelectionEnabled(false);
		table.setColumnSelectionAllowed(false);
		table.setBounds(10, 11, 750, 363);
		table.setBorder(null);
		panel.add(table);
		add(panel);
		panel.add(Back);
		JLabel image= new JLabel(new ImageIcon("D:\\test\\res\\img\\f5.jpg"));
		// TO-DO
		image.setBounds(0,0,1280,720);
		getContentPane().add(image);
		
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(new Color(495237));

		setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Back) {
			new Menu();
			dispose();
		}

	}

}

class Statement extends JFrame implements ActionListener {
JPanel panel;
JButton Back;
JTable table;
	/**
	 * 
	 */
	private static final long serialVersionUID = 8145073001561542640L;

	public Statement() {
		panel = new JPanel();
		panel.setBackground(getBackground());
		panel.setBounds(250, 50, 780, 450);
		getContentPane().add(panel);
		panel.setLayout(null);
		getContentPane().setLayout(null);

		Back = new JButton("Back");
		Back.setForeground(Color.WHITE);
		Back.setBorder(null);
		Back.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		Back.setBackground(new Color(119, 136, 153));
		Back.setBounds(350, 400, 100, 34);
		Back.addActionListener(this);
		panel.add(Back);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Transaction Type", "Amount", "Fee Charged", "Descritption", "Date"},
				{"Credit", "500", "0.00", "From Mobile account", "20-12-22"},
				{"Credit", "120", "0.00", "From external address", "16-02-22"},
				{"Credit", "744", "0.00", "Deposit ", "18-05-22"},
				{"Debit", "650", "0.31", "Withdrawal ATM Savings acc.", "21-06-22"},
				{"Debit", "20.50", "2.50", "Transfer from savings to mobile acc.", "12-05-22"},
				{"Credit", "3600", "0.00", "Transfer from savings to mobile", "06-08-22"},
				{"Debit", "4100", "41.00", "Transfer from mobile account", "12-05-22"},
				{"Debit", "20.00", "0.20", "Airtime", "13-05-22"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Transactions Type", "Amount", "Fee Charged", "Description", "Date"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, String.class, Object.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(93);
		table.getColumnModel().getColumn(2).setPreferredWidth(118);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(188);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.setCellSelectionEnabled(false);
		table.setColumnSelectionAllowed(false);
		table.setBounds(10, 11, 750, 363);
		table.setBorder(null);
		panel.add(table);
		add(panel);
		panel.add(Back);
		JLabel image= new JLabel(new ImageIcon("D:\\test\\res\\img\\f6.jpg"));
		// TO-DO
		image.setBounds(0,0,1280,720);
		getContentPane().add(image);
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(new Color(220, 220, 220));

		setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Back) {
			new Menu();
			dispose();
		}
	}

}

class Withdraw extends JFrame implements ActionListener {

	JButton back;
	JButton savings;
	JButton current;
	JPanel panel;
	
	private static final long serialVersionUID = 8145073001561542640L;

	public Withdraw() {
		
		panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(350, 150, 619, 344);
		getContentPane().add(panel);
		panel.setLayout(null);
		getContentPane().setLayout(null);
		
		savings = new JButton("Savings");
		savings.setBorder(null);
		savings.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		savings.setBounds(31, 104, 176, 34);
		savings.addActionListener(this);
		panel.add(savings);
		
		current = new JButton("Current");
		current.setBorder(null);
		current.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		current.setBounds(31, 39, 176, 34);
		current.addActionListener(this);
		panel.add(current);
		
		back = new JButton("Back");
		back.setBorder(null);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		back.setBackground(Color.BLUE);
		back.setBounds(482, 195, 101, 34);
		panel.add(back);
		back.addActionListener(this);
//	
		JLabel image= new JLabel(new ImageIcon("D:\\test\\res\\img\\img1.jpeg"));
		
		image.setBounds(0,0,1280,720);
		getContentPane().add(image);
//	
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(new Color(220, 220, 220));
		setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == savings) {
				new MoneyMenu();
				dispose();
			}
			else  if(e.getSource()==current) {
				new MoneyMenu();
				dispose();
			}
			else if (e.getSource() == back) {
				new Menu();
				dispose();
			}
				
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1);
			
		}
		
	}
}

class MoneyMenu extends JFrame implements ActionListener {

	JButton btn20;
	JButton btn50;
	JButton btn100;
	JButton btn200;
	JButton btn500;
	JButton btn1000;
	JButton btn2000;
	JButton ok;
	JTextField input;
	JButton back;
	JButton cancel;
	JPanel panel;

	private static final long serialVersionUID = 6016462628100456388L;

	public MoneyMenu() {
		
		panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(350, 150, 619, 344);
		getContentPane().add(panel);
		panel.setLayout(null);
		getContentPane().setLayout(null);
		
		btn20 = new JButton("20");
		btn20.setBorder(null);
		btn20.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn20.setBounds(83, 107, 89, 33);
		back.addActionListener(this);
		panel.add(btn20);
		
		btn50 = new JButton("50");
		btn50.setBorder(null);
		btn50.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn50.setBounds(83, 169, 89, 33);
		btn50.addActionListener(this);
		panel.add(btn50);

		btn100 = new JButton("100");
		btn100.setBorder(null);
		btn100.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn100.setBounds(83, 225, 89, 33);
		btn100.addActionListener(this);
		panel.add(btn100);
		
		btn200 = new JButton("200");
		btn200.setBorder(null);
		btn200.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn200.setBounds(83, 267, 89, 33);
		btn200.addActionListener(this);
		panel.add(btn2000);
		
		btn500 = new JButton("500");
		btn500.setBorder(null);
		btn500.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn500.setBounds(594, 107, 89, 33);
		btn500.addActionListener(this);
		panel.add(btn500);
		
		btn1000 = new JButton("1000");
		btn1000.setBorder(null);
		btn1000.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn1000.setBounds(594, 169, 89, 33);
		btn1000.addActionListener(this);
		panel.add(btn1000);

		btn2000 = new JButton("2000");
		btn2000.setBorder(null);
		btn2000.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn2000.setBounds(594, 225, 89, 33);
		btn2000.addActionListener(this);
		panel.add(btn2000);

		ok = new JButton("OK");
		ok.setBorder(null);
		ok.setBackground(new Color(50, 205, 50));
		ok.setBounds(386, 374, 101, 34);
		panel.add(ok);
		ok.addActionListener(this);

		back = new JButton("BACK");
		back.setBorder(null);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		back.setBackground(Color.BLUE);
		back.setBounds(594, 325, 101, 34);
		back.addActionListener(this);
		panel.add(back);

		input = new JTextField();
		input.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		input.setBounds(278, 23, 194, 41);
		panel.add(input);
		input.setColumns(10);



	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == btn20) {
				double amt = 20;
				JOptionPane.showMessageDialog(null, "You have successfully withdraw an amount of Gh¢" + amt);
			} else if (e.getSource() == btn50) {
				double amt = 50;
				JOptionPane.showMessageDialog(null, "You have successfully withdraw an amount of Gh¢" + amt);
			} else if (e.getSource() == btn100) {
				double amt = 100;
				JOptionPane.showMessageDialog(null, "You have successfully withdraw an amount of Gh¢" + amt);
			} else if (e.getSource() == btn500) {
				double amt = 500;
				JOptionPane.showMessageDialog(null, "You have successfully withdraw an amount of Gh¢" + amt);
			} else if (e.getSource() == btn1000) {
				
				JOptionPane.showMessageDialog(null, "Not enough balance!");
			} else if (e.getSource() == btn200) {
				double amt = 200;
				JOptionPane.showMessageDialog(null, "You have successfully withdraw an amount of Gh¢" + amt);
			} else if (e.getSource() == btn2000) {
				JOptionPane.showMessageDialog(null, "Not enough balance!");
			}
			else if (e.getSource() == back) {
			new Withdraw();
				dispose();
			}

			else if (e.getSource() == ok) {
				try {
					double sika = 10;
					double amount = Double.parseDouble(input.getText());
					if (amount < sika || amount % 5 != 0) {
						JOptionPane.showMessageDialog(null, "Enter amount in multiples of 5");
					} else if (amount > 5000) {
						JOptionPane.showMessageDialog(null, "The amount you're trying to withdraw exceeds limit.");
					} else {
						JOptionPane.showMessageDialog(null, " You have successfully withdraw GH¢" + amount);
						input.setText(null);
					}
				} catch (Exception error) {
					JOptionPane.showMessageDialog(null, "Enter a valid amount!");
				}
			}
		} catch (Exception f) {
			JOptionPane.showMessageDialog(null, f);
		}
	}

}

class Bank extends JFrame implements ActionListener {

	JTextField txtAccNum;
	JButton clear;
	JButton btnOk;
	JButton btnBack;
	JTextField txtAmt;
	@SuppressWarnings("rawtypes")
	JComboBox dstBank;
	


	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Bank() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(350, 150, 619, 344);
		add(panel);
		panel.setLayout(null);

		dstBank = new JComboBox();
		dstBank.setModel(new DefaultComboBoxModel<Object>(new String[] { "select a destination", "Zenith Bank", "ADB",
				"Standard Chartered", "EcoBank", "Cal Bank", "GCB", "Prudential Bank" }));
		dstBank.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		dstBank.setBounds(389, 30, 220, 44);
		panel.add(dstBank);

		txtAccNum = new JTextField();
		txtAccNum.setBounds(198, 38, 160, 32);
		panel.add(txtAccNum);
		txtAccNum.setColumns(10);

		clear = new JButton("Clear");
		clear.setBorder(null);
		clear.setBackground(Color.RED);
		clear.setForeground(Color.white);
		clear.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		clear.setBounds(100, 280, 100, 34);
		panel.add(clear);
		clear.addActionListener(this);

		btnOk = new JButton("OK");
		btnOk.setBorder(null);
		btnOk.setBackground(new Color(50, 205, 50));
		btnOk.setForeground(Color.white);
		btnOk.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOk.setBounds(270, 280, 100, 34);
		panel.add(btnOk);
		btnOk.addActionListener(this);

		btnBack = new JButton("Back");
		btnBack.setBorder(null);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnBack.setBackground(Color.BLUE);
		btnBack.setBounds(470, 280, 100, 34);
		panel.add(btnBack);
		btnBack.addActionListener(this);

		JLabel lblAccountN = new JLabel("Account No.");
		lblAccountN.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAccountN.setBounds(44, 41, 102, 23);
		panel.add(lblAccountN);

		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAmount.setBounds(44, 100, 102, 23);
		panel.add(lblAmount);

		txtAmt = new JTextField();
		txtAmt.setColumns(10);
		txtAmt.setBounds(198, 97, 160, 32);
		panel.add(txtAmt);
		
		JLabel image= new JLabel(new ImageIcon("D:\\test\\res\\img\\j-banks.jpg"));
		// TO-DO
		image.setBounds(0,0,1280,720);
		getContentPane().add(image);

		setSize(1280, 720);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(new Color(220, 220, 220));

		setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			try {
				int accNum = (int) Double.parseDouble(txtAccNum.getText());
				double amount = Double.parseDouble(txtAmt.getText());
				if (accNum < 100000000 || accNum == amount || accNum > 2147483647) {
					JOptionPane.showMessageDialog(null, "Invalid account number.");
					dstBank.getSelectedItem();
				} else if (amount < 20) {
					JOptionPane.showMessageDialog(null, "Amount should be greater than Gh¢" + amount);
					dstBank.getSelectedItem();
				} else if (dstBank.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "Ofui select a Bank destination");
				} else {
					int option = JOptionPane.showConfirmDialog(null, "You're about to transfer Gh¢" + amount + " to "
							+ dstBank.getSelectedItem() + ", " + "Acc No. " + accNum + "\nConfirm transfer");
					if (option == 0) {
						JOptionPane.showMessageDialog(null, "You have successfully transferred an amount of Gh¢"
								+ amount + "\nto " + dstBank.getSelectedItem() + ", Acc No. " + accNum);
					} else {
						JOptionPane.showMessageDialog(null, "Tranfer cancelled successfully.");
					}

				}
			} catch (Exception error) {
				JOptionPane.showMessageDialog(null, "An error occured! \n Please try again");
			}
		}
		
		if(e.getSource()==btnBack) {
			new Transfer();
			dispose();
		}
		if (e.getSource()==clear) {
			dstBank.setSelectedIndex(0);
			txtAccNum.setText(" ");
			txtAmt.setText(" ");

		}

	}
}

class Transfer extends JFrame implements ActionListener {

	private static final long serialVersionUID = 8145073001561542640L;
	JButton back;
	JButton momo;
	JButton diffBank;
	JPanel panel;
	JButton fixDepo;

	public Transfer() {
		
		panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(350, 150, 619, 344);
		getContentPane().add(panel);
		panel.setLayout(null);
		getContentPane().setLayout(null);
		
		back = new JButton("Back");
		back.setBorder(null);
		back.setBackground(new Color(0, 0, 255));
		back.setForeground(new Color(255, 255, 255));
		back.setBounds(482, 195, 101, 34);
		panel.add(back);
		back.addActionListener(this);
			
		momo = new JButton("To Mobile Account");
		momo.setBorder(null);
		momo.setBounds(58, 131, 150, 34);
		panel.add(momo);
		momo.addActionListener(this);
		
		diffBank = new JButton("To different Bank");
		diffBank.setBorder(null);
		diffBank.setBounds(58, 78, 150, 34);
		panel.add(diffBank);
		diffBank.addActionListener(this);
		
		fixDepo = new JButton("To fixed Deposit");
		fixDepo.setBorder(null);
		fixDepo.setBounds(450, 78, 150, 34);
		panel.add(fixDepo);
		fixDepo.addActionListener(this);
		
		JLabel image= new JLabel(new ImageIcon("D:\\test\\res\\img\\img2.jpg"));
		image.setBounds(0,0,1280,720);
		getContentPane().add(image);
		
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(new Color(220, 220, 220));

		setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==back) {
			new Menu();
			dispose();
		}
			
			
		else if (e.getSource()==fixDepo) {
			JOptionPane.showMessageDialog(null, "Service unvailable...\nPlease come back later!");
			new Transfer();
			dispose();
			
		} else if (e.getSource()==momo)
			new MobileTransfer();
			dispose();
		
		if (e.getSource()==diffBank)
			new Bank();
			dispose();
	}

}

class MobileTransfer extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5606111344973932790L;
JButton ok;
@SuppressWarnings("rawtypes")
JComboBox combo;
JButton back;
JLabel mobino_;
JLabel entAmt;
JTextField amount;
JTextField Num;
JButton clear;

@SuppressWarnings({ "unchecked", "rawtypes" })
public MobileTransfer() {
	JPanel panel = new JPanel();
	panel.setBackground(new Color(248, 248, 255));
	panel.setBounds(350, 150, 619, 344);
	add(panel);
	panel.setLayout(null);
	
	combo = new JComboBox<>();
	combo.setModel(new DefaultComboBoxModel(new String[] {"Select network", "MTN", "Vodafone", "AirtelTigo"}));
	combo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	combo.setBounds(389, 30, 220, 44);
	panel.add(combo);
	
	clear = new JButton("Clear");
	clear.setBorder(null);
	clear.setBackground(Color.RED);
	clear.setForeground(Color.white);
	clear.setFont(new Font("Segoe UI", Font.PLAIN, 18));
	clear.setBounds(100, 280, 100, 34);
	panel.add(clear);
	clear.addActionListener(this);

	ok = new JButton("OK");
	ok.setBorder(null);
	ok.setBackground(new Color(50, 205, 50));
	ok.setForeground(Color.white);
	ok.setFont(new Font("Segoe UI", Font.PLAIN, 18));
	ok.setBounds(270, 280, 100, 34);
	panel.add(ok);
	ok.addActionListener(this);

	back = new JButton("Back");
	back.setBorder(null);
	back.setForeground(Color.WHITE);
	back.setFont(new Font("Segoe UI", Font.PLAIN, 18));
	back.setBackground(Color.BLUE);
	back.setBounds(470, 280, 100, 34);
	panel.add(back);
	back.addActionListener(this);
	
	mobino_ = new JLabel("Mobile Number:");
	mobino_.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	mobino_.setBounds(44, 41, 102, 23);
	panel.add(mobino_);

	entAmt = new JLabel("Amount");
	entAmt.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	entAmt.setBounds(44, 100, 102, 23);
	panel.add(entAmt);
	
	Num = new JTextField();
	Num.setBounds(198, 38, 160, 32);
	panel.add(Num);
	Num.setColumns(10);
	
	amount = new JTextField();
	amount.setColumns(10);
	amount.setBounds(198, 97, 160, 32);
	panel.add(amount);
	
	JLabel image= new JLabel(new ImageIcon("D:\\test\\res\\img\\f4.jpg"));
	// TO-DO
	image.setBounds(0,0,1280,720);
	getContentPane().add(image);

	setSize(1280, 720);
	setLayout(null);
	setVisible(true);
	getContentPane().setBackground(new Color(220, 220, 220));

	setDefaultCloseOperation(3);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ok) {
			try {
				int mobiNum=(int) Double.parseDouble(Num.getText().toString());
				double amt = Double.parseDouble(amount.getText().toString());
				if (mobiNum > 1000000000 || mobiNum == amt || mobiNum < 239537405) {
					JOptionPane.showMessageDialog(null, "Mobile number might not be valid!");
					combo.getSelectedItem();
					
				}
				
				else if(amt < 10 || amt > 3000) {
					JOptionPane.showMessageDialog(null, "Invalid amount entered!");
					combo.getSelectedItem();
				}
				
				else if (combo.getSelectedIndex() ==0) {
					JOptionPane.showMessageDialog(null, "Please select a network!");
				}
				
				else {
					int option =JOptionPane.showConfirmDialog(null, "Confirm transaction ?");
						if (option == 0) {
							JOptionPane.showMessageDialog(null, "You have successfully transferred an amount of Gh¢"+amt + "\nto "+
						combo.getSelectedItem() +
									" No. "+ mobiNum);
						}else {
							JOptionPane.showMessageDialog(null, "Transfer has been cancelled.");
						}
				}
				
			}catch (Exception f) {
				JOptionPane.showMessageDialog(null, "An error has occured!\nPlease try again later...");
				
			}
		
		}
		if(e.getSource()==clear)
			amount.setText(" ");
			Num.setText(" ");
		combo.setSelectedIndex(0);
		
		if(e.getSource()==back) {
			new Transfer();
			dispose();
		}
	}
	
}