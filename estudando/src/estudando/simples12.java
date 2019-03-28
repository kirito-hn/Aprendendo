/*Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius.
*/

package estudando;
import java.util.Scanner;
public class simples12 {

	public static void main(String[] args) {
		Scanner fahrenheit = new Scanner(System.in);		// TODO Auto-generated method stub
System.out.println("digite a temperatura em Fahrenheit:");
float grau = fahrenheit.nextFloat();
float converter =5*(grau - 32)/9;
System.out.println("A temperatura em Celsiust:" +converter);

fahrenheit .close();
}

}
