package Sele��o;
import java.util.Scanner;
public class sele��o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner codigo = new Scanner(System.in);
		System.out.println("digite o codigo da regi�o do produto:");
		int cod = codigo.nextInt();
		if (cod == 1)
			System.out.println("Produto vindo da Regi�o Sul.");
		if (cod == 2)
			System.out.println("Produto vindo da Regi�o Norte.");
		if (cod == 3)
			System.out.println("Produto vindo da Regi�o Leste.");
		if (cod ==4)
			System.out.println("Produto vindo da Regi�o Oeste.");
		if (cod == 5 ||cod== 6)
			System.out.println("Produto vindo da Regi�o Nordeste.");
		if (cod == 8||cod== 7||cod== 9)
			System.out.println("Produto vindo da Regi�o Sudeste.");
		if (cod == 10)
			System.out.println("Produto vindo da Regi�o Centro Oeste.");
		if (cod == 11)
			System.out.println("Produto vindo da Regi�o Noroeste.");
		if (cod < 1||cod>11)
			System.out.println("Produto importado ");
		codigo.close();
		
	}

}
