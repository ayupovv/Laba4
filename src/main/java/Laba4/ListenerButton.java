package Laba4;

import java.awt.event.*;

// класс реализующий слушатель (ожидание нажатия кнопки).
public class ListenerButton implements ActionListener {

	@Override 
	public void actionPerformed(ActionEvent arg0) {
		System.exit(1);
		
	}

	
}
