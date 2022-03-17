package Laba4;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;


public class Image extends JComponent {

	BufferedImage image;
	
	public Image() {
		// получаем изображение и проверяемм на доступность
		try 
		{
			//image = ImageIO.read(new File("src//main//resources//logo.jpg"));
			image = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("logo.jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g)
    {
        if(image == null) return;
        // Отображение рисунка в левом верхнем углу.
        g.drawImage(image, 0, 0, 120,100, null);
    }	
}
