*/1) Escreva um programa para ler o raio de um círculo, calcular e escrever a sua área.
    πR2
*/

package estudando;
import java.util.Scanner;

public class simples1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner Raio=new Scanner(System.in);
		      

		        System.out.println("Digite o raio do circulo: ");
		        int num=Raio.nextInt(); 

		        double quadrado= num*num;
		        double resul = quadrado*3.14;

		        System.out.println("O Circulo Raio " +num+  "\n possui area  igual á: "+resul); 
Raio.close();
		    } 
		
		
	}


