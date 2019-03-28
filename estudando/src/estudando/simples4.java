/* 4) Escreva um programa para calcular e imprimir o número de lâmpadas necessárias para iluminar um
determinado cômodo de uma residência. Dados de entrada: a potência da lâmpada utilizada (em
watts), as dimensões (largura e comprimento, em metros) do cômodo. Considere que a potência
necessária é de 18 watts por metro quadrado.
*/
package estudando;
import java.util.Scanner;
import  java.lang.Math;

public class simples4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Largura = new Scanner (System.in);
Scanner comprimento = new Scanner (System.in);		
		
	System.out.println("digite a largura do comodo em metros");
	double larg=  Largura.nextDouble(); 
	
	System.out.println("digite o comprimento do comodo em metros");
	double compri=  comprimento.nextDouble(); 
	double quadrado = compri * larg;
	double Num = quadrado / 18;
	
	System.out.println("O comodo possui " +quadrado+ " metros quadrados e precisa de "+(Math.round(Math.floor(Num))+1)+" lampadas");
	
	comprimento.close();
	Largura.close();
	
	}

}
