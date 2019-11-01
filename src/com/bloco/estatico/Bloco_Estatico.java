package com.bloco.estatico;

public class Bloco_Estatico {
	
	static int x;
	
	static 
	{
		int a = 2;
		x = a + a;
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
