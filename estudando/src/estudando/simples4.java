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
