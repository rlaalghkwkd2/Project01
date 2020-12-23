package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import project.custom.panel.panelBlackIn;
import project.custom.panel.panelInput;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainBtn extends JPanel {
	private project.custom.panel.panelInput in;
	public static JButton btnNewButton = new JButton("New 1");
	private JPanel contentPane;
	/**
	 * Create the panel.
	 */
	public MainBtn() {
		
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(0, 0, 807, 533);
		setLayout(null);
		setBackground(new Color(255, 160, 122));
	
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 127, 80));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.setLayout(null);
		
		JPanel panelin = new JPanel();
		panelin.setLayout(null);
		panelin.setBackground(new Color(255, 165, 0));
		panelin.setBounds(2, 2, 803, 528);
		add(panelin);
		
		
		btnNewButton.setBounds(12, 128, 226, 67);
		panelin.add(btnNewButton);
		
	
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(619, 150, 97, 23);
		panelin.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(12, 10, 779, 93);
		panelin.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uACE0\uAC1D\uAD00\uB9AC \uAC8C\uC2DC\uD310");
		lblNewLabel.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 755, 73);
		panel.add(lblNewLabel);
		
		
		
	}
	
	public void menuClicked(JPanel panel) {
		setVisible(false);
		in.setVisible(false);
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
