package Laba4; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {
	public subversion() {
		JFrame main_GUI = new JFrame("subversion");	
		main_GUI.setTitle ("Using subversion for developers");
		main_GUI.setBounds(500,400,400,420);
		main_GUI.setResizable(false); 
		
		JPanel main_panel = new JPanel();
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		
		JLabel laba_info = new JLabel("Лабораторная работа №2");
		laba_info.setBounds(120,0,150,30);
		main_panel.add(laba_info);
		
		JButton button_exit = new JButton("Выход"); 
		button_exit.setBounds(260,300,120,40);
		ActionListener actionListener = new ListenerButton(); 
		button_exit.addActionListener(actionListener); 
		main_panel.add(button_exit);
		
		JButton button_info = new JButton("Информация");
		button_info.setBounds(30,300,120,40);
		Information info = new Information("Информация");
		ActionListener info_listener = new ListenerInformation(info);
		button_info.addActionListener(info_listener);
		main_panel.add(button_info);
		
		JMenu menuMain = new JMenu("Главная");
		JMenuBar menuBar = new JMenuBar();
		JMenuItem menu1 = new JMenuItem("Отобразить логотип УГАТУ");
		JMenuItem menu2 = new JMenuItem("Отсортировать данные в проекте1");
		JMenuItem menu3 = new JMenuItem("Выход");
		JMenuItem menu4 = new JMenuItem("Загрузить файл в проект1");
		menuMain.add(menu1);
		menuMain.add(menu2);
		menuMain.add(menu4);
		menuMain.add(menu3);
		menuBar.add(menuMain);
		main_GUI.setJMenuBar(menuBar);
		menu4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				File file = new File();
				if (file.getCanUseFile()) {
					info.getArea().setText("");
					info.setInfoToLabels(file.getlines());
				}
			}
		});
		
		
		Image logo = new Image(); 
		ActionListener logo_image = new ListenerLogo(main_GUI,main_panel,logo);
		menu1.addActionListener(logo_image);
		menu3.addActionListener(actionListener);
		
		String[] transfer = {"Переместить логотип УГАТУ в верхний правый угол", "Переместить логотип УГАТУ в середину", "Переместить логотип УГАТУ в верхний левый угол"};
		JComboBox combo_student = new JComboBox(transfer);
		combo_student.setBounds(30,260,350,30);
		main_panel.add(combo_student);
		TransferLogo logomove = new TransferLogo(main_panel,logo);
		combo_student.addActionListener(logomove);
	
		JTextField input = new JTextField();
		input.setBounds(30,220,80,30);
		main_panel.add(input);
		
		JLabel label1 = new JLabel("Введите сторону квадрата (см):");
		label1.setBounds(30,180,300,40);
		main_panel.add(label1);
	
		JLabel labelResult = new JLabel("");
		labelResult.setBounds(230,212,300,40);
		main_panel.add(labelResult);
		
		JButton calcButton = new JButton("Расчет");
		calcButton.setBounds(120,220,80,30);
		main_panel.add(calcButton);
		calcButton.addActionListener(new ListenerCalcButton(input, labelResult));
		
		main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		subversion student= new subversion();	
	}

}
