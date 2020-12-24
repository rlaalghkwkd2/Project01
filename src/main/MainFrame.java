package main;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.sun.glass.ui.Menu;

import project.Payment.test.swingtest;
import project.custom.main.Frame01;
import project.custom.panel.panelBlackDelete;
import project.custom.panel.panelBlackIn;
import project.custom.panel.panelCustomCheck;
import project.custom.panel.panelCustomDelete;
import project.custom.panel.panelInput;
import project.custom.panel.panelSearch;
import project.custom.panel.panelUpdate;
import project.custom.panel.panleHome;
import project.stock.add_new_shoes.add_new_shoes2;
import project.stock.find_br_day.find_br_day2;

public class MainFrame extends JFrame {
	
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/custom/image/abcmain.png")).getImage().getScaledInstance(249,
			142, Image.SCALE_SMOOTH);
	private Image img_face = new ImageIcon(Frame01.class.getResource("/project/custom/image/face.JPG")).getImage().getScaledInstance(35,
			27, Image.SCALE_SMOOTH);
	private Image img_instar = new ImageIcon(Frame01.class.getResource("/project/custom/image/inst.JPG")).getImage().getScaledInstance(35,
			27, Image.SCALE_SMOOTH);
	private Image img_tw = new ImageIcon(Frame01.class.getResource("/project/custom/image/twit.JPG")).getImage().getScaledInstance(35,
			27, Image.SCALE_SMOOTH);
	private JPanel contentPane;
	private panelInput customInput;
	private panelSearch customSearch;
	private panelCustomCheck customChek;
	private panelUpdate customUpdate;
	private panelCustomDelete customDelete;
	private panelBlackIn customBlackInput;
	private panelBlackDelete customBlackDelete;
	private CoustomBtnMain CoustomBtn;

	public static panleHome home = new panleHome();
	JPanel panelMenu = new JPanel();

	private StaffBtnMain staffbtn;
	private StockBtnMain stockbtn;
	private swingtest swingtest;
	
	private JLabel lblIn_1;
	private JLabel lblstock;
	
	private JLabel lblstock_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1100, 600);
//		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 127, 80));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		customInput = new panelInput();
		customSearch = new panelSearch();
		customChek = new panelCustomCheck();
		customUpdate = new panelUpdate();
		home = new panleHome();
		customDelete = new panelCustomDelete();
		customBlackInput = new panelBlackIn();
		customBlackDelete = new panelBlackDelete();
		CoustomBtn = new CoustomBtnMain();

		staffbtn = new StaffBtnMain();
		stockbtn = new StockBtnMain();
		
		
		panelMenu.setBackground(new Color(255, 165, 0));
		panelMenu.setBounds(2, 2, 249, 557);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);

		JButton b = new JButton("1");
		b.setBounds(50, 50, 50, 50);

		JPanel customPanel = new JPanel();
		customPanel.addMouseListener(new PanelButtonMouseAdapter(customPanel) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(CoustomBtn);
			}
		});
		customPanel.setLayout(null);
		customPanel.setBackground(new Color(255, 165, 0));
		customPanel.setBounds(0, 242, 249, 40);
		panelMenu.add(customPanel);

		JLabel lblIn = new JLabel("Custom");
		lblIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblIn.setFont(new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.BOLD, 16));
		lblIn.setBounds(12, 10, 225, 20);
		customPanel.add(lblIn);

		JPanel panelHome = new JPanel();
		panelHome.setBackground(new Color(255, 165, 0));
		panelHome.addMouseListener(new PanelButtonMouseAdapter(panelHome) {
			@Override
			public void mouseClicked(MouseEvent e) {
			menuClicked(home);
			}
		});
		panelHome.setBounds(0, 163, 249, 40);
		panelMenu.add(panelHome);
		panelHome.setLayout(null);

		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setFont(new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.BOLD, 16));
		lblNewLabel.setBounds(106, 10, 51, 25);
		panelHome.add(lblNewLabel);

		JPanel staffPanel = new JPanel();
		staffPanel.addMouseListener(new PanelButtonMouseAdapter(staffPanel) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(staffbtn);
			}
		});

		staffPanel.setLayout(null);
		staffPanel.setBackground(new Color(255, 165, 0));
		staffPanel.setBounds(0, 202, 249, 40);
		panelMenu.add(staffPanel);
		
		JPanel stockPanel = new JPanel();
		stockPanel.addMouseListener(new PanelButtonMouseAdapter(stockPanel) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(stockbtn);
			}
		});
		stockPanel.setLayout(null);
		stockPanel.setBackground(new Color(255, 165, 0));
		stockPanel.setBounds(0, 280, 249, 40);
		panelMenu.add(stockPanel);

		lblIn_1 = new JLabel("Staff");
		lblIn_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIn_1.setFont(new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.BOLD, 16));
		lblIn_1.setBounds(12, 10, 225, 20);
		staffPanel.add(lblIn_1);
		
		
		lblstock = new JLabel("Stock");
		lblstock.setHorizontalAlignment(SwingConstants.CENTER);
		lblstock.setFont(new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.BOLD, 16));
		lblstock.setBounds(12, 10, 225, 20);
		stockPanel.add(lblstock);
		
	 JPanel paymentPanel = new JPanel();
	 paymentPanel.addMouseListener(new PanelButtonMouseAdapter(paymentPanel) {
		 @Override
		public void mouseClicked(MouseEvent e) {
			 swingtest = new swingtest();
		}
	 });
		paymentPanel.setLayout(null);
		paymentPanel.setBackground(new Color(255, 165, 0));
		paymentPanel.setBounds(0, 318, 249, 40);
		panelMenu.add(paymentPanel);
		
		lblstock_1 = new JLabel("Payment");
		lblstock_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblstock_1.setFont(new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.BOLD, 16));
		lblstock_1.setBounds(12, 10, 225, 20);
		paymentPanel.add(lblstock_1);
		
		lblNewLabel_1 = new JLabel(new ImageIcon(img_logo));
		lblNewLabel_1.setBounds(0, 10, 249, 142);
		panelMenu.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(new ImageIcon(img_tw));
		lblNewLabel_2.setBounds(12, 420, 35, 27);
		panelMenu.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel(new ImageIcon(img_instar));
		lblNewLabel_3.setBounds(12, 463, 35, 27);
		panelMenu.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel(new ImageIcon(img_face));
		lblNewLabel_4.setBounds(12, 508, 35, 27);
		panelMenu.add(lblNewLabel_4);

		CoustomBtn.btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuClicked(customInput);
				customInput.InputCleanSet();
			}
		});

		CoustomBtn.btnCustomSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				menuClicked(customSearch);
				new panelSearch();
			}
		});
		CoustomBtn.btnCustomCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuClicked(customChek);
				customChek.textCardSearch.setText("");
				customChek.textNameSearch.setText("");
				for (int i = panelCustomCheck.dtm.getRowCount() - 1; i >= 0; i--) {
					panelCustomCheck.dtm.removeRow(i);
				}
			}
		});
		CoustomBtn.btnCustomModify.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuClicked(customUpdate);
				customUpdate.UpdateCleanSet();
			}
		});
		CoustomBtn.btnCustomDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				menuClicked(customDelete);
				customDelete.textArea.setText("");
			}
		});
		CoustomBtn.btnCustomBlackInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuClicked(customBlackInput);
				customBlackInput.textcard.setText("");
				customBlackInput.reason.setText("");
				customBlackInput.textArea.setText("");
			}
		});
		CoustomBtn.btnCustomBlackDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				menuClicked(customBlackDelete);
//				new panelBlackDelete();
			}
		});

		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(265, 15, 807, 533);
		contentPane.add(panelMainContent);

		panelMainContent.setLayout(null);

		panelMainContent.add(customInput);
		panelMainContent.add(customSearch);
		panelMainContent.add(customChek);
		panelMainContent.add(customUpdate);
		panelMainContent.add(customDelete);
		panelMainContent.add(customBlackInput);
		panelMainContent.add(customBlackDelete);
		panelMainContent.add(home);
		panelMainContent.add(CoustomBtn);

		panelMainContent.add(staffbtn);
		panelMainContent.add(stockbtn);
//		panelMainContent.add(shoes);
		
		

		menuClicked(home);
	}

	public void menuClicked(JPanel panel) {
		customInput.setVisible(false);
		customSearch.setVisible(false);
		customChek.setVisible(false);
		customUpdate.setVisible(false);
		customDelete.setVisible(false);
		customBlackInput.setVisible(false);
		customBlackDelete.setVisible(false);
		home.setVisible(false);
		CoustomBtn.setVisible(false);

		staffbtn.setVisible(false);
		stockbtn.setVisible(false);
		
		

		panel.setVisible(true);
	}

	private class PanelButtonMouseAdapter extends MouseAdapter {
		JPanel panel;

		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(255, 211, 5));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(255, 165, 0));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(244, 164, 96));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(255, 165, 0));
		}

	}
}
