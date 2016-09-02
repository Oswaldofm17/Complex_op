package main;

import java.util.*;
import complex.Complex;

public class Main {
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int opcion;
		Complex complejo1 = new Complex(0,0);
		Complex complejo2 = new Complex(0,0);
		Complex complejo3 = new Complex (0,0);
		//complejo.setReal(3);
		//complejo.setImg(2);		
		//Escaneo numeros imaginarios
		System.out.println("Ingresa el primer numero real: ");
		complejo1.setReal(scan.nextInt());
		System.out.println("Ingresa el primer numero imaginario: ");
		complejo1.setImg(scan.nextInt());
		System.out.println("Ingresa el segundo numero real: ");
		complejo2.setReal(scan.nextInt());
		System.out.println("Ingresa el segundo numero imaginario: ");
		complejo2.setImg(scan.nextInt());
		//Muestra ambos números
		System.out.println("Primer número complejo: " + complejo1.getReal()+ " + "+ complejo1.getImg()+"i");
		System.out.println("Segundo número complejo: " + complejo2.getReal()+ " + "+ complejo2.getImg()+"i");
		//Toma de decision
		do
		{
		System.out.println("Qué operación desea realizar?\n 1) Suma\n2)Resta");
		opcion = scan.nextInt();
		}while(opcion > 2 || opcion < 1);
		switch(opcion)
		{
			case 1:
			{
				//Suma de complejos
				complejo3.sum(complejo1, complejo2);
				if(complejo3.getImg() < 0)
					System.out.println("La suma es = " + complejo3.getReal() + " " +complejo3.getImg() + "i");
				else
					System.out.println("La suma es = " + complejo3.getReal() + " + " + complejo3.getImg() + "i");
				break;
			}
			case 2:
			{
				//Suma de complejos
				complejo3.resta(complejo1, complejo2);
				if(complejo3.getImg()<0)
					System.out.println("La resta es = " + complejo3.getReal() + " " + complejo3.getImg() + "i");
				else
					System.out.println("La resta es = " + complejo3.getReal() + " + " + complejo3.getImg() + "i");
				break;
			}
		}
		
	}
}
