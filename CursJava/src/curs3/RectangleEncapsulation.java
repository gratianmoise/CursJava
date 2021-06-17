package curs3;

public class RectangleEncapsulation {


		private double lenght;
		private double width;
		
		
		public RectangleEncapsulation(double lenght, double width) {
			setLenght(lenght);
			setWidth(width);
			
		}
		
		public RectangleEncapsulation() {
			// TODO Auto-generated constructor stub
		}

		public double setLenght(double lenght) {
			return this.lenght = lenght;
		}
		
		public double getLenght() {
			return lenght;
		}
		
		public double setWidth(double width) {
			return this.width = width;
		}
		
		public double getWidth() {
			return width;
		}
		
		double calculeazaPerimetrul(){
			return(2 * lenght + 2 *width);
		}
		double calculeazaAria() {
			return lenght * width;
		}
		
}

