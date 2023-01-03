package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramWriteFile1 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning","Good afternoon","Good night"};
		
		String path = "c:\\temp\\out.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			//o true nao recria o arquivo out, apenas acrescenta linhas
			for (String line : lines) {
				bw.write(line);
				bw.newLine();//Quebra de linha
			}
		}
        catch(IOException e) {
        	e.printStackTrace();
        }
	}	
}
