package zooclub;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Zooclub implements Serializable{
	
	private transient Scanner sc;

	private Map<Person, List<Pet>> map = new HashMap<>();
	
	
	public static Zooclub restore(){
		
		try(InputStream is = new FileInputStream( new File("save.dasdas"));
				ObjectInputStream ois = new ObjectInputStream(is)){
			return (Zooclub) ois.readObject();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return new Zooclub();
	}
	
	
	public void save(){
		try(OutputStream os = new FileOutputStream( new File("save.dasdas"));
				ObjectOutputStream oos = new ObjectOutputStream(os)){
				oos.writeObject(this);
				oos.flush();
		}catch (Exception e) {
				// TODO: handle exception
			}
		}
				
	
	

	public void start() {
		sc = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("1 Додати учасника клубу ");
			System.out.println("2 Додати тваринку до учасника клубу ");
			System.out.println("3 Видалити тваринку з учасника клубу ");
			System.out.println("4 Видалити учасника клубу ");
			System.out
					.println("5 Видалити конкретну тваринку зі всіх власників ");
			System.out.println("6 Вивести на екран зооклуб ");
			System.out.println("7 Вийти з програми ");
			System.out.println("8 zapisat to text file ");
			System.out.println("9 restore fron txt ");
			save();

			switch (sc.next()) {
			case "1": {
				System.out.println("Enter name person");
				String name = sc.next();
				if (map.containsKey(new Person(name))) {
					System.out.println("Allready exist");
				} else {

					System.out.println("Enter  Petname");

					String namePet = sc.next();
					
					Person curent = new Person(name);

					map.put(new Person(name), new ArrayList<Pet>());
					

					map.get(curent).add(new Pet(namePet));

				}
			}

				break;
			case "2":{
				System.out.println("Ener name person for add pet");
				String name = sc.next();
				System.out.println("Enter  Petname");
				String namePet = sc.next();
				Person curent = new Person(name);
				if(!map.containsKey(new Person(name))) {
					System.out.println("nema taogo");
				}else{
					map.get(curent).add(new Pet(namePet));
					
				}}

				break;
			case "3":{
				System.out.println("Ener name person for delete pet");
				String name = sc.next();
				System.out.println("Enter  Petname");
				String namePet = sc.next();
				Person curent = new Person(name);
				Pet curentPet = new Pet(namePet);
				map.get(curent).remove(curentPet);
				
			}

				break;
			case "4":{
				System.out.println("Ener name person for delete person");
				String name = sc.next();
				Person curent = new Person(name);
				map.remove(curent);
				
				
			}
				
				

				break;
			case "5":{
				System.out.println("Enter  Petname for delete pet ");
				String namePet = sc.next();
				Set<Person> keySet = map.keySet();
				for (Person key : keySet) {
					for(Pet pet : map.get(key)){
						map.remove(namePet);
					}
				
				
			}
			}

				break;
			case "6":{
				Set<Person> keySet = map.keySet();
				for (Person key : keySet) {
					for(Pet pet : map.get(key)){
						System.out.println(key+" "+pet);
					}
					if(map.get(key).isEmpty()){
		System.out.println(key);
					}
					}
			}


				break;
			case "7":{
				isRun = false;
			}
			break;
			case "8":{
				System.out.println("Ener file name");
				try(FileWriter fw = new FileWriter(sc.next()+ ".txt")){
					Set<Person> keySet = map.keySet();
					for (Person key : keySet) {
						for(Pet pet : map.get(key)){
							String str = key.getNamePerson()+ " " + pet.getNamePet()+"\n";
							fw.write(str);
						}
						if(map.get(key).isEmpty()){
							String str = key.getNamePerson()+"\n";
							fw.write(str);
						}
						}
					fw.flush();
				}catch (Exception e) {
					// TODO: handle exception
				}
						
			}
			break;
			case "9":{
				System.out.println("ener file name");
				File file = new File(sc.next()+"txt");
				if(file.exists())map.clear();
				try(Scanner scanner = new Scanner(sc.next()+"txt")){
					
					while (scanner.hasNextLine()) {
						String string = (String) scanner.nextLine();
						if(!string.isEmpty()){
							String[] words = string.split(" ");
							Person person = new Person(words [0]);
							if(map.containsKey(person)){
								map.put(person, new ArrayList<Pet>());
							}
							if(words.length>1){
								Pet pet = new Pet(words[1]);
								map.get(person).add(pet);
							}
						}
						
					}
					
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("File not found");
				}
				
				
			}
			
			break;

			default:
				isRun = false;
			}

		}
	}
	
	

}
