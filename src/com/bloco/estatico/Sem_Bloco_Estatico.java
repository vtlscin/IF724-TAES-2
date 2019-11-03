package com.bloco.estatico;

public class Sem_Bloco_Estatico {

	 static int x = 1;
     static int y = 2;
	
	public static void soma (int x,int y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) 
	{
		soma(x,y);
	}
}
