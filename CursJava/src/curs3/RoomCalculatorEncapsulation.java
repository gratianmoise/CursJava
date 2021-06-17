package curs3;

public class RoomCalculatorEncapsulation {

	public static void main(String[] args) {

		//obiect 1
		RectangleEncapsulation room1 = new RectangleEncapsulation(22, 34);
		System.out.println("Perimetrul camerei este :" + room1.calculeazaPerimetrul());
		
		
		
		//obiect2
		RectangleEncapsulation room2 = new RectangleEncapsulation();
		room2.setLenght(25);
		room2.setWidth(12);
		System.out.println("Perimetrul camerei nr 2 este :" + room2.calculeazaPerimetrul());
		
		double perimetruTotal = room1.calculeazaPerimetrul() + room2.calculeazaPerimetrul();
		System.out.println("Perimetrul total este :" + perimetruTotal);
	}

}
