package Laba4;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

public class Information {
	private JFrame info_frame = new JFrame();
	private JTextArea textArea = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(textArea);
	public Information(String title) {
		info_frame.setTitle (title);
		info_frame.setBounds(100,400,400,300);
		info_frame.setResizable(false);
		
		JPanel info_panel = new JPanel();
		info_panel.setLayout(null);
		info_frame.add(info_panel);
		
		textArea.setLineWrap(true);
	    textArea.setWrapStyleWord(true);
	    textArea.setBackground(null);
	    textArea.setBorder(null);
	    textArea.setFocusable(false);
	    textArea.setEditable(false);
	    
	    textArea.setBounds(0,0,250,250);
	    scrollPane.setBounds(0,0,250,250);
	    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	    info_panel.add(scrollPane);
		
		JButton back = new JButton("Назад");
		back.setBounds(260,210,120,40);
		ActionListener back_listener = new ListenerButtonBack(info_frame);
		back.addActionListener(back_listener);
		info_panel.add(back);
		
		info_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void setVisibleFrame() {
		info_frame.setVisible(true);
	}
	public void setInfoToLabels(List<String> info) {
		for (String str : info) {
			textArea.setText(textArea.getText() + str + "\n" );
		}
	}
	public JTextArea getArea() {
		return textArea;
	}
	
}
