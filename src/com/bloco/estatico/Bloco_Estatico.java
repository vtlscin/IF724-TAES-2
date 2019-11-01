package com.bloco.estatico;

public class Bloco_Estatico {
	
	static int x;
	
	static 
	{
		int b = 1;
		x = x + b;
		int c = 1;
	}
	
	public static void printValor()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		printValor();
	}

}
