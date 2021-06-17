package curs3Abstraction;

public class TestShape {

	public static void main(String[] args) {

		Shape shape = new Rectangle(44, 22);
		shape.printStatement();
		System.out.println(shape.calculateArea());
		
	}

}
