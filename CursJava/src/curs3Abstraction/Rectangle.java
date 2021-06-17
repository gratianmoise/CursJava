package curs3Abstraction;

public class Rectangle extends Shape{
	
	private double lenght;
	private double width;
	
	

	@Override
	double calculateArea() {
		return 0;
	}

	
    //constructor
	public Rectangle(double lenght, double width) {
		super();
		this.lenght = lenght;
		this.setWidth(width);
	}


	public double getLenght() {
		return lenght;
	}



	public void setLenght(double lenght) {
		this.lenght = lenght;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}

}
