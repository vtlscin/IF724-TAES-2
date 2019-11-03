package com.bloco.estatico;

public class Sem_Bloco_Estatico {

	 static int x = 4;
	 static int z = 3;
     static int y = 2;
	
	public static void soma (int x,int z)
	{
		int a = x + z;
		System.out.println(a+x);
		System.out.println(x+z);
	}
	
	public static void main(String[] args) 
	{
		soma(x,y);
	}
}
