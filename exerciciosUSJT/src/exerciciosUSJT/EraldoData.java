package exerciciosUSJT;
import javax.swing.JOptionPane;

public class EraldoData {

	public static void main(String[] args) {
		
		String data = JOptionPane.showInputDialog("Insira uma data: ", "");
		
		int a = Integer.parseInt(data.substring(0,2));
		System.out.println("Dia: " +a);
		if(a<1 || a>31) {
			System.out.println("O dia � inv�lido");
		}
		
		int b = Integer.parseInt(data.substring(2,4));
		System.out.println("M�s: " +b);
		
		if(b<1 || b>12) {
			System.out.println("O m�s � inv�lido");
		}
		
		int c = Integer.parseInt(data.substring(4,6));
		System.out.println("Ano: " + c);
		
}}

