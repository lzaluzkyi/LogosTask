package auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 
		List<Auto> list = new ArrayList<>();
		Auto car1 = new Auto(Color.BLUE, 
				new Kermo(22, true),
				new Kolesa(55, Gum.SUMMER),
				new Kuzov(TypeKuzov.SEDAN));
		list.add(car1);
		Auto car2 = new Auto(Color.BLUE, 
				new Kermo(23, true),
				new Kolesa(55, Gum.SUMMER),
				new Kuzov(TypeKuzov.SEDAN));
		list.add(car2);
		Auto car3 = new Auto(Color.BLUE, 
				new Kermo(24, true),
				new Kolesa(55, Gum.SUMMER),
				new Kuzov(TypeKuzov.SEDAN));
		list.add(car3);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while(isRun){
			
		   System.out.println("press 1 to add new car to list");
		   System.out.println("press 2 to show all cars");
		   System.out.println("press 3 to show all cars by kolesa");
		   System.out.println("press 4 to  show all cars by kolesa and color");
		   System.out.println("press 5 to  enter color and change size of kermo");
		   System.out.println("press 6 to  Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки. ");
		   switch (sc.next()) {
		case "1":{
			System.out.println("enter type of kuzov");
			TypeKuzov kuzov = TypeKuzov.valueOf(sc.next().toUpperCase());
			System.out.println("enter Color");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("enter size of kolesa");
			int kolesa = sc.nextInt();
			System.out.println("Enter type of kolesa");
			Gum typeGum = Gum.valueOf(sc.next().toUpperCase());
			System.out.println("Enter size of kermo");
			int diametrKermo = sc.nextInt();
			System.out.println("Have buttons in kermo ?");
			boolean buttons = sc.nextBoolean();
			Auto auto = new Auto(color, 
					new Kermo(diametrKermo, buttons), 
					new Kolesa(kolesa, typeGum), 
					new Kuzov(kuzov));
			list.add(auto);
			break;
		}
		
	case "2":{
		for (Auto auto : list) {
			System.out.println(auto);
		}
		
		
		
	}
			
			break;
	case "3":{
		
		System.out.println("enter size of kolesa");
		int kolesa = sc.nextInt();
		for (Auto auto : list) {
			
			if(auto.getDiametrKolesa()==kolesa){
				System.out.println(auto);
				
				
			}
		}
		
		}
	
	
	break;
	case "4":{
		
		System.out.println("enter size of kolesa");
		int kolesa = sc.nextInt();
		System.out.println("enter Color");
		Color color = Color.valueOf(sc.next().toUpperCase());
		
		for (Auto auto : list) {
			
			if(auto.getDiametrKolesa()==kolesa&&auto.color==color){
				System.out.println(auto);
					}
				}
		
	
			}
		break;
	case "5":{
		System.out.println("enter Color");
		Color color = Color.valueOf(sc.next().toUpperCase());
		for (Auto auto : list) {
			
			if ( auto.color==color){
				
			
				auto.reSizingKermo(+25);
				
			}
		}

	}
	break;
	case "6":{
		for (Auto auto : list) {
			if (auto.isButtons()==true){
				System.out.println("-------------");
				auto.reSizingKolesa(auto.getDiametrKolesa()*2);
				System.out.println(auto);
			}
		}
		
		
		
		
	}
	break;
default:
isRun=false;
	
	
	
	
	
	
	
		
		   }
		}
	}
		
	}



	
		
		
		
	
		// TODO Auto-generated method stub

	
	
	
