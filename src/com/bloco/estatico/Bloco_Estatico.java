package com.bloco.estatico;

public class Bloco_Estatico {
	
	static int x;
	
	static 
	{
		int a = 2;
		int b = 1;
		x = a + a;
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
