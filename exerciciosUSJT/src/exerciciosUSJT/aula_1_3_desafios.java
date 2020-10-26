package exerciciosUSJT;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class aula_1_3_desafios {
// ---------------------------- DIAS VIVIDOS ------------------------
//	public static void main(String[] args) {
//		
//		String idade = JOptionPane.showInputDialog("Insira sua idade","");
//		double diasVividos = Integer.parseInt(idade) * 365;
//		
//		JOptionPane.showMessageDialog(null, diasVividos);
//	}
	
	// ============== DATA VALIDADA ==================================//
//	public static void main(String[] args) {
//
//		Scanner ler = new Scanner(System.in);
//
//		int dia, mes, ano, invalida=0;
//
//		System.out.println("Informe o dia: ");
//
//		dia = ler.nextInt();
//
//		System.out.println("Informe o mes: ");
//
//		mes = ler.nextInt();
//
//		System.out.println("Informe o ano: ");
//
//		ano = ler.nextInt();
//
//		String Data = new String(dia+"/"+mes+"/"+ano);
//
//		if (dia <1 || dia > 31) invalida = 1;
//
//		else if (mes < 1 || mes > 12) invalida =1;
//
//		else if (ano < 1) invalida = 1;
//
//		if (invalida == 0)
//
//		{
//
//		System.out.println(Data+" é uma data valida");
//
//		}else{
//
//		System.out.println(Data+" nao é uma data valida");
//
//		}
//	}
//	
//}

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Insira um número: ");
		numero = ler.nextInt();
		
		System.out.println("O número é: "+ numero +", seu antecessor é "+ (numero - 1) +" e "
				+ "seu sucessor é "+ (numero + 1) +".");
		
	}}

