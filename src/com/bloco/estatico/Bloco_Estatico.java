package com.bloco.estatico;

public class Bloco_Estatico {
	
	static int x;
	static int a;
	
	static 
	{
		int x = 1;
		int y = 2;
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
