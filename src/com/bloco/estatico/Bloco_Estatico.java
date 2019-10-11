package com.bloco.estatico;

public class Bloco_Estatico {
	
	static int x;
	
	static 
	{
		int y = 1;
		x = x + y;
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
