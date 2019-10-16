package com.Exercise10_1Subprogramas.app;
import java.util.Scanner;
public class Subprogramas {

	public static void main(String[] args) {
		int  num1=0;
		int num2=0;
		int result=0;
		String mensaje;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println(Nombre("IVAN"));
		
		PedirDato();
		num1=input.nextInt();
		
		PedirDato();
		num2=input.nextInt();
		
		result= SumaDatos( num1,num2);
		System.out.println("La Suma es: "+result);
		
		

	}
	
	public static void PedirDato()
	{
		System.out.println("Introduzca un Numero");
	}
	
	
	public static String Nombre(String mensaje)
	{
		return "Hola "+ mensaje;
	}
	
	
	public static int SumaDatos(int num1,int num2)
	{
		return num1+num2;
	}
	

}
