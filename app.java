
/*
* File: ButtonPanel.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft V
* Date: 2022-02-15
* Github: https://github.com/haribomaci/
* Licenc: GNU GPL
*/


import java.util.Scanner;
public class app {
	
	public static void main (String[] args) {
		System.out.println("Toth Julia, 2022-02-15");
		System.out.println("Feladat 0301");
		System.out.println("Kor alapu kup terfogata");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Sugar: ");
		double sugar = sc.nextDouble();
		
		System.out.print("Magassag: ");
		double magassag = sc.nextDouble();
		
		double terfogat = (1.0/3.0) *
						 Math.pow(sugar, 2) *
						 Math.PI *
						 magassag;
				
				
				System.out.println("Terfogat:" + terfogat);
		
		
		
		
	}
}

