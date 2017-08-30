package auto;

public class Kermo {

	private int diametrKermo;
	
	private boolean buttons;

	public Kermo(int diametrKermo, boolean buttons) {
		super();
		this.diametrKermo = diametrKermo;
		this.buttons = buttons;
	}
	
	public int reSizingKermo(int reSizing){
		 
		 diametrKermo = reSizing;
		 
		 return diametrKermo;
		 
	 }
	 
	 public boolean addButtons(){
		 
		 return buttons = true;
	 }
	
	
	 public boolean deleteButtons(){
		
		return buttons = false;
	}

	public int getDiametrKermo() {
		return diametrKermo;
	}

	public void setDiametrKermo(int diametrKermo) {
		this.diametrKermo = diametrKermo;
	}

	

	public boolean isButtons() {
		return buttons;
	}

	public void setButtons(boolean buttons) {
		this.buttons = buttons;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (buttons ? 1231 : 1237);
		result = prime * result + diametrKermo;
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
		Kermo other = (Kermo) obj;
		if (buttons != other.buttons)
			return false;
		if (diametrKermo != other.diametrKermo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kermo [diametrKermo=" + diametrKermo + ", buttons=" + buttons
				+ "]";
	}
	
	
	

}
