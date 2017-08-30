package zarplata;

public class ZarplataHour implements Zarplata{
	
	
	private final double money;
	
	private final double hour;

	public ZarplataHour(double money, double hour) {
		super();
		this.money = money;
		this.hour = hour;
	}

	public double zarplata() {
		// TODO Auto-generated method stub
		 return money*hour;
	}



	
	
	
	
	


}
