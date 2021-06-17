package curs3;

public class Rectangle {

	double lenght;
	double width;
	String name;
	
	double calculeazaPerimetrul(){
		return(2 * lenght + 2 *width);
	}
	double calculeazaAria() {
		return lenght * width;
	}
}
