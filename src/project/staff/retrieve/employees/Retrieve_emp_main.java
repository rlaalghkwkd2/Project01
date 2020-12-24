package project.staff.retrieve.employees;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import project.staff.main.Event;
import project.staff.retrieve.attandance.Attendance_information;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Retrieve_emp_main extends JFrame {

	private JPanel contentPane;

	public Retrieve_emp_main() {
		setTitle("직원 이름으로 정보 조회");
		setBounds(300, 300, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 163, 395, 332);
		panel.add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JTextField tf = new JTextField();
		tf.setBounds(40, 99, 395, 38);
		panel.add(tf);
		tf.setColumns(10);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				
				ta.append(new Retrieve_emp(t.getText()).info()); 
				t.setText(""); 
			}
		});
		
		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(Event.class.getResource("/project/staff/image/back1.PNG")));
		back_btn.setBounds(0, 0, 32, 28);
		panel.add(back_btn);
		back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Event.class.getResource("/project/staff/image/back2.PNG")));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				back_btn.setIcon(new ImageIcon(Event.class.getResource("/project/staff/image/back1.PNG")));
			}
		});
		
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("\uC870\uD68C\uB97C \uC6D0\uD558\uB294 \uC9C1\uC6D0 \uC774\uB984 \uC785\uB825 \uD6C4 <ENTER>");
		lblNewLabel.setBackground(new Color(240, 255, 240));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(40, 39, 387, 63);
		panel.add(lblNewLabel);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
