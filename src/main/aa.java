package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import project.staff.main.ABC_emp_dpt_main;

public class aa implements MouseListener{
 JButton b = new JButton();
	public aa(JButton b) {
		this.b = b;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		b.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		b.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/attendance.PNG")));
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
