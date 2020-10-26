package exerciciosUSJT;
import javax.swing.JOptionPane;

public class aula1_1 {

	public static void main(String[] args) {
		
//		String nome = "Gabriel Moreira";
//		String lerNome = JOptionPane.showInputDialog("Digite seu nome", "Digite aqui");
//		
//		System.out.println("Gabriel");
//		System.out.println(nome);
////		System.out.println("O nome digitado é "+lerNome+"!!!");
//		
//		JOptionPane.showMessageDialog(null, lerNome);
		
		String n1 = JOptionPane.showInputDialog("Digite um número", "Digite aqui");
		String n2 = JOptionPane.showInputDialog("Digite um segundo número", "Digite aqui");
		
		int soma = Integer.parseInt(n1) + Integer.parseInt(n2);
		JOptionPane.showMessageDialog(null, soma);
		
		
	}

}
