package project.stock.sh_name;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class sh_name2 extends JFrame {
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7, 20);

	public sh_name2() {
		setTitle("���,������,����,â����ġ �˻�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("��ǰ�� �Է� ��<Enter>"));
		c.add(tf);
		c.add(new JScrollPane(ta));

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();

				ta.append("[" + t.getText() + "]��ǰ ��ȸ ����\n" + new sh_name(t.getText()).info());
				t.setText("");
			}
		});
		setSize(300, 300);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new sh_name2();

	}
}
