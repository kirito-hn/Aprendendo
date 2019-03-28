package Seleção;
import java.util.Scanner;
public class seleção1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner codigo = new Scanner(System.in);
		System.out.println("digite o codigo da região do produto:");
		int cod = codigo.nextInt();
		if (cod == 1)
			System.out.println("Produto vindo da Região Sul.");
		if (cod == 2)
			System.out.println("Produto vindo da Região Norte.");
		if (cod == 3)
			System.out.println("Produto vindo da Região Leste.");
		if (cod ==4)
			System.out.println("Produto vindo da Região Oeste.");
		if (cod == 5 ||cod== 6)
			System.out.println("Produto vindo da Região Nordeste.");
		if (cod == 8||cod== 7||cod== 9)
			System.out.println("Produto vindo da Região Sudeste.");
		if (cod == 10)
			System.out.println("Produto vindo da Região Centro Oeste.");
		if (cod == 11)
			System.out.println("Produto vindo da Região Noroeste.");
		if (cod < 1||cod>11)
			System.out.println("Produto importado ");
		codigo.close();
		
	}

}
