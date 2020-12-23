package project.custom.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import project.custom.action.Panel_Search_Action;
import project.custom.contoller.Custom_Select_Controller;
import project.custom.main.Frame01;

public class panelSearch extends JPanel {

	private Image img_logo = new ImageIcon(Frame01.class.getResource("/project/custom/image/search.jpg")).getImage().getScaledInstance(65,
			26, Image.SCALE_SMOOTH);
	private JTextField textSearch = new JTextField(20);
	static Vector<String> columnNames = new Vector<String>(
			Arrays.asList("��ȣ", "�̸�", "����", "����", "�ڵ���", "�̸���", "�ּ�", "ī���ȣ", "������"));
	public static DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);

	JTable table = new JTable(dtm);
	Vector rowData;
	private final JPanel panelTitle = new JPanel();
	private final JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC870\uD68C");

	public panelSearch() {
		setBackground(new Color(255, 160, 122));
		JPanel p = this;
		ListSelectionModel select = table.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		dtm = new DefaultTableModel(columnNames, 0) {
//			public boolean isCellEditable(int row, int column) {
//				 row = table.getSelectedRow();
//				 column = table.getSelectedColumn(); 
//				return false;
//			}
//		};
		
		
//		table.getColumnModel().getColumn(0).setPreferredWidth(5);
//		table.getColumnModel().getColumn(1).setPreferredWidth(5);
//		table.getColumnModel().getColumn(2).setPreferredWidth(5);
//		table.getColumnModel().getColumn(3).setPreferredWidth(5);
//		table.getColumnModel().getColumn(8).setPreferredWidth(5);
		
//		setBackground(new Color(255, 160, 122));
		setBorder(new LineBorder(new Color(0, 0, 0), 2));

		setBounds(0, 0, 807, 533);
		setLayout(null);

		
//		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
//        celAlignCenter.setHorizontalAlignment(JLabel.CENTER); ��� ���� �޼���
//        table.getColumn("�̸�").setCellRenderer(celAlignCenter);
//        table.getColumn("ī���ȣ").setCellRenderer(celAlignCenter);
////        table.getColumn("�繰��").setCellRenderer(celAlignCenter);
		
		
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(12, 158, 783, 363); 
		add(scrollpane);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("���� ��� Semilight", Font.PLAIN, 13));
		scrollpane.setViewportView(table);
		textSearch.addActionListener(new Panel_Search_Action(this, rowData, textSearch, table));
		textSearch.setBounds(12, 122, 250, 26);
		add(textSearch);

		JButton btnNewButton = new JButton(new ImageIcon(img_logo));
		btnNewButton.addActionListener(new Panel_Search_Action(this, rowData, textSearch, table));
//		btnNewButton.setFont(new Font("���� ��� Semilight", Font.PLAIN, 15));
		btnNewButton.setBounds(263, 122, 35, 26);
		add(btnNewButton);
		panelTitle.setBackground(new Color(255, 245, 238));
		panelTitle.setBounds(2, 2, 803, 69);

		add(panelTitle);
		panelTitle.setLayout(null);
		lblNewLabel.setFont(new Font("�޸�����ü", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 783, 49);

		panelTitle.add(lblNewLabel);
		ShowTable();
	}

	public void ShowTable() {
		new Custom_Select_Controller().allSelect();
		ArrayList<String> custom_info = new ArrayList<String>();
		for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
			dtm.removeRow(i);
		}
		rowData = new Vector();
		for (int i = 0; i < Custom_Select_Controller.mo.size();) {
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			if (i != 0 && i % 9 == 0) {
				dtm.addRow(rowData);
				rowData = new Vector();
				continue;
			}
			dtm.addRow(rowData);
		}
		custom_info.addAll(Custom_Select_Controller.mo);
		Custom_Select_Controller.mo.removeAll(custom_info);
		table.revalidate();
		table.repaint();
	}

}
