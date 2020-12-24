package project.stock.sh_name;

import java.awt.BorderLayout;
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

public class sh_name2 extends JFrame {
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7, 20);
//	c.add(new JLabel("제품명 입력 후<Enter>"));
	private JPanel contentPane;
	public static JPanel panel = new JPanel();
	private JTextField textField;
	public sh_name2() {
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setBounds(200,200, 500, 600);
		panel.setBackground(new Color(255, 165, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 0, 474, 69);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC81C\uD488 \uC218\uB7C9 \uBC0F \uCC3D\uACE0 \uC704\uCE58 \uC870\uD68C");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 450, 49);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC81C\uD488\uBA85:");
		lblNewLabel_1.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(36, 166, 56, 25);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(87, 163, 216, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("<\uC785\uB825 \uD6C4 Enter>");
		lblNewLabel_2.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(315, 165, 107, 26);
		panel.add(lblNewLabel_2);

		JScrollPane scrollpane = new JScrollPane(ta);				
		scrollpane.setBounds(36, 225, 413, 300);
		panel.add(scrollpane);
		
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();

				ta.append("[" + t.getText() + "]제품 조회 정보\n" + new sh_name(t.getText()).info());
				t.setText("");
			}
		});
		
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new sh_name2();

	}
}
