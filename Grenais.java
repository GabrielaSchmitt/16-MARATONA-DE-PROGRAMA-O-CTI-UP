/*A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a mensagem "Novo 
grenal (1-sim 2-nao)" e solicitar uma resposta. Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número 
de gols marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. 
Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". Quando o algoritmo for encerrado devem 
ser mostradas as estatísticas conforme a descrição apresentada acima. Obs: a palavra "Gremio" deve ser impressa sem acento, 
conforme o exemplo abaixo.

      input              |           output
_____________________________________________________
3 2                      | Novo grenal (1-sim 2-nao)
1                        | Novo grenal (1-sim 2-nao)
2 3                      | Novo grenal (1-sim 2-nao)
1                        | 3 grenais
3 1                      | Inter:2
2                        | Gremio:1
                         | Empates:0
                         | Inter venceu mais
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grenais {
	public static int golsgremio;
	public static int golsInter;
	public static int vicGremio;
	public static int vicInter;
	public static int empate;
	public static int grenais;
	 
	public static void main(String[] args)  throws IOException {
		
	    golsgremio = 0;
	    golsInter = 0;
	    vicGremio = 0;
	    vicInter = 0;
	    empate = 0;
	    grenais = 0;
	    
	    InputStreamReader ir = new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(ir);
	    boolean response;
	    do {
	    	atualizaPlacar();
	    	System.out.println("Novo grenal (1-sim 2-nao)");
	    	String resposta = in.readLine();
	    	response = resposta.contains("1");
	    }while(response);
	    String timeVencedor = "Inter";
	    if (vicInter < vicGremio) {
	    	timeVencedor = "Gremio";
	    }
	    	
	    System.out.println(Integer.toString(grenais)+" grenais");
	    System.out.println("Inter:"+Integer.toString(vicInter));
	    System.out.println("Gremio:"+Integer.toString(vicGremio));
	    System.out.println("Empates:"+Integer.toString(empate));
	    System.out.println(timeVencedor+" venceu mais");
		
	}
	public static void atualizaPlacar() throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(ir);
	    String linha = in.readLine();
	    String[] pontos = linha.split(" ");
	    golsInter= Integer.parseInt( pontos[0] );
	    golsgremio  = Integer.parseInt( pontos[1] );
	    grenais++;
	    if (golsgremio > golsInter) {
	    	vicGremio++;
		}else if(golsgremio < golsInter) {
			vicInter++;
		}else {
			empate++;
		}
	}
}
