package project.stock.find_br_day;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.awt.*;

public class find_br_day2 extends JFrame {
   JTextField tf = new JTextField(20);
   JTextArea ta = new JTextArea(7, 20); 
 
   private JPanel contentPane;
   private JTextField textField;
   public find_br_day2() {
	   
	   setTitle("브랜드 별 행사 조회");
		
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
		
		JLabel lblNewLabel = new JLabel("\uBE0C\uB79C\uB4DC\uBCC4 \uD589\uC0AC \uC870\uD68C");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblNewLabel.setBounds(12, 10, 460, 49);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE0C\uB79C\uB4DC\uBA85:");
		lblNewLabel_1.setFont(new Font("휴먼편지체", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(36, 166, 58, 24);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(106, 164, 216, 26);
		panel.add(textField);
		textField.setColumns(10);
		ta.setEditable(false);
		ta.setEnabled(false);
		JScrollPane scrollpane = new JScrollPane(ta);				
		scrollpane.setBounds(36, 225, 413, 300);
		panel.add(scrollpane);
		ta.setBounds(36, 225, 413, 298);
		
		
      tf.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JTextField t = (JTextField)e.getSource();
            
            ta.append("[" + t.getText() + "]행사 조희 정보\n" + new find_br_day(t.getText()).imfo()); 
            System.out.println(new find_br_day(t.getText()).imfo());
            t.setText(""); 
         }
      });
      
      setVisible(true);
   }
   public static void main(String[] args) {
	   new find_br_day2();
}
}
