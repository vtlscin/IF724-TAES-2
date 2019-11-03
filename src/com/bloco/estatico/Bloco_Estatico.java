package com.bloco.estatico;

public class Bloco_Estatico {
	
	static int x;
	static int a;
	
	static 
	{
		int b = 1;
		int a = 2;
		x = a + a;
	}
	public static void printValor(int b)
	{
		System.out.println(x + b);
	}
	
	public static void main(String[] args) 
	{
		printValor(a);
	}

}
