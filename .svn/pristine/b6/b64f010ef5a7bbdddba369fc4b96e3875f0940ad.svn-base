package Laba4;

import java.awt.event.*;

import javax.swing.*;

public class ListenerCalcButton implements ActionListener {
private JTextField input;
private JLabel label;
	public ListenerCalcButton(JTextField input, JLabel label) {
		this.input = input;
		this.label = label;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Calculation calc = new Calculation();
		String str = input.getText();
		if (str.isEmpty()) {
			
		}else {
			try{
				calc.seta(Double.parseDouble(str));
				calc.calcSquare();
				label.setText(calc.toString());
			} catch(NumberFormatException e1) {
				label.setText("Введите число");
			}
		}
		
	}

}
