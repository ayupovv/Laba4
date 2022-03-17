package Laba4;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class File {
	private boolean canUseFile;
	private List<String> lines;
	public File() {
		FileNameExtensionFilter filter = new FileNameExtensionFilter("text only","txt");
		JFileChooser fileopen = new JFileChooser("src/main/resources");
		fileopen.setFileFilter(filter);
		fileopen.setFileSelectionMode(JFileChooser.FILES_ONLY);
	
        int ret = fileopen.showDialog(null, "Открыть файл");                
        if (ret == JFileChooser.APPROVE_OPTION) {
            java.io.File file = fileopen.getSelectedFile();
            canUseFile = true;
        if (ret == fileopen.CANCEL_OPTION) {
        	canUseFile=false;
        }
        try {
            lines = Files.readAllLines(file.toPath());
            }catch (IOException e) {
				e.printStackTrace();
			}
        }
	}
	public List<String> getlines(){
		return lines;
	}
	public boolean getCanUseFile() {
		return canUseFile;
	}
}
