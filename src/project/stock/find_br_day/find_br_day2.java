package project.stock.find_br_day;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class find_br_day2 extends JFrame {
   JTextField tf = new JTextField(20);
   JTextArea ta = new JTextArea(7, 20); 

   public find_br_day2() {
      setTitle("�귣�� �� ��� ��ȸ");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.add(new JLabel("�귣�庰 �����ȸ/�귣�� �Է� ��<Enter>"));
      c.add(tf);
      c.add(new JScrollPane(ta));

      tf.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JTextField t = (JTextField)e.getSource();
            
            ta.append("[" + t.getText() + "]��� ���� ����\n" + new find_br_day(t.getText()).imfo()); 
            System.out.println(new find_br_day(t.getText()).imfo());
            t.setText(""); 
         }
      });
      setSize(300, 300);
      setVisible(true);
   }
   public static void main(String[] args) {
	   new find_br_day2();
}
}
