package com.bloco.estatico;

public class Bloco_Estatico {
	
	static int x;
	
	static 
	{	
		int z = 3;
		x = z + 4;
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
