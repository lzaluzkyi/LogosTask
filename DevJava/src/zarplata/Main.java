package zarplata;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zarplata zarplata = new ZarplataHour(25, 250);
		print(zarplata);
		Zarplata zarplata1 = new ZarplataMonth(5000);
		print(zarplata1);
		

	}
	static void print(Zarplata zarplata){
		System.out.println("Mounth = "+ zarplata.zarplata());
	}

}
