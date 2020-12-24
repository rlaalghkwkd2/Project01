package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import project.custom.main.Frame01;
import project.staff.main.ABC_emp_dpt_main;
import project.stock.add_new_shoes.add_new_shoes2;
import project.stock.find_br_day.find_br_day2;
import project.stock.inventory.add_inventory2;
import project.stock.sh_name.sh_name2;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StockBtnMain extends JPanel {
	private JPanel contentPane;
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/stock/image/psearch.png")).getImage().getScaledInstance(249,
			142, Image.SCALE_SMOOTH);
	private Image img_logo1 = new ImageIcon(Frame01.class.getResource("/project/stock/image/input.png")).getImage().getScaledInstance(249,
			142, Image.SCALE_SMOOTH);
	private Image img_logo2 = new ImageIcon(Frame01.class.getResource("/project/stock/image/envent.png")).getImage().getScaledInstance(249,
			142, Image.SCALE_SMOOTH);
	private Image img_logo3 = new ImageIcon(Frame01.class.getResource("/project/stock/image/pyu.png")).getImage().getScaledInstance(249,
			142, Image.SCALE_SMOOTH);
	public StockBtnMain() {

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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(12, 10, 779, 93);
		panelin.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC0C1\uD488 \uC7AC\uACE0\uAD00\uB9AC \uAC8C\uC2DC\uD310");
		lblNewLabel.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 755, 73);
		panel.add(lblNewLabel);
		
		JButton ProductBtn = new JButton(new ImageIcon(img_logo1));
		ProductBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new add_new_shoes2();
			}
		});
		
		ProductBtn.setBounds(12, 173, 250, 150);
		panelin.add(ProductBtn);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon(img_logo2));
		btnNewButton_1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				new find_br_day2();			
			}
		});
		btnNewButton_1.setBounds(12, 370, 250, 150);
		panelin.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon(img_logo));
		btnNewButton_2.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				new add_inventory2();				
			}
		});
		btnNewButton_2.setBounds(541, 173, 250, 150);
		panelin.add(btnNewButton_2);
		
		JLabel lblProduct = new JLabel("\uC0C1\uD488 \uB4F1\uB85D");
		lblProduct.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 20));
		lblProduct.setBounds(97, 133, 75, 40);
		panelin.add(lblProduct);
		
		JLabel lblProduct_1 = new JLabel("\uBE0C\uB79C\uB4DC\uBCC4 \uD589\uC0AC \uC870\uD68C");
		lblProduct_1.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 20));
		lblProduct_1.setBounds(52, 333, 162, 36);
		panelin.add(lblProduct_1);
		
		JLabel lblProduct_1_1 = new JLabel("\uC7AC\uACE0\uC218\uB7C9 \uC870\uD68C \uBC0F \uCD94\uAC00 \uC8FC\uBB38 \uC870\uD68C");
		lblProduct_1_1.setBounds(573, 274, 176, 36);
		panelin.add(lblProduct_1_1);
		
		JButton btnNewButton_2_1 = new JButton(new ImageIcon(img_logo3));
		btnNewButton_2_1.setBounds(541, 370, 250, 150);
		panelin.add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {				
				new sh_name2();
			}
		});
		
		JLabel lblProduct_2 = new JLabel("\uC0C1\uD488 \uC870\uD68C\uBC0F \uCD94\uAC00\uC8FC\uBB38 \uC870\uD68C");
		lblProduct_2.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 20));
		lblProduct_2.setBounds(561, 133, 218, 40);
		panelin.add(lblProduct_2);
		
		JLabel lblProduct_2_1 = new JLabel("\uC0C1\uD488 \uC218\uB7C9 \uBC0F \uCC3D\uACE0 \uC704\uCE58 \uC870\uD68C");
		lblProduct_2_1.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 20));
		lblProduct_2_1.setBounds(551, 331, 235, 40);
		panelin.add(lblProduct_2_1);
		
		
	}
}
