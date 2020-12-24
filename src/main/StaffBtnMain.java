package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import project.custom.main.Frame01;
import project.staff.main.ABC_emp_dpt_main;
import project.staff.main.Event;
import project.staff.main.Retrieve;
import javax.swing.SwingConstants;

public class StaffBtnMain extends JPanel {
	public static JButton btn1 = new JButton("");
	private JPanel contentPane;
	
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/staff/image/abc2.jpg")).getImage().getScaledInstance(803,
			200, Image.SCALE_SMOOTH);
	
	public StaffBtnMain() {

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
		
		JLabel lblAttendance = new JLabel("\uCD9C\uC11D \uCCB4\uD06C");
		lblAttendance.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD | Font.ITALIC, 20));
		lblAttendance.setBounds(96, 261, 98, 30);
		panelin.add(lblAttendance);
		
		JButton AttendanceBtn = new JButton("");
		AttendanceBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AttendanceBtn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				AttendanceBtn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/attendance.PNG")));
			}
		});
		AttendanceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new project.staff.attendance.Attendance_main();
			}
		});
		
		AttendanceBtn.setIcon(new ImageIcon(StaffBtnMain.class.getResource("/project/staff/image/attendance.PNG")));
		AttendanceBtn.setForeground(new Color(255, 255, 0));
		AttendanceBtn.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD | Font.ITALIC, 20));
		AttendanceBtn.setBackground(new Color(255, 215, 0));
		AttendanceBtn.setBorderPainted(false);
		AttendanceBtn.setBounds(30, 301, 231, 200);
		panelin.add(AttendanceBtn);
		
		
		JButton inquiryBtn = new JButton("");
		inquiryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				inquiryBtn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				inquiryBtn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/search.PNG")));
			}
		});
		inquiryBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Retrieve();
			}
		});
		inquiryBtn.setIcon(new ImageIcon(StaffBtnMain.class.getResource("/project/staff/image/search.PNG")));
		inquiryBtn.setForeground(new Color(255, 215, 0));
		inquiryBtn.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD | Font.ITALIC, 20));
		inquiryBtn.setBorderPainted(false);
		inquiryBtn.setBackground(new Color(255, 215, 0));
		inquiryBtn.setBounds(292, 301, 221, 200);
		panelin.add(inquiryBtn);
		
		JButton eventBtn = new JButton("");
		eventBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				eventBtn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				eventBtn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/event.PNG")));
			}
		});
		eventBtn.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/event.PNG")));
		eventBtn.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD | Font.ITALIC, 20));
		eventBtn.setForeground(new Color(0, 0, 0));
		eventBtn.setBorderPainted(false);
		eventBtn.setBackground(new Color(255, 215, 0));
		eventBtn.setBounds(543, 301, 231, 200);
		panelin.add(eventBtn);
		
		eventBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Event();
			}	
		});
		
		JLabel lblinquiry = new JLabel("\uC870\uD68C");
		lblinquiry.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD | Font.ITALIC, 20));
		lblinquiry.setBounds(381, 261, 51, 30);
		panelin.add(lblinquiry);
		
		JLabel lblevent = new JLabel("\uC774\uBCA4\uD2B8");
		lblevent.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD | Font.ITALIC, 20));
		lblevent.setBounds(628, 261, 70, 30);
		panelin.add(lblevent);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(12, 10, 779, 93);
		panelin.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC9C1\uC6D0\uAD00\uB9AC \uAC8C\uC2DC\uD310");
		lblNewLabel.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 755, 73);
		panel.add(lblNewLabel);
		
	}
}
