package curs3Polymorphism;

public class DemoOverrite {

	public static void main(String[] args) {

		Shape forma = new Shape();
		forma.draw();
		
		Shape cerc = new Circle();
		cerc.draw();
		
		Shape square = new Square();
		square.draw();
		
	}

}
