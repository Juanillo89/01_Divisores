package divisores;

import java.util.Scanner;

public class Divisores
{		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce otro número entero para saber si es divisor del primero: ");		
		int num2 = sc.nextInt();
		while(num2 == 0)
		{
			System.out.println("No válido.");
			System.out.print("Introduce otro número entero para saber si es divisor del primero: ");
			num2 = sc.nextInt();
		}
		sc.close();
		if (num1 % num2 == 0)		
		{
			System.out.println("Si es divisor.");
		}
		else
		{
		System.out.println("No es divisor.");	
		}
	}
}
