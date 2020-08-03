

import java.util.Scanner;


public class generate {
	

	public static void realiza(String local, String sn)  {
		
		try (Scanner ler = new Scanner(System.in))  {
			int num = Integer.parseInt(sn);
			
			// Input of dados

			// String textoQueSeraEscrito = num;
			
			String string = Integer.toHexString(num); //convert int -> hex -> string
			System.out.println(string);
			while(string.length() < 4) { // only 4 strings 
				string = "0" + string;
			}	
			
			String p1 = string.substring(0,2);
			String p2 = string.substring(2,4);
			String hexInv = p2+p1;

			System.out.println(hexInv);
			
			String s = hexInv;
			StringBuilder sb = new StringBuilder(s.length() / 2);
			for (int i = 0; i < s.length(); i+=2) {
			    String hex = "" + s.charAt(i) + s.charAt(i+1);
			    int ival = Integer.parseInt(hex, 16);
			    sb.append((char) ival);
			}
			String ascii = sb.toString();
			leituraArquivo.escreverTexto(local+ "\\fab_serial.dat", ascii);
			System.out.println(ascii);
		}
		}
		
		
	}



