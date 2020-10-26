package exerciciosUSJT;

import javax.swing.JOptionPane;
//import java.util.Scanner;


public class aula1_2 {
	
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Digite um número", "Digite aqui");
		String n2 = JOptionPane.showInputDialog("Digite um segundo número", "Digite aqui");
		
		int divisao = Integer.parseInt(n1) / Integer.parseInt(n2);
		double resto = Integer.parseInt(n1) % Integer.parseInt(n2);
		
		System.out.println(divisao);
		System.out.println(resto);
		
		
	}
}
