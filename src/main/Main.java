package main;

import java.util.*;
import complex.Complex;

public class Main {
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
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
		//Suma de complejos
		complejo3.sum(complejo1, complejo2);
		System.out.println("La suma es = " + complejo3.getReal() + " + " + complejo3.getImg() + "i");
	}
}
