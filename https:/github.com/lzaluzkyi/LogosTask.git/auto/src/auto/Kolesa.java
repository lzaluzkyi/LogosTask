package auto;

public class Kolesa {

	
	private int diametrKolesa;
	
	private Gum typeGum;

	
	public Kolesa(int diametrKolesa, Gum typeGum) {
		super();
		this.diametrKolesa = diametrKolesa;
		this.typeGum = typeGum;
	}

	
	
	
	public int reSizingKolesa(int reSizing){
		 
		diametrKolesa = reSizing;
		 
		 return diametrKolesa;
		 
	 }
	
	public Gum reGuming(Gum reTypeGum){
		
		
		return typeGum = reTypeGum;
		}




	public int getDiametrKolesa() {
		return diametrKolesa;
	}




	public void setDiametrKolesa(int diametrKolesa) {
		this.diametrKolesa = diametrKolesa;
	}




	public Gum getTypeGum() {
		return typeGum;
	}




	public void setTypeGum(Gum typeGum) {
		this.typeGum = typeGum;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diametrKolesa;
		result = prime * result + ((typeGum == null) ? 0 : typeGum.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kolesa other = (Kolesa) obj;
		if (diametrKolesa != other.diametrKolesa)
			return false;
		if (typeGum != other.typeGum)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Kolesa [diametrKolesa=" + diametrKolesa + ", typeGum="
				+ typeGum + "]";
	}
	
	
	
}
