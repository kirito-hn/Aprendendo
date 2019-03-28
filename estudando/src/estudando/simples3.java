package estudando;

import java.util.Scanner;

public class simples3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Celsius = new Scanner(System.in);		// TODO Auto-generated method stub
System.out.println("digite a temperatura em Celsius:");
float grau = Celsius.nextFloat();
double converter = grau * 1.8 + 32 ;
System.out.println("A temperatura em Fahe:" +converter);
	
Celsius.close();
	}

}
