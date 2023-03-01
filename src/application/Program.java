package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Triangle x: ");
		System.out.print("Digite o valor de a: ");
		Double a = sc.nextDouble();
		System.out.print("Digite o valor de b: ");
		Double b = sc.nextDouble();
		System.out.print("Digite o valor de c: ");
		Double c = sc.nextDouble();
		Triangle x = new Triangle(a, b, c);
		
		System.out.println();
		
		System.out.println("Triangle Y: ");
		System.out.print("Digite o valor de a: ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = sc.nextDouble();
		Triangle y = new Triangle(a, b, c);
		
		System.out.println();
		
		System.out.println("Area triangle x = " + String.format("%.2f", x.area()));
		
		System.out.println("Area triangle y = " + String.format("%.2f", y.area()));
		
		if(x.area() > y.area()) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
