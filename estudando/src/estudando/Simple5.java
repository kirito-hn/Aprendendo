package estudando;

import java.util.Scanner;

public class Simple5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Largura = new Scanner(System.in);
		Scanner Comprimento = new Scanner(System.in);
		Scanner altura= new Scanner(System.in);
		System.out.println("digite a largura do comodo em metros");
		double Larg=Largura.nextDouble();
		
		System.out.println("digite a Altura do comodo em metros");
		double alt=altura.nextDouble();
		
		System.out.println("digite o comprimento  do comodo em metros");
		double comp=Comprimento.nextDouble();
		
		double metro1 =((alt*Larg)*2);
		double metro2 =((alt*comp)*2);
		double total= metro1+ metro2 ;
		
		double caixas = total/1.5;
		int iden;
		 //resultado das contas

double fracao = caixas % 1.0f;

if(fracao == 0.0f){
  iden=1;
}else{
  iden=0;
}
  if (iden ==1) {  
		System.out.println("O comodo possui " +total+ " metros quadrados e precisa de "+caixas+" caixas de azuleijo");
  
  }
		if (iden ==0) {
			System.out.println("O comodo possui " +total+ " metros quadrados e precisa de "+(Math.round(Math.floor(caixas))+1)+" caixas de azuleijo");
		
		altura.close();
		Largura.close();
		Comprimento.close();
		}
	}
	}
