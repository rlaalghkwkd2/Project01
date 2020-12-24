package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import project.custom.main.Frame01;
import project.staff.main.ABC_emp_dpt_main;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoustomBtnMain extends JPanel {
	private static Image img_search = new ImageIcon(Frame01.class.getResource("/project/custom/image/search.png"))
			.getImage().getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/custom/image/abc.jpg")).getImage()
			.getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	private static Image img_cusotm = new ImageIcon(Frame01.class.getResource("/project/custom/image/custom.jpg"))
			.getImage().getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	private static Image img_purchase = new ImageIcon(Frame01.class.getResource("/project/custom/image/Purchase.png"))
			.getImage().getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	private static Image img_modify = new ImageIcon(Frame01.class.getResource("/project/custom/image/Modify.png"))
			.getImage().getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	private static Image img_customDelete = new ImageIcon(
			Frame01.class.getResource("/project/custom/image/customdelete.png")).getImage().getScaledInstance(154, 119,
					Image.SCALE_SMOOTH);
	private static Image img_black = new ImageIcon(Frame01.class.getResource("/project/custom/image/blacklist.jpg"))
			.getImage().getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	private static Image img_blackDelete = new ImageIcon(
			Frame01.class.getResource("/project/custom/image/blackdelete.png")).getImage().getScaledInstance(154, 119,
					Image.SCALE_SMOOTH);
	private JPanel contentPane;
	private project.custom.panel.panelInput in;

	public static JButton btnInput = new JButton(new ImageIcon(img_cusotm));
	public static JButton btnCustomSearch = new JButton(new ImageIcon(img_search));
	public static JButton btnCustomCheck = new JButton(new ImageIcon(img_purchase));
	public static JButton btnCustomModify = new JButton(new ImageIcon(img_modify));
	public static JButton btnCustomDelete = new JButton(new ImageIcon(img_customDelete));
	public static JButton btnCustomBlackInput = new JButton(new ImageIcon(img_black));
	public static JButton btnCustomBlackDelete = new JButton(new ImageIcon(img_blackDelete));

	private final JLabel lblSearch = new JLabel("\uACE0\uAC1D\uC870\uD68C");
	private final JLabel lblLogo = new JLabel(new ImageIcon(img_logo));
	private final JLabel lblNewLabel_2 = new JLabel("ABC\uACE0\uAC1D \uB4F1\uB85D");
	private final JLabel lblCustomCheck = new JLabel("\uACE0\uAC1D \uAD6C\uB9E4\uB0B4\uC5ED");
	private final JLabel lblCustomModify = new JLabel("\uACE0\uAC1D\uC815\uBCF4 \uC218\uC815");
	private final JLabel lblCustomDelete_ = new JLabel("\uACE0\uAC1D\uC0AD\uC81C");
	private final JLabel lblCustomModify_1_1 = new JLabel("\uBE14\uB799\uACE0\uAC1D \uB4F1\uB85D");
	private final JLabel lblCustomModify_1_1_1 = new JLabel("\uBE14\uB799\uB4F1\uB85D \uD574\uC81C");

	public CoustomBtnMain() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(0, 0, 807, 533);
		setLayout(null);
		setBackground(new Color(255, 160, 122));
		btnCustomCheck.setBackground(Color.WHITE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 127, 80));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.setLayout(null);

		JPanel panelin = new JPanel();
		panelin.setLayout(null);
		panelin.setBackground(new Color(255, 165, 0));
		panelin.setBounds(2, 2, 803, 528);
		add(panelin);

		btnInput.setBounds(12, 153, 154, 119);
		panelin.add(btnInput);
		btnInput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnInput.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnInput.setIcon(new ImageIcon(img_cusotm));
			}
		});
		btnCustomSearch.setBounds(223, 153, 154, 119);
		panelin.add(btnCustomSearch);
		btnCustomSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCustomSearch
						.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCustomSearch.setIcon(new ImageIcon(img_search));
			}
		});
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

		btnCustomCheck.setBounds(428, 153, 154, 119);
		btnCustomCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCustomCheck
						.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCustomCheck.setIcon(new ImageIcon(img_purchase));
			}
		});
		panelin.add(btnCustomCheck);
		btnCustomModify.setBounds(636, 153, 154, 119);
		btnCustomModify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCustomModify
						.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCustomModify.setIcon(new ImageIcon(img_modify));
			}
		});

		panelin.add(btnCustomModify);
		btnCustomDelete.setBounds(12, 399, 154, 119);
		btnCustomDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCustomDelete
						.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCustomDelete.setIcon(new ImageIcon(img_customDelete));
			}
		});
		
		
		panelin.add(btnCustomDelete);
		btnCustomBlackInput.setBounds(223, 399, 154, 119);
		btnCustomBlackInput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCustomBlackInput
						.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCustomBlackInput.setIcon(new ImageIcon(img_black));
			}
		});
		
		
		
		panelin.add(btnCustomBlackInput);
		btnCustomBlackDelete.setBounds(428, 399, 154, 119);
		btnCustomBlackDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCustomBlackDelete
						.setIcon(new ImageIcon(ABC_emp_dpt_main.class.getResource("/project/staff/image/click.PNG")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCustomBlackDelete.setIcon(new ImageIcon(img_blackDelete));
			}
		});
		
		
		
		panelin.add(btnCustomBlackDelete);
		lblSearch.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		lblSearch.setBounds(262, 113, 79, 30);

		panelin.add(lblSearch);
		lblLogo.setBounds(636, 399, 154, 119);

		panelin.add(lblLogo);
		lblNewLabel_2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		lblNewLabel_2.setBounds(34, 113, 118, 30);

		panelin.add(lblNewLabel_2);
		lblCustomCheck.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		lblCustomCheck.setBounds(446, 113, 118, 30);

		panelin.add(lblCustomCheck);
		lblCustomModify.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		lblCustomModify.setBounds(655, 113, 118, 30);

		panelin.add(lblCustomModify);
		lblCustomDelete_.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		lblCustomDelete_.setBounds(54, 359, 79, 30);

		panelin.add(lblCustomDelete_);
		lblCustomModify_1_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		lblCustomModify_1_1.setBounds(244, 359, 118, 30);

		panelin.add(lblCustomModify_1_1);
		lblCustomModify_1_1_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		lblCustomModify_1_1_1.setBounds(446, 359, 118, 30);

		panelin.add(lblCustomModify_1_1_1);

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
