package curs4.Array;

public class ArrayExample1 {

	public static void main(String[] args) {

		String [] textArray = new String[4];
		
		textArray[0] = "This";
		textArray[1] = "is";
		textArray[2] = "an";
		textArray[3] = "Array";
		
		
		
	///System.out.println(textArray[0] + textA);
		
		for(int i=0; i<textArray.length; i++) {
			System.out.print(textArray[i] + " ");
		}
	}

}
