package auto;

public class Auto {
	
Color color;
	
	Kermo kermo;
	Kolesa kolesa;
	Kuzov kuzov;
	public Auto(Color color, Kermo kermo, Kolesa kolesa, Kuzov kuzov) {
		super();
		this.color = color;
		this.kermo = kermo;
		this.kolesa = kolesa;
		this.kuzov = kuzov;
	
	
	}
	
	
	

	public boolean isButtons() {
		return kermo.isButtons();
	}




	public void setButtons(boolean buttons) {
		kermo.setButtons(buttons);
	}




	public int getDiametrKermo() {
		return kermo.getDiametrKermo();
	}
	public void setDiametrKermo(int diametrKermo) {
		kermo.setDiametrKermo(diametrKermo);
	}
	public int getDiametrKolesa() {
		return kolesa.getDiametrKolesa();
	}
	public void setDiametrKolesa(int diametrKolesa) {
		kolesa.setDiametrKolesa(diametrKolesa);
	}
	public Gum getTypeGum() {
		return kolesa.getTypeGum();
	}
	public void setTypeGum(Gum typeGum) {
		kolesa.setTypeGum(typeGum);
	}
	public TypeKuzov getTypeKuzov() {
		return kuzov.getTypeKuzov();
	}
	public void setTypeKuzov(TypeKuzov typeKuzov) {
		kuzov.setTypeKuzov(typeKuzov);
	}
	
	public int reSizingKermo(int reSizing) {
		return kermo.reSizingKermo(reSizing);
	}
	public boolean addButtons() {
		return kermo.addButtons();
	}
	public boolean deleteButtons() {
		return kermo.deleteButtons();
	}
	public int reSizingKolesa(int reSizing) {
		return kolesa.reSizingKolesa(reSizing);
	}
	public Gum reGuming(Gum reTypeGum) {
		return kolesa.reGuming(reTypeGum);
	}
	public TypeKuzov changeKuzov(TypeKuzov change) {
		return kuzov.changeKuzov(change);
	}
	
	
	@Override
	public String toString() {
		return "Auto [color=" + color + ", kermo=" + kermo + ", kolesa="
				+ kolesa + ", kuzov=" + kuzov + "]";
	}
	
	
	
	
	
	

	}
