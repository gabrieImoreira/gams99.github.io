

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class leituraArquivo {
	public static void escreverTexto(String caminho, String Txt) {
		
		try (
			
			FileWriter cria = new FileWriter(caminho, false);
			BufferedWriter buffer = new BufferedWriter(cria);
			PrintWriter escritor = new PrintWriter(buffer);
			){
			
			
			escritor.append(Txt);
				
		}catch(IOException e){
			e.printStackTrace();
		}
}}

