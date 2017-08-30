package pensiya;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age = 23;
		int money = 3000;
		int finaly = 0;
		
		for (; age<65; age++){
			money = finaly;
			finaly = (int) (money*1.16)+3000;
			System.out.println(finaly);
			
			
		}

	}

}
