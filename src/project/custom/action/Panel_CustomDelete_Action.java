package project.custom.action;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.custom.contoller.Custom_Select_Controller;
import project.custom.panel.panelCustomDelete;

public class Panel_CustomDelete_Action implements ActionListener{

	Container card_panel;
	JTextField tTitle;
	JTextArea textarea;
	String card;
	
	public Panel_CustomDelete_Action(Container card_panel) {
		this.card_panel = card_panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<String> custom_info = new ArrayList<String>();
		ArrayList<String> custom_info_copy = new ArrayList<String>();
		
		this.tTitle = panelCustomDelete.textSearch;	
		this.textarea = panelCustomDelete.textArea;
		
		new Custom_Select_Controller().Custom_Card_select(tTitle.getText());
		panelCustomDelete.textArea.setText("");
		
		text.add("[�� ID]: ");
		text.add("[�� �̸�]: ");
		text.add("[�� ����]: ");
		text.add("[�� ����]: ");		
		text.add("[�� ����ȣ]: ");
		text.add("[�� �̸���]: ");
		text.add("[�� �ּ�]: ");
		text.add("[�� ī���ȣ]: ");
		text.add("[������]: ");
		for(int i = 0; i < Custom_Select_Controller.mo.size(); i++) {
			custom_info.add(text.get(i%9)+Custom_Select_Controller.mo.get(i));
		}
		textarea.append("[������ ������]\n");
		for(int j = 0; j < custom_info.size(); j++) {	
			tTitle.setText(custom_info.get(j));			
			String stext = tTitle.getText();
			textarea.append(stext + "\n");
			tTitle.setText("");	
			textarea.setFont(new Font("SansSerif", Font.BOLD, 18));
			
	}	
		custom_info_copy.addAll(Custom_Select_Controller.mo);
		Custom_Select_Controller.mo.removeAll(custom_info_copy);
	}
	
	
}
