package auto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Auto> autos = new ArrayList<>();

		autos.add(new Auto(Color.BLACK, new Kermo(25, true), new Kolesa(66,
				Gum.WINTER), new Kuzov(TypeKuzov.SEDAN)));
		autos.add(new Auto(Color.RED, new Kermo(22, true), new Kolesa(66,
				Gum.SUMMER), new Kuzov(TypeKuzov.SEDAN)));
		autos.add(new Auto(Color.YELLOW, new Kermo(21, false), new Kolesa(66,
				Gum.WINTER), new Kuzov(TypeKuzov.COUPE)));
		autos.add(new Auto(Color.BLACK, new Kermo(32, false), new Kolesa(66,
				Gum.DEMISEASON), new Kuzov(TypeKuzov.HATCHBACK)));
		autos.add(new Auto(Color.BLACK, new Kermo(25, true), new Kolesa(66,
				Gum.WINTER), new Kuzov(TypeKuzov.SEDAN)));
		Scanner sc = new Scanner(System.in);
		boolean isRun= true;
		while(isRun){

		System.out.println("Enter 1 for enter typeKuzov for delete  car");
		System.out.println("Enter 2 for enter size Koleso for change  car");
		System.out
				.println("Enter 3 for enter typeKuzov and size of kermo for delete  car");
		switch (sc.next()) {

		case "1": {
			System.out.println("enter typeKuzov");
			for (int i = 0; i < TypeKuzov.values().length; i++) {
				System.out.println("Enter " + i + " to chose "
						+ TypeKuzov.values()[i]);

			}
			int index = sc.nextInt();
			TypeKuzov typeKuzov = TypeKuzov.values()[index];
			Iterator<Auto> iterator = autos.iterator();

			while (iterator.hasNext()) {
				Auto auto = iterator.next();
				if (auto.getTypeKuzov() == typeKuzov) {

					iterator.remove();

				}

			}
			break;
		}
		case "2": {
			System.out.println("enter MinSize Koleso");
			int minSize = sc.nextInt();
			System.out.println("enter MaxSize Koleso");
			int maxSize = sc.nextInt();
			Iterator<Auto> iterator1 = autos.iterator();
			while (iterator1.hasNext()) {
				Auto auto2 = (Auto) iterator1.next();
				if (auto2.getDiametrKolesa() > minSize
						&& auto2.getDiametrKolesa() < maxSize) {
					auto2.reGuming(Gum.WINTER);
				}
			}

		}
			break;

		case "3": {
			System.out.println("enter typeKuzov");
			for (int i = 0; i < TypeKuzov.values().length; i++) {
				System.out.println("Enter " + i + " to chose "
						+ TypeKuzov.values()[i]);

			}
			int index = sc.nextInt();
			TypeKuzov typeKuzov = TypeKuzov.values()[index];
			System.out.println("enter MinSize kermo");

			int minSize = sc.nextInt();
			System.out.println("enter MaxSize kermo");
			int maxSize = sc.nextInt();
			Iterator<Auto> iterator2 = autos.iterator();
			while (iterator2.hasNext()) {
				Auto auto = (Auto) iterator2.next();
				if (auto.getTypeKuzov() == typeKuzov
						&& auto.getDiametrKermo() > minSize
						&& auto.getDiametrKermo() < maxSize) {
					iterator2.remove();
				}

			}

		}

		case "4": {
			System.out.println("enter typeKuzov");
			for (int i = 0; i < TypeKuzov.values().length; i++) {
				System.out.println("Enter " + i + " to chose "
						+ TypeKuzov.values()[i]);

			}
			int index = sc.nextInt();
			TypeKuzov typeKuzov = TypeKuzov.values()[index];

			Iterator<Auto> itarator3 = autos.iterator();
			while (itarator3.hasNext()) {
				Auto auto = (Auto) itarator3.next();
				if (auto.getTypeKuzov() == typeKuzov) {
					System.out.println("TYT mae buty INDEX");
				}

			}

		}
			break;

		default:isRun = false;
			
		}
		}

	}

}
