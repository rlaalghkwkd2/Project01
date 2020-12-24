package project.stock.inventory;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class add_inventory2 extends JFrame {
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7, 20);
	  private JPanel contentPane;
	  private JTextField textField;
	public add_inventory2() {
		setTitle("재고수량 조회 및 추가 주문 조회");
		setBounds(200, 200,500,600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 484, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 0, 484, 69);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC0C1\uD488 \uC7AC\uACE0 \uC870\uD68C \uBC0F \uCD94\uAC00 \uC8FC\uBB38 \uC870\uD68C");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 460, 49);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\uC2DC\uB9AC\uC5BC\uB118\uBC84:");
		lblNewLabel_2.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(36, 166, 79, 19);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(125, 161, 216, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollpane = new JScrollPane(ta);				
		scrollpane.setBounds(36, 225, 413, 300);
		panel.add(scrollpane);
		
		JLabel lblNewLabel_3 = new JLabel("<\uC785\uB825 \uD6C4 Enter>");
		lblNewLabel_3.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(353, 162, 107, 26);
		panel.add(lblNewLabel_3);
		
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();

				ta.append("[" + t.getText() + "]재고조회\n" + new add_inventory(t.getText()).info());
				t.setText("");
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new add_inventory2();
	}
}
