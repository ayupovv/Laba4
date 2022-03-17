package Laba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TransferLogo implements ActionListener {
	private JPanel panel;
	private Image logo;
	public TransferLogo(JPanel panel, Image logo) {
		this.panel = panel;
		this.logo = logo;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox box = (JComboBox)e.getSource();
		String item = (String)box.getSelectedItem();
		
		if(logo==null) 
		{}
		else
		{
        
		if (item=="Переместить логотип УГАТУ в верхний правый угол") 
		{
			logo.setLocation(250, 30);
			panel.repaint(); 	
	
		}
		
		if (item=="Переместить логотип УГАТУ в середину") 
		{
			logo.setLocation(150, 30);
			panel.repaint(); 
		}
		
		if (item=="Переместить логотип УГАТУ в верхний левый угол") 
		{
			logo.setLocation(50, 30);
			panel.repaint();
		}
		}
	}
}
