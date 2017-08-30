package dz;

import java.lang.reflect.Executable;
import java.util.Currency;

public class Car {

	String color;
	String marka;
	double consumption; // rozhid
	double extent; // ob'em
	double run; // probig
	double km; // potribno proihati
	double resul;
	double fuelVolume;
	double fuelmax;
	
	void calculation(){
		
		
	if (extent==0){
		System.out.println("We need reFuel");
		
		
	}
	if (extent != 0){
		resul =	extent / consumption*100-km;
	
	double km;
	km = this.km;}
	
	if (resul>0&&extent!=0){
		System.out.println("We can go");
		run+=km;
		extent= extent - (km*consumption/100);
		System.out.print("wow! we drive" +Math.round(km) + "km ");System.out.println(" ,and we have  "+ Math.round(extent)+"L. fuel");
			System.out.println(" we can drive "+ Math.round((extent/consumption*100)) +"km more");

		}if(resul<=0&&extent!=0){
		
			
			double a=km-Math.abs(resul);
			km = km-Math.abs(resul);
			
			extent= extent - (a*consumption/100);
			System.out.print("we drive   "+Math.round(a)+" km and  " + Math.abs(resul) + "  remaning");
			System.out.println("  and we have  "+ Math.round(extent)+"L. fuel");
			run+=km;
			}
		
			}
		
		
		
	void reFuel(){
		if (fuelVolume>(fuelmax-extent)){
			System.out.println("we can't refuels so much, "+ (fuelVolume-(fuelmax-extent)) +"L. NE POMICHAETSYA");
		}
		for (;extent<fuelmax&&extent<fuelVolume;extent++){}
		
		
			
		
		
		System.out.println("Now we have "+ extent + " L. fuel");
	}
	void distance(){
		System.out.println(color);
		System.out.println(marka);
		System.out.println(run);
		System.out.println(extent);
	}
	
}
