package dz;

public class less0304 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		System.out.println("zada4a1(1)");
		int[] array = new int[10];	
	   print(array);
	   System.out.println("zada4a1(2)");
	   print2(array);
	  
	   
	   System.out.println("zada4a2(1)");
	   int[] array2 = new int [50];
	   print3(array2);
	   System.out.println("zada4a2(2)");
	   print4(array2);
	   
	  
	   System.out.println("zada4a3)");
	 
	   int[] zadacha3 = new int [15];
	   
	   Zadacha3(zadacha3);
	   checked(zadacha3);
	   
	   System.out.println("zada4a4");
	  
		int[] zadacha4 = new int[8];
		Zadacha4(zadacha4);
		change(zadacha4);

		 System.out.println("zada4a5");

		 int[] mass1 = new int[5];
		 int[] mass2 = new int[5];
		 addMass1(mass1);
		 addMass2(mass2);
		 
		
		
		
		
		
	}	

		static int[] addMass2(int[] mass2){
		
		
		for (int i = 0; i < mass2.length; i++) {
			mass2[i] = random(0, 5);
			System.out.print(mass2[i]+"  ");
			}
		System.out.println();
		
		return mass2;
}
	
	
	static int[] addMass1(int[] mass1){
		
		
		for (int i = 0; i < mass1.length; i++) {
			mass1[i] = random(0, 5);
			System.out.print(mass1[i]+"  ");
			}
		System.out.println();
		
		return mass1;
}
	
	
	
	
	
	static void change(int[] zadacha4) {
		for (int i = 0; i < zadacha4.length; i++) {
			if(zadacha4[i]%2!=0){
				System.out.print("0 ");
			}else{
				System.out.print(zadacha4[i]+" ");
			}
			
		}
		System.out.println();
	}
	
	
	static int[] Zadacha4(int[] zadacha4){
		
		
		for (int i = 0; i < zadacha4.length; i++) {
			zadacha4[i] = random(1, 10);
			System.out.print(zadacha4[i]+" ");
			}
		System.out.println();
		
		return zadacha4;
}
      
	
	
	  static void checked(int[] zadacha3){
		 for (int i = 0; i < zadacha3.length; i++) {
			 if(zadacha3[i]%2==0&zadacha3[i]!=0){
				 
			 System.out.print(zadacha3[i]+"  ");
			 }else{
				 System.out.print("   ");
			 }
			
		}
		 System.out.println();
		}
	  
	    

	static int[] Zadacha3(int[] zadacha3){
		
			
			for (int i = 0; i < zadacha3.length; i++) {
				zadacha3[i] = random(0, 9);
				System.out.print(zadacha3[i]+"  ");
				}
			System.out.println();
			
			return zadacha3;
	}
	static int random(int min, int max){
		return (int) Math.round(Math.random()*(max-min)+min);
	}
	
	
	
	
	static void print4(int[]array2){
		int a = 99;
		for (int i = 0; i < array2.length; i++) {
			
			 array2[i]=a;
	         a=a-2;
			 System.out.print(array2[i]+" ");
				
		}
		System.out.println();

	}

	
	
	static void print3(int[]array2){
		int a = 1;
		for (int i = 0; i < array2.length; i++) {
			
			 array2[i]=a;
	         a=a+2;
			 System.out.print(array2[i]+" ");
				
		}
		System.out.println();

	}

	
	
	
	
	
	static void print2(int[] array){
		int a = 2;
		for (int i = 0; i < array.length; i++) {
			
			 array[i]=a;
	         a=a+2;
			 System.out.println(array[i]+" ");
				
		}
		
	}

	
	
	static void print(int[] array){
		int a = 2;
		for (int i = 0; i < array.length; i++) {
			
			 array[i]=a;
	         a=a+2;
			 System.out.print(array[i]+" ");
				
		}
		System.out.println();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
