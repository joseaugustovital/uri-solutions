/*
URI Online Judge | 1066

 1001 - Pares, Ímpares, Positivos e Negativos
Adaptado por Neilor Tonin, URI Brasil 

Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.
Entrada

O arquivo de entrada contém 5 valores inteiros quaisquer.
Saída

Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		int par = 0, impar = 0,
		pos = 0, neg = 0;
		Scanner sc = new Scanner(System.in);
		int[] v = new int[5];

		for(int i = 0;i < 5;i++){
			v[i] = sc.nextInt();
		}

		for(int i = 0;i < 5;i++){
			if(v[i] % 2 == 0){
				par++;
			}
			else{
				impar++;
			}
			if(v[i] > 0){
				pos++;
			}
			else if(v[i] != 0){
				neg++;
			}
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");
	}
}
