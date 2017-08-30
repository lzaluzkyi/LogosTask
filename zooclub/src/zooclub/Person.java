package zooclub;

import java.io.Serializable;

public class Person implements Serializable{
	
	private String namePerson;

	public Person(String namePerson) {
		super();
		this.namePerson = namePerson;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((namePerson == null) ? 0 : namePerson.hashCode());
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
		Person other = (Person) obj;
		if (namePerson == null) {
			if (other.namePerson != null)
				return false;
		} else if (!namePerson.equals(other.namePerson))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [namePerson=" + namePerson + "]";
	}
	
	
	
	

}
