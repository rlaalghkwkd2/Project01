package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import project.custom.panel.panelInput;
import project.custom.panel.panelSearch;
import project.custom.panel.panleHome;

import javax.swing.JButton;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	public static project.custom.panel.panelInput in = new panelInput();
	private MainBtn mainbtn;
	private panleHome home;
	JPanel panelMenu = new JPanel();
	
	/**
	 * Launch the application.
	 */
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
		in = new panelInput();
		home = new panleHome();
		mainbtn= new MainBtn();
		panelMenu.setBackground(new Color(255, 165, 0));
		panelMenu.setBounds(2, 2, 249, 557);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);

		
		
		JButton b = new JButton("1");
		b.setBounds(50, 50, 50, 50);
		
		
		JPanel panelin = new JPanel();
		panelin.addMouseListener(new PanelButtonMouseAdapter(panelin) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(mainbtn);
			}
		});
		panelin.setLayout(null);
		panelin.setBackground(new Color(255, 165, 0));
		panelin.setBounds(0, 174, 249, 40);
		panelMenu.add(panelin);

		JLabel lblIn = new JLabel("\uACE0\uAC1D");
		lblIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblIn.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 14));
		lblIn.setBounds(12, 10, 225, 20);
		panelin.add(lblIn);

		JPanel panelHome = new JPanel();
		panelHome.setBounds(0, 231, 249, 30);
		panelMenu.add(panelHome);
		panelHome.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD648");
		lblNewLabel.setBounds(118, 5, 12, 15);
		panelHome.add(lblNewLabel);
		
		MainBtn.btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menuClicked(in);
				
			}
		});
		
	
		
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(265, 15, 807, 533);
		contentPane.add(panelMainContent);
		
		
		panelMainContent.setLayout(null);
		
		panelMainContent.add(in);
		panelMainContent.add(home);
		panelMainContent.add(mainbtn);
		menuClicked(home);
	}
	
	public void menuClicked(JPanel panel) {
		in.setVisible(false);
		home.setVisible(false);
		mainbtn.setVisible(false);
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
