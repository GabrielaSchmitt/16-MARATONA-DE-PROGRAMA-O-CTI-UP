/*
João está trabalhando em uma mina, tentando retirar o máximo que consegue de diamantes "<>". Ele deve excluir todas as particulas de areia "." 
do processo e a cada retirada de diamante, novos diamantes poderão se formar. Se ele tem como uma entrada .<...<<..>>....>....>>>., três diamantes 
são formados. O primeiro é retirado de <..>, resultando  .<...<>....>....>>>. Em seguida o segundo diamante é retirado, restando .<.......>....>>>. 
O terceiro diamante é então retirado, restando no final .....>>>., sem possibilidade de extração de novo diamante.

Entrada:
Deve ser lido um valor inteiro N que representa a quantidade de casos de teste. Cada linha a seguir é um caso de teste que contém até 1000 caracteres, 
incluindo "<,>, ."

Saída:
Você deve imprimir a quantidade de diamantes possíveis de serem extraídos em cada caso de entrada.

      input              |      output
___________________________________________________
2 			 |  3
<..><.<..>>		 |  1
<<<..<......<<<<....>    |                                 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Diamante {
	final static String areia = ".";
	final static String pedra = ",";
	final static String diamante = "<>";
	final static String nada = "";
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(ir);
	    int Linhas = Integer.parseInt(in.readLine());
	    ArrayList<String> listaMinas = new  ArrayList<String>();
	    
	    for(int i = 0; i < Linhas ; i ++) {
	    	listaMinas.add(in.readLine());
	    }	    	    
    
		for (String mina : listaMinas) {
		  	String minaLimpa = mina.replace(areia,nada);
		    minaLimpa = minaLimpa.replace(pedra,nada);
		    int diamantes = 0;
		    while( minaLimpa.contains(diamante) ) {
		    	minaLimpa = minaLimpa.replaceFirst(diamante, nada);
		    	diamantes++;
		    }
		    System.out.println(Integer.toString(diamantes));
		}
		    
	}
}
