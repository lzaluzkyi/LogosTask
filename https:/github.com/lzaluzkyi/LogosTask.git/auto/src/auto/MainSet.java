package auto;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Auto> autos = new LinkedHashSet<>();
		autos.add(new Auto(Color.BLACK, new Kermo(25, true), new Kolesa(66,
				Gum.WINTER), new Kuzov(TypeKuzov.SEDAN)));
		autos.add(new Auto(Color.RED, new Kermo(22, true), new Kolesa(66,
				Gum.SUMMER), new Kuzov(TypeKuzov.SEDAN)));
		autos.add(new Auto(Color.YELLOW, new Kermo(21, false), new Kolesa(66,
				Gum.WINTER), new Kuzov(TypeKuzov.COUPE)));
		autos.add(new Auto(Color.BLACK, new Kermo(32, false), new Kolesa(66,
				Gum.DEMISEASON), new Kuzov(TypeKuzov.HATCHBACK)));
		
		
		Scanner sc =new Scanner(System.in);
		boolean isRun= true;
		while(isRun){
		
		System.out.println("1. Машинам, які мають вказаний колір кузова та вказаний діаметр колеса, змінити тип шин на вказаний. ");
		System.out.println("2. Видалити машини, діаметр колес яких попадає у вказаний діапазон. ");
		System.out.println("3. Знайти машини, які мають вказаний тип шин та діаметр коліс яких попадає у вказаний діапазон. ");
		
		switch (sc.next()) {
		case "1":{
			System.out.println("enter Color");
			for (int i = 0; i < Color.values().length; i++) {
				System.out.println("Enter " + i + " to chose "
						+ Color.values()[i]);

			}
			int index = sc.nextInt();
			Color color = Color.values()[index];
			System.out.println("Enter size koleso");
			int koleso = sc.nextInt();
			System.out.println("enter type of Kolesa");
			for (int i = 0; i < Gum.values().length; i++) {
				System.out.println("Enter " + i + " to chose "
						+ Gum.values()[i]);

			}
			int indexKolesa = sc.nextInt();
			Gum typeGum = Gum.values()[indexKolesa];
			
			for (Auto auto : autos) {
				if (auto.color==color&&auto.getDiametrKolesa()==koleso){
					auto.reGuming(typeGum);
				}
			}
			

		}
			
			break;
		case "2":{
			System.out.println("enter min size of kolesa");
			int maxSize = sc.nextInt()	;
			System.out.println("enter max size of kolesa");
			int minSize = sc.nextInt()	;
			Iterator<Auto> iterator = autos.iterator();
			while (iterator.hasNext()) {
				Auto auto = (Auto) iterator.next();
				if(auto.getDiametrKolesa() > minSize
						&& auto.getDiametrKolesa()<maxSize){
					iterator.remove();
				}
			}
		}
			
			break;

		case "3":{
			System.out.println("Enter type of kolesa");
			for (int i = 0; i < Gum.values().length; i++) {
				System.out.println("entre "+i+"to chouse " + Gum.values()[i]);
				
				
			}
			int index = sc.nextInt();
			Gum typeGum = Gum.values()[index];
			System.out.println("enter maxSize kolesa");
			int maxSize = sc.nextInt();
			System.out.println("enter minSize kolesa");
			int minSize = sc.nextInt();
			for (Auto auto : autos) {
				if (auto.getTypeGum()==typeGum&&auto.getDiametrKolesa()>minSize&&auto.getDiametrKolesa()<maxSize){
					System.out.println(auto);
				}
				
			}
			
		}
	
			break;


		default:isRun = false;
		}
		}

	}

}
