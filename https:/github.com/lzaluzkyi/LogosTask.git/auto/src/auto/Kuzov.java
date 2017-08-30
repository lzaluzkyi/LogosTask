package auto;

public class Kuzov {

	
	
	private TypeKuzov typeKuzov;

	public Kuzov(TypeKuzov typeKuzov) {
		super();
		this.typeKuzov = typeKuzov;
	}
	
	public TypeKuzov changeKuzov(TypeKuzov change){
		return typeKuzov = change;
	}

	public TypeKuzov getTypeKuzov() {
		return typeKuzov;
	}

	public void setTypeKuzov(TypeKuzov typeKuzov) {
		this.typeKuzov = typeKuzov;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((typeKuzov == null) ? 0 : typeKuzov.hashCode());
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
		Kuzov other = (Kuzov) obj;
		if (typeKuzov != other.typeKuzov)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kuzov [typeKuzov=" + typeKuzov + "]";
	}
	
	
	
	
	

}
