package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AbstractShape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AbstractShape s1 = new Rectangle(Color.BLACK, 3.0, 4.0);
		AbstractShape s2 = new Circle(Color.WHITE, 2.0);
		
		System.out.println("Rectangle color: " + s1.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s1.area()));
		System.out.println("Circle color: " + s2.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s2.area()));
		
		sc.close();

	}

}
