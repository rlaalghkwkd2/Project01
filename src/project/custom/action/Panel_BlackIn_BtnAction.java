package project.custom.action;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.custom.contoller.Black_Controller;
import project.custom.contoller.Custom_Select_Use_Black_Controller;
import project.custom.panel.panelBlackIn;



public class Panel_BlackIn_BtnAction implements ActionListener{
	Container card_panel;
	JTextField tTitle;
	JTextArea textarea;
	String card;
	
	public Panel_BlackIn_BtnAction(Container card_panel) {
		this.card_panel = card_panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<String> custom_info = new ArrayList<String>();
		ArrayList<String> custom_info_copy = new ArrayList<String>();
		
		this.tTitle = panelBlackIn.textcard;	
		this.textarea = panelBlackIn.textArea;
		card = this.tTitle.getText();
		
//		new Custom_Select_Controller().Custom_Card_select(card);
		new Custom_Select_Use_Black_Controller().Custom_Card_Select(card);
		new Black_Controller().Black_CardInsert(card);
		new Black_Controller().BlackCard_Select(card);
		
		panelBlackIn.textArea.setText("");
		
		text.add("[�� ID]: ");
		text.add("[�� �̸�]: ");
		text.add("[�� ����]: ");
		text.add("[�� ����]: ");		
		text.add("[�� ����ȣ]: ");
		text.add("[�� �̸���]: ");
		text.add("[�� �ּ�]: ");
		text.add("[�� ī���ȣ]: ");
		text.add("[��ϻ���]: ");
		text.add("[�����]: ");
		
		for(int i = 0; i < Black_Controller.mo.size(); i++) {
			custom_info.add(text.get(i%10)+Black_Controller.mo.get(i));
		}
		textarea.append("[����� ȸ������]\n");
		for(int j = 0; j < custom_info.size(); j++) {	
			tTitle.setText(custom_info.get(j));			
			String stext = tTitle.getText();
			textarea.append(stext + "\n");
			tTitle.setText("");	
			textarea.setFont(new Font("SansSerif", Font.BOLD, 16));
			
	}	
		System.out.println("������Ʈ ��� �Ϸ�");
		
		
		panelBlackIn.reason.setText("");
		panelBlackIn.textcard.setText("");
		custom_info_copy.addAll(Black_Controller.mo);
		Black_Controller.mo.removeAll(custom_info_copy);
	}

}
