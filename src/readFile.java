import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class readFile {

	JFileChooser fileChooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();
 
	public void PickMe() throws Exception{
	if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
		File file = fileChooser.getSelectedFile();
		Scanner input = new Scanner(file);
		while(input.hasNext()){
			sb.append(input.nextLine());
			sb.append("\n");
		}
		input.close();
	} else{
		sb.append("No file was selected");
	}
	}
}
	
