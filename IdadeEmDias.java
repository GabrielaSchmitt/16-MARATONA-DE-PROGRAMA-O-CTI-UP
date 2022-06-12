/* Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos 
de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas 
um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.

      input        |      output
_________________________________________
400                |  1 ano(s)
                   |  1 mes(es)
                   |  5 dia(s)
_________________________________________
800                |  2 ano(s)
                   |  2 mes(es)
                   |  10 dia(s)     
_________________________________________
30                 |  0 ano(s)
                   |  1 mes(es)
                   |  0 dia(s)        */
                   
                   
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiaMesAno{
	public static void main(String[] args) throws NumberFormatException, IOException {
				
		InputStreamReader ir = new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(ir);
	        
		int iValorEntrada = Integer.parseInt(in.readLine());
		
		int ano = iValorEntrada / 365;
		int mes = ( iValorEntrada - (ano * 365) ) / 30 ;
		int dias = iValorEntrada - ((ano * 365) + (mes*30));
		
		System.out.println(Integer.toString(ano) + " ano(s)");
		System.out.println(Integer.toString(mes) + " mes(es)");
		System.out.println(Integer.toString(dias)+ " dia(s)");
	}
}
                   
                   
