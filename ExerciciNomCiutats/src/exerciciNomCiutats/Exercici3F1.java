package exerciciNomCiutats;

import java.util.* ;

public class Exercici3F1 {

	public static void main(String[] args) {
		
		String ciutat1;
		String ciutat2;
		String ciutat3;
		String ciutat4;
		String ciutat5;
		String ciutat6;
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Introduce los nombres de las ciudades por favor:");
		
		ciutat1 = input.nextLine();
		ciutat2 = input.nextLine();
		ciutat3 = input.nextLine();
		ciutat4 = input.nextLine();
		ciutat5 = input.nextLine();
		ciutat6 = input.nextLine();
		
		input.close();
		
		System.out.println("Las ciudades son: " + ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + ciutat4 + ", " + ciutat5 + ", " + ciutat6 + "." );

	}

}
