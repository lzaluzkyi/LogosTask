package zooclub;

import java.io.Serializable;

public class Pet implements Serializable{
	
	private String namePet;

	public Pet(String namePet) {
		super();
		this.namePet = namePet;
	}

	public String getNamePet() {
		return namePet;
	}

	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((namePet == null) ? 0 : namePet.hashCode());
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
		Pet other = (Pet) obj;
		if (namePet == null) {
			if (other.namePet != null)
				return false;
		} else if (!namePet.equals(other.namePet))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pet [namePet=" + namePet + "]";
	}
	
	
	
	

}
