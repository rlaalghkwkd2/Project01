package project.custom.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import project.custom.action.ComboBoxInput_Action;
import project.custom.action.PanelUpdate_Search_Action;
import project.custom.contoller.Update_Contoller;
import project.custom.main.Frame01;

public class panelUpdate extends JPanel implements ItemListener {
	private JTextField textSearch;
	private JTextField textName;
	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/custom/image/search.jpg")).getImage().getScaledInstance(65,
			26, Image.SCALE_SMOOTH);
	public static String[] ponlist = { "010", "011", "019" };

	private JTextField tGender = new JTextField(5);
	private ButtonGroup bg = new ButtonGroup();
	public static JCheckBox checkMan = new JCheckBox("³²");
	public static JCheckBox checkWomen = new JCheckBox("¿©");
	private static String[] maillist = { "naver.com", "hanmail", "nate.com", "empas.com", "yahoo.co.kr", "hotmail.com",
			"gmail.com", "Á÷Á¢ÀÔ·Â", "" };
	public static DefaultComboBoxModel<String> eMdef = new DefaultComboBoxModel<String>(maillist);
	
	private JTextField textAge;
	private JTextField textPon00;
	private JTextField textPon01;
	private JTextField textPon02;
	private JTextField textEmail01;
	public static JTextField textEmail02;
	private JTextField textAddr;
	public static JComboBox ponBox;
	public static JComboBox eMailBox;

	public void UpdateCleanSet() {
		textSearch.setText("");
		textName.setText("");
		textAge.setText("");
		textEmail01.setText("");
		textEmail02.setText("");
		checkMan.setSelected(false);
		checkWomen.setSelected(false);
		ponBox.setSelectedItem(ponlist[0]);
		eMailBox.setSelectedItem(maillist[0]);
		textPon01.setText("");
		textPon02.setText("");
		textAddr.setText("");
	}

	public panelUpdate() {
		setBackground(new Color(255, 160, 122));

		setBounds(0, 0, 807, 533);
		setLayout(null);
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(255, 160, 122));
		panelMenu.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		panelMenu.setBounds(0, 0, 807, 533);
		add(panelMenu);
		panelMenu.setLayout(null);

		JLabel lblName = new JLabel("\uC774\uB984:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblName.setBounds(48, 175, 41, 24);
		panelMenu.add(lblName);

		JLabel lblYear = new JLabel("\uB098\uC774:");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblYear.setBounds(48, 226, 41, 24);
		panelMenu.add(lblYear);

		JLabel lblGender = new JLabel("\uC131\uBCC4:");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblGender.setBounds(48, 277, 41, 24);
		panelMenu.add(lblGender);

		JLabel lblPhone = new JLabel("\uD578\uB4DC\uD3F0:");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblPhone.setBounds(38, 328, 48, 24);
		panelMenu.add(lblPhone);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblEmail.setBounds(41, 379, 48, 21);
		panelMenu.add(lblEmail);

		JLabel lblAddr = new JLabel("\uC8FC\uC18C:");
		lblAddr.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddr.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblAddr.setBounds(48, 430, 41, 24);
		panelMenu.add(lblAddr);

		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(100, 177, 73, 26);
		textName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelMenu.add(textName);

		textSearch = new JTextField();
		textSearch.setBounds(145, 116, 250, 26);
		panelMenu.add(textSearch);
		textSearch.setColumns(10);
		textSearch.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		textAge = new JTextField();
		textAge.setBounds(100, 228, 73, 26);
		panelMenu.add(textAge);
		textAge.setColumns(10);
		textAge.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		DefaultComboBoxModel<String> ponDe = new DefaultComboBoxModel<String>(ponlist);
		ponBox = new JComboBox(ponDe);
		ponBox.setSelectedItem(ponlist[0]);
		ponBox.setBounds(100, 329, 73, 26);
		panelMenu.add(ponBox);
		textPon00 = new JTextField();
		panelMenu.add(textPon00);
		
		ponBox.addActionListener(new ComboBoxInput_Action(panelMenu, textPon00, ponlist));
		textPon01 = new JTextField();
		textPon01.setColumns(10);
		textPon01.setBounds(185, 330, 73, 26);
		panelMenu.add(textPon01);
		textPon01.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		textPon02 = new JTextField();
		textPon02.setColumns(10);
		textPon02.setBounds(270, 330, 73, 26);
		panelMenu.add(textPon02);
		textPon02.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		textEmail01 = new JTextField();
		textEmail01.setColumns(10);
		textEmail01.setBounds(100, 379, 90, 26);
		panelMenu.add(textEmail01);
		textEmail01.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		textEmail02 = new JTextField();
		textEmail02.setColumns(10);
		textEmail02.setBounds(210, 379, 90, 26);
		panelMenu.add(textEmail02);
		textEmail02.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		
		
		JLabel gol = new JLabel("@");
		gol.setHorizontalAlignment(SwingConstants.CENTER);
		gol.setBounds(188, 379, 23, 25);
		panelMenu.add(gol);

		

		eMailBox = new JComboBox(eMdef);
		eMailBox.setBounds(311, 378, 90, 26);
		eMailBox.addActionListener(new ComboBoxInput_Action(panelMenu, textEmail02, maillist));
		panelMenu.add(eMailBox);
		
		textAddr = new JTextField();
		textAddr.setColumns(10);
		textAddr.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textAddr.setBounds(100, 432, 250, 26);
		panelMenu.add(textAddr);
		textAddr.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textEmail02.setEditable(false);
		JLabel lblAge = new JLabel("\uC138");
		lblAge.setBounds(177, 227, 20, 26);
		panelMenu.add(lblAge);

		JButton btnSearch = new JButton(new ImageIcon(img_logo));
		btnSearch.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		btnSearch.setBounds(396, 116, 35, 26);
		panelMenu.add(btnSearch);
		checkMan.setBackground(new Color(255, 160, 122));

		checkMan.setBounds(97, 280, 41, 23);
		panelMenu.add(checkMan);
		checkWomen.setBackground(new Color(255, 160, 122));

		checkWomen.setBounds(145, 280, 41, 23);
		panelMenu.add(checkWomen);

		btnSearch.addActionListener(new PanelUpdate_Search_Action(this, textSearch, textName, textAge, tGender, textPon01,
				textPon02, textEmail01, textEmail02, textAddr));

		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(255, 245, 238));
		panelTitle.setBounds(2, 2, 803, 69);
		panelMenu.add(panelTitle);
		panelTitle.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4 \uC218\uC815");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 10, 779, 49);
		panelTitle.add(lblNewLabel);

		JButton btnUpdate = new JButton("\uC218\uC815");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Update_Contoller().Update_Modify(						
						textName.getText(),
						tGender.getText(),
						Integer.parseInt(textAge.getText()), 
						textPon00.getText() + "-" + textPon01.getText() + "-" + textPon02.getText(),
						textEmail01.getText() + "@" + textEmail02.getText(),
						textAddr.getText(),
						textSearch.getText());
				UpdateCleanSet();
			}
		});
		btnUpdate.setBounds(285, 497, 65, 26);
		panelMenu.add(btnUpdate);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 0, 0));
		textArea.setBackground(new Color(255, 215, 0));
		textArea.setRows(20);
		textArea.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		textArea.setText("\r\n                 \u203B\uC218\uC815 \uD560 \uC2DC \uC8FC\uC758\uD560 \uC810\r\n\t\t\r\n");
		textArea.setEditable(false);
		textArea.setBounds(511, 71, 294, 459);
		panelMenu.add(textArea);

		checkMan.addItemListener(this);
		checkWomen.addItemListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int selected = 0;
		// getStateChange()ÀÇ¹Ì´Â Ã¼Å©°¡ µÇÀÖ´Ù¸é SELECTED:Ã¼Å© / DESELECTED
		if (e.getStateChange() == ItemEvent.SELECTED) {
			selected = 1;
			if (e.getSource() == checkMan) {
				checkWomen.setSelected(false);
			} else {
				checkMan.setSelected(false);
			}
		} else
			selected = -1;
		if (e.getSource() == checkMan) {
			tGender.setText("³²");

		} else {
			tGender.setText(("¿©"));
		}

	}
}
