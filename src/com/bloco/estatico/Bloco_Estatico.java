package com.bloco.estatico;

public class Bloco_Estatico {
	
	static int x;
	
	static 
	{
		x = 1;
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
